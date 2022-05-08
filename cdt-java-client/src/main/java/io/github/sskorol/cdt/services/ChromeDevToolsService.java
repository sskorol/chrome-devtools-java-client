package io.github.sskorol.cdt.services;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2022 Sergey Korol
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import static io.github.sskorol.cdt.services.utils.ProxyUtils.createProxy;
import static io.github.sskorol.cdt.services.utils.ProxyUtils.createProxyFromAbstract;

import io.github.sskorol.cdt.protocol.ChromeDevTools;
import io.github.sskorol.cdt.protocol.support.types.EventHandler;
import io.github.sskorol.cdt.protocol.support.types.EventListener;
import io.github.sskorol.cdt.services.config.ChromeDevToolsServiceConfiguration;
import io.github.sskorol.cdt.services.exceptions.ChromeDevToolsInvocationException;
import io.github.sskorol.cdt.services.exceptions.WebSocketServiceException;
import io.github.sskorol.cdt.services.impl.ChromeDevToolsServiceImpl;
import io.github.sskorol.cdt.services.impl.WebSocketServiceImpl;
import io.github.sskorol.cdt.services.invocation.CommandInvocationHandler;
import io.github.sskorol.cdt.services.types.MethodInvocation;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Chrome dev tools service.
 *
 * @author Kenan Klisura
 */
public interface ChromeDevToolsService extends ChromeDevTools, AutoCloseable {

  /**
   * Invokes a dev tools method. If your return types is a generics please use {@link
   * #invoke(String, Class, Class[], MethodInvocation)}.
   *
   * <p>This method is deprecated and might be removed in future.
   *
   * @param returnProperty Return property.
   * @param clazz Return class type.
   * @param methodInvocation Method invocation definition.
   * @param <T> Type of a return class.
   * @return Return object.
   * @throws ChromeDevToolsInvocationException If invocation fails.
   * @deprecated Please use {@link #invoke(String, Class, Class[], MethodInvocation)}
   */
  @Deprecated
  <T> T invoke(String returnProperty, Class<T> clazz, MethodInvocation methodInvocation);

  /**
   * Invokes a dev tools method.
   *
   * @param returnProperty Return property.
   * @param clazz Return class type.
   * @param returnTypeClasses List of class to which returnType is parametrized with.
   * @param methodInvocation Method invocation definition.
   * @param <T> Type of a return class.
   * @return Return object.
   * @throws ChromeDevToolsInvocationException If invocation fails.
   */
  <T> T invoke(
      String returnProperty,
      Class<T> clazz,
      Class<?>[] returnTypeClasses,
      MethodInvocation methodInvocation);

  /** Closes the dev tools service. */
  void close();

  /**
   * Returns true if devtools is closed.
   *
   * @return True if its closed.
   */
  boolean isClosed();

  /** Waits until devtools is closed. */
  void waitUntilClosed();

  /**
   * Adds an event listener on a given event name belonging to some domain.
   *
   * @param domainName Domain.
   * @param eventName Event.
   * @param eventHandler Event handler.
   * @param eventType Event type.
   * @return Event listener.
   */
  EventListener addEventListener(
      String domainName, String eventName, EventHandler eventHandler, Class<?> eventType);

  /**
   * Removes an event listener.
   *
   * @param eventListener Event listener.
   */
  void removeEventListener(EventListener eventListener);

  /**
   * Creates ChromeDevToolsService instance based on existing websocket.
   *
   * @param webSocketURI CDP WS URI.
   */
  static ChromeDevToolsService from(final String webSocketURI)
      throws URISyntaxException, WebSocketServiceException {
    return from(WebSocketServiceImpl.create(new URI(webSocketURI)));
  }

  /**
   * Creates ChromeDevToolsService instance based on existing websocket.
   *
   * @param webSocketService CDP WS instance.
   */
  static ChromeDevToolsService from(final WebSocketService webSocketService) {
    final CommandInvocationHandler invocationHandler = new CommandInvocationHandler();
    final Map<Method, Object> commandsCache = new ConcurrentHashMap<>();
    final ChromeDevToolsService devtools =
        createProxyFromAbstract(
            ChromeDevToolsServiceImpl.class,
            new Class[] {WebSocketService.class, ChromeDevToolsServiceConfiguration.class},
            new Object[] {webSocketService, new ChromeDevToolsServiceConfiguration()},
            (unused, method, args) ->
                commandsCache.computeIfAbsent(
                    method, key -> createProxy(method.getReturnType(), invocationHandler)));
    invocationHandler.setChromeDevToolsService(devtools);
    return devtools;
  }
}

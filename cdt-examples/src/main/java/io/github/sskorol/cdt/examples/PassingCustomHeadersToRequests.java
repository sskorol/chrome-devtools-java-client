package io.github.sskorol.cdt.examples;

/*-
 * #%L
 * cdt-examples
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

import io.github.sskorol.cdt.launch.ChromeLauncher;
import io.github.sskorol.cdt.protocol.commands.Network;
import io.github.sskorol.cdt.protocol.commands.Page;
import io.github.sskorol.cdt.protocol.types.network.RequestPattern;
import io.github.sskorol.cdt.services.ChromeDevToolsService;
import io.github.sskorol.cdt.services.ChromeService;
import io.github.sskorol.cdt.services.types.ChromeTab;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This is an example on how to pass header to a intercepted requests. A 'Custom-Header' with
 * 'Value' is passed on every request.
 *
 * @author Kenan Klisura
 */
public class PassingCustomHeadersToRequests {
  public static void main(String[] args) {
    // Create chrome launcher.
    final ChromeLauncher launcher = new ChromeLauncher();

    // Launch chrome either as headless (true) or regular (false).
    final ChromeService chromeService = launcher.launch(false);

    // Create empty tab ie about:blank.
    final ChromeTab tab = chromeService.createTab();

    // Get DevTools service to this tab
    final ChromeDevToolsService devToolsService = chromeService.createDevToolsService(tab);

    // Get individual commands
    final Page page = devToolsService.getPage();
    final Network network = devToolsService.getNetwork();

    network.onRequestIntercepted(
        event -> {
          String interceptionId = event.getInterceptionId();

          System.out.printf(
              "Adding header to %s request%s", event.getRequest().getUrl(), System.lineSeparator());

          Map<String, Object> headers = new HashMap<>();
          headers.put("Custom-Header", "Value");

          network.continueInterceptedRequest(
              interceptionId, null, null, null, null, null, headers, null);
        });

    RequestPattern interceptionRequestPattern = new RequestPattern();
    network.setRequestInterception(Collections.singletonList(interceptionRequestPattern));
    network.enable();

    // Enable page events.
    page.enable();

    // Navigate to github.com.
    page.navigate("http://github.com");

    devToolsService.waitUntilClosed();
  }
}

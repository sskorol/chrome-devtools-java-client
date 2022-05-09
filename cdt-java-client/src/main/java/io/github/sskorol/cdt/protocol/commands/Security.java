package io.github.sskorol.cdt.protocol.commands;

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

import io.github.sskorol.cdt.protocol.events.security.CertificateError;
import io.github.sskorol.cdt.protocol.events.security.SecurityStateChanged;
import io.github.sskorol.cdt.protocol.events.security.VisibleSecurityStateChanged;
import io.github.sskorol.cdt.protocol.support.annotations.EventName;
import io.github.sskorol.cdt.protocol.support.annotations.Experimental;
import io.github.sskorol.cdt.protocol.support.annotations.ParamName;
import io.github.sskorol.cdt.protocol.support.types.EventHandler;
import io.github.sskorol.cdt.protocol.support.types.EventListener;
import io.github.sskorol.cdt.protocol.types.security.CertificateErrorAction;

/** Security */
public interface Security {

  /** Disables tracking security state changes. */
  void disable();

  /** Enables tracking security state changes. */
  void enable();

  /**
   * Enable/disable whether all certificate errors should be ignored.
   *
   * @param ignore If true, all certificate errors will be ignored.
   */
  @Experimental
  void setIgnoreCertificateErrors(@ParamName("ignore") Boolean ignore);

  /**
   * Handles a certificate error that fired a certificateError event.
   *
   * @param eventId The ID of the event.
   * @param action The action to take on the certificate error.
   */
  @Deprecated
  void handleCertificateError(
      @ParamName("eventId") Integer eventId, @ParamName("action") CertificateErrorAction action);

  /**
   * Enable/disable overriding certificate errors. If enabled, all certificate error events need to
   * be handled by the DevTools client and should be answered with `handleCertificateError`
   * commands.
   *
   * @param override If true, certificate errors will be overridden.
   */
  @Deprecated
  void setOverrideCertificateErrors(@ParamName("override") Boolean override);

  /**
   * There is a certificate error. If overriding certificate errors is enabled, then it should be
   * handled with the `handleCertificateError` command. Note: this event does not fire if the
   * certificate error has been allowed internally. Only one client per target should override
   * certificate errors at the same time.
   */
  @EventName("certificateError")
  @Deprecated
  EventListener onCertificateError(EventHandler<CertificateError> eventListener);

  /** The security state of the page changed. */
  @EventName("visibleSecurityStateChanged")
  @Experimental
  EventListener onVisibleSecurityStateChanged(
      EventHandler<VisibleSecurityStateChanged> eventListener);

  /** The security state of the page changed. No longer being sent. */
  @EventName("securityStateChanged")
  @Deprecated
  EventListener onSecurityStateChanged(EventHandler<SecurityStateChanged> eventListener);
}

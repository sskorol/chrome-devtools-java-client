package io.github.sskorol.cdt.protocol.events.network;

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

import io.github.sskorol.cdt.protocol.support.annotations.Experimental;
import io.github.sskorol.cdt.protocol.support.annotations.Optional;
import io.github.sskorol.cdt.protocol.types.network.BlockedCookieWithReason;
import io.github.sskorol.cdt.protocol.types.network.ClientSecurityState;
import io.github.sskorol.cdt.protocol.types.network.ConnectTiming;
import java.util.List;
import java.util.Map;

/**
 * Fired when additional information about a requestWillBeSent event is available from the network
 * stack. Not every requestWillBeSent event will have an additional requestWillBeSentExtraInfo fired
 * for it, and there is no guarantee whether requestWillBeSent or requestWillBeSentExtraInfo will be
 * fired first for the same request.
 */
@Experimental
public class RequestWillBeSentExtraInfo {

  private String requestId;

  private List<BlockedCookieWithReason> associatedCookies;

  private Map<String, Object> headers;

  @Experimental private ConnectTiming connectTiming;

  @Optional private ClientSecurityState clientSecurityState;

  /** Request identifier. Used to match this information to an existing requestWillBeSent event. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. Used to match this information to an existing requestWillBeSent event. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * A list of cookies potentially associated to the requested URL. This includes both cookies sent
   * with the request and the ones not sent; the latter are distinguished by having blockedReason
   * field set.
   */
  public List<BlockedCookieWithReason> getAssociatedCookies() {
    return associatedCookies;
  }

  /**
   * A list of cookies potentially associated to the requested URL. This includes both cookies sent
   * with the request and the ones not sent; the latter are distinguished by having blockedReason
   * field set.
   */
  public void setAssociatedCookies(List<BlockedCookieWithReason> associatedCookies) {
    this.associatedCookies = associatedCookies;
  }

  /** Raw request headers as they will be sent over the wire. */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /** Raw request headers as they will be sent over the wire. */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  /** Connection timing information for the request. */
  public ConnectTiming getConnectTiming() {
    return connectTiming;
  }

  /** Connection timing information for the request. */
  public void setConnectTiming(ConnectTiming connectTiming) {
    this.connectTiming = connectTiming;
  }

  /** The client security state set for the request. */
  public ClientSecurityState getClientSecurityState() {
    return clientSecurityState;
  }

  /** The client security state set for the request. */
  public void setClientSecurityState(ClientSecurityState clientSecurityState) {
    this.clientSecurityState = clientSecurityState;
  }
}

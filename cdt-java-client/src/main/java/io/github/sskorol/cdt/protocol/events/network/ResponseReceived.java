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
import io.github.sskorol.cdt.protocol.types.network.ResourceType;
import io.github.sskorol.cdt.protocol.types.network.Response;

/** Fired when HTTP response is available. */
public class ResponseReceived {

  private String requestId;

  private String loaderId;

  private Double timestamp;

  private ResourceType type;

  private Response response;

  @Experimental private Boolean hasExtraInfo;

  @Optional private String frameId;

  /** Request identifier. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** Loader identifier. Empty string if the request is fetched from worker. */
  public String getLoaderId() {
    return loaderId;
  }

  /** Loader identifier. Empty string if the request is fetched from worker. */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /** Timestamp. */
  public Double getTimestamp() {
    return timestamp;
  }

  /** Timestamp. */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /** Resource type. */
  public ResourceType getType() {
    return type;
  }

  /** Resource type. */
  public void setType(ResourceType type) {
    this.type = type;
  }

  /** Response data. */
  public Response getResponse() {
    return response;
  }

  /** Response data. */
  public void setResponse(Response response) {
    this.response = response;
  }

  /**
   * Indicates whether requestWillBeSentExtraInfo and responseReceivedExtraInfo events will be or
   * were emitted for this request.
   */
  public Boolean getHasExtraInfo() {
    return hasExtraInfo;
  }

  /**
   * Indicates whether requestWillBeSentExtraInfo and responseReceivedExtraInfo events will be or
   * were emitted for this request.
   */
  public void setHasExtraInfo(Boolean hasExtraInfo) {
    this.hasExtraInfo = hasExtraInfo;
  }

  /** Frame identifier. */
  public String getFrameId() {
    return frameId;
  }

  /** Frame identifier. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }
}

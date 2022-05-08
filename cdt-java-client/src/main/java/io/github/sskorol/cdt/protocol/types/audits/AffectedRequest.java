package io.github.sskorol.cdt.protocol.types.audits;

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

import io.github.sskorol.cdt.protocol.support.annotations.Optional;

/** Information about a request that is affected by an inspector issue. */
public class AffectedRequest {

  private String requestId;

  @Optional private String url;

  /** The unique request id. */
  public String getRequestId() {
    return requestId;
  }

  /** The unique request id. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
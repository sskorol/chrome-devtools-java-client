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
import io.github.sskorol.cdt.protocol.types.network.ReportingApiEndpoint;
import java.util.List;

@Experimental
public class ReportingApiEndpointsChangedForOrigin {

  private String origin;

  private List<ReportingApiEndpoint> endpoints;

  /** Origin of the document(s) which configured the endpoints. */
  public String getOrigin() {
    return origin;
  }

  /** Origin of the document(s) which configured the endpoints. */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public List<ReportingApiEndpoint> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<ReportingApiEndpoint> endpoints) {
    this.endpoints = endpoints;
  }
}

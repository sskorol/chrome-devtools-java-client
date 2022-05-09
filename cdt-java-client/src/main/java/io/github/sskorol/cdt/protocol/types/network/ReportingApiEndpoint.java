package io.github.sskorol.cdt.protocol.types.network;

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

@Experimental
public class ReportingApiEndpoint {

  private String url;

  private String groupName;

  /** The URL of the endpoint to which reports may be delivered. */
  public String getUrl() {
    return url;
  }

  /** The URL of the endpoint to which reports may be delivered. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Name of the endpoint group. */
  public String getGroupName() {
    return groupName;
  }

  /** Name of the endpoint group. */
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }
}

package io.github.sskorol.cdt.protocol.events.storage;

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

import io.github.sskorol.cdt.protocol.types.storage.InterestGroupAccessType;

/** One of the interest groups was accessed by the associated page. */
public class InterestGroupAccessed {

  private Double accessTime;

  private InterestGroupAccessType type;

  private String ownerOrigin;

  private String name;

  public Double getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(Double accessTime) {
    this.accessTime = accessTime;
  }

  public InterestGroupAccessType getType() {
    return type;
  }

  public void setType(InterestGroupAccessType type) {
    this.type = type;
  }

  public String getOwnerOrigin() {
    return ownerOrigin;
  }

  public void setOwnerOrigin(String ownerOrigin) {
    this.ownerOrigin = ownerOrigin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

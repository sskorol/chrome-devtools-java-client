package io.github.sskorol.cdt.protocol.types.domsnapshot;

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

import java.util.List;

/** A subset of the full ComputedStyle as defined by the request whitelist. */
public class ComputedStyle {

  private List<NameValue> properties;

  /** Name/value pairs of computed style properties. */
  public List<NameValue> getProperties() {
    return properties;
  }

  /** Name/value pairs of computed style properties. */
  public void setProperties(List<NameValue> properties) {
    this.properties = properties;
  }
}

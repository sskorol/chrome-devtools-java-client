package io.github.sskorol.cdt.protocol.types.page;

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
public class InstallabilityErrorArgument {

  private String name;

  private String value;

  /** Argument name (e.g. name:'minimum-icon-size-in-pixels'). */
  public String getName() {
    return name;
  }

  /** Argument name (e.g. name:'minimum-icon-size-in-pixels'). */
  public void setName(String name) {
    this.name = name;
  }

  /** Argument value (e.g. value:'64'). */
  public String getValue() {
    return value;
  }

  /** Argument value (e.g. value:'64'). */
  public void setValue(String value) {
    this.value = value;
  }
}

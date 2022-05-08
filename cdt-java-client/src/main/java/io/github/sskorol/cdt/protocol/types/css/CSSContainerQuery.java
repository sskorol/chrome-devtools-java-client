package io.github.sskorol.cdt.protocol.types.css;

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

/** CSS container query rule descriptor. */
@Experimental
public class CSSContainerQuery {

  private String text;

  @Optional private SourceRange range;

  @Optional private String styleSheetId;

  @Optional private String name;

  /** Container query text. */
  public String getText() {
    return text;
  }

  /** Container query text. */
  public void setText(String text) {
    this.text = text;
  }

  /** The associated rule header range in the enclosing stylesheet (if available). */
  public SourceRange getRange() {
    return range;
  }

  /** The associated rule header range in the enclosing stylesheet (if available). */
  public void setRange(SourceRange range) {
    this.range = range;
  }

  /** Identifier of the stylesheet containing this object (if exists). */
  public String getStyleSheetId() {
    return styleSheetId;
  }

  /** Identifier of the stylesheet containing this object (if exists). */
  public void setStyleSheetId(String styleSheetId) {
    this.styleSheetId = styleSheetId;
  }

  /** Optional name for the container. */
  public String getName() {
    return name;
  }

  /** Optional name for the container. */
  public void setName(String name) {
    this.name = name;
  }
}

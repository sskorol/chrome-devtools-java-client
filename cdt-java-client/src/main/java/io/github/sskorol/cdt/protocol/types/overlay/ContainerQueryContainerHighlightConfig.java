package io.github.sskorol.cdt.protocol.types.overlay;

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

public class ContainerQueryContainerHighlightConfig {

  @Optional private LineStyle containerBorder;

  @Optional private LineStyle descendantBorder;

  /** The style of the container border. */
  public LineStyle getContainerBorder() {
    return containerBorder;
  }

  /** The style of the container border. */
  public void setContainerBorder(LineStyle containerBorder) {
    this.containerBorder = containerBorder;
  }

  /** The style of the descendants' borders. */
  public LineStyle getDescendantBorder() {
    return descendantBorder;
  }

  /** The style of the descendants' borders. */
  public void setDescendantBorder(LineStyle descendantBorder) {
    this.descendantBorder = descendantBorder;
  }
}

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

public class ContainerQueryHighlightConfig {

  private ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig;

  private Integer nodeId;

  /** A descriptor for the highlight appearance of container query containers. */
  public ContainerQueryContainerHighlightConfig getContainerQueryContainerHighlightConfig() {
    return containerQueryContainerHighlightConfig;
  }

  /** A descriptor for the highlight appearance of container query containers. */
  public void setContainerQueryContainerHighlightConfig(
      ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig) {
    this.containerQueryContainerHighlightConfig = containerQueryContainerHighlightConfig;
  }

  /** Identifier of the container node to highlight. */
  public Integer getNodeId() {
    return nodeId;
  }

  /** Identifier of the container node to highlight. */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}

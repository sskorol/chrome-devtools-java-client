package io.github.sskorol.cdt.protocol.events.layertree;

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
import io.github.sskorol.cdt.protocol.types.layertree.Layer;
import java.util.List;

public class LayerTreeDidChange {

  @Optional private List<Layer> layers;

  /** Layer tree, absent if not in the comspositing mode. */
  public List<Layer> getLayers() {
    return layers;
  }

  /** Layer tree, absent if not in the comspositing mode. */
  public void setLayers(List<Layer> layers) {
    this.layers = layers;
  }
}

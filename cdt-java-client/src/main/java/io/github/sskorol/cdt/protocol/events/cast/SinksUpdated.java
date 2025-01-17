package io.github.sskorol.cdt.protocol.events.cast;

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

import io.github.sskorol.cdt.protocol.types.cast.Sink;
import java.util.List;

/**
 * This is fired whenever the list of available sinks changes. A sink is a device or a software
 * surface that you can cast to.
 */
public class SinksUpdated {

  private List<Sink> sinks;

  public List<Sink> getSinks() {
    return sinks;
  }

  public void setSinks(List<Sink> sinks) {
    this.sinks = sinks;
  }
}

package io.github.sskorol.cdt.protocol.events.animation;

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

/** Event for when an animation has been cancelled. */
public class AnimationCanceled {

  private String id;

  /** Id of the animation that was cancelled. */
  public String getId() {
    return id;
  }

  /** Id of the animation that was cancelled. */
  public void setId(String id) {
    this.id = id;
  }
}

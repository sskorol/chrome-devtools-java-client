package io.github.sskorol.cdt.protocol.events.page;

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

import io.github.sskorol.cdt.protocol.types.page.PrerenderFinalStatus;

/** Fired when a prerender attempt is completed. */
public class PrerenderAttemptCompleted {

  private String initiatingFrameId;

  private String prerenderingUrl;

  private PrerenderFinalStatus finalStatus;

  /** The frame id of the frame initiating prerendering. */
  public String getInitiatingFrameId() {
    return initiatingFrameId;
  }

  /** The frame id of the frame initiating prerendering. */
  public void setInitiatingFrameId(String initiatingFrameId) {
    this.initiatingFrameId = initiatingFrameId;
  }

  public String getPrerenderingUrl() {
    return prerenderingUrl;
  }

  public void setPrerenderingUrl(String prerenderingUrl) {
    this.prerenderingUrl = prerenderingUrl;
  }

  public PrerenderFinalStatus getFinalStatus() {
    return finalStatus;
  }

  public void setFinalStatus(PrerenderFinalStatus finalStatus) {
    this.finalStatus = finalStatus;
  }
}

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

import io.github.sskorol.cdt.protocol.support.annotations.Experimental;

/**
 * Fired when page is about to start a download. Deprecated. Use Browser.downloadWillBegin instead.
 */
@Experimental
@Deprecated
public class DownloadWillBegin {

  private String frameId;

  private String guid;

  private String url;

  private String suggestedFilename;

  /** Id of the frame that caused download to begin. */
  public String getFrameId() {
    return frameId;
  }

  /** Id of the frame that caused download to begin. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** Global unique identifier of the download. */
  public String getGuid() {
    return guid;
  }

  /** Global unique identifier of the download. */
  public void setGuid(String guid) {
    this.guid = guid;
  }

  /** URL of the resource being downloaded. */
  public String getUrl() {
    return url;
  }

  /** URL of the resource being downloaded. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Suggested file name of the resource (the actual name of the file saved on disk may differ). */
  public String getSuggestedFilename() {
    return suggestedFilename;
  }

  /** Suggested file name of the resource (the actual name of the file saved on disk may differ). */
  public void setSuggestedFilename(String suggestedFilename) {
    this.suggestedFilename = suggestedFilename;
  }
}

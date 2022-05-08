package io.github.sskorol.cdt.protocol.types.audits;

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

/** Depending on the concrete errorType, different properties are set. */
public class GenericIssueDetails {

  private GenericIssueErrorType errorType;

  @Optional private String frameId;

  /** Issues with the same errorType are aggregated in the frontend. */
  public GenericIssueErrorType getErrorType() {
    return errorType;
  }

  /** Issues with the same errorType are aggregated in the frontend. */
  public void setErrorType(GenericIssueErrorType errorType) {
    this.errorType = errorType;
  }

  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }
}

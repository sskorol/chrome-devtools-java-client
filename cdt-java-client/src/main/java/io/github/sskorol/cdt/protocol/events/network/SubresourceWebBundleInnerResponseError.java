package io.github.sskorol.cdt.protocol.events.network;

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

/** Fired when request for resources within a .wbn file failed. */
@Experimental
public class SubresourceWebBundleInnerResponseError {

  private String innerRequestId;

  private String innerRequestURL;

  private String errorMessage;

  @Optional private String bundleRequestId;

  /** Request identifier of the subresource request */
  public String getInnerRequestId() {
    return innerRequestId;
  }

  /** Request identifier of the subresource request */
  public void setInnerRequestId(String innerRequestId) {
    this.innerRequestId = innerRequestId;
  }

  /** URL of the subresource resource. */
  public String getInnerRequestURL() {
    return innerRequestURL;
  }

  /** URL of the subresource resource. */
  public void setInnerRequestURL(String innerRequestURL) {
    this.innerRequestURL = innerRequestURL;
  }

  /** Error message */
  public String getErrorMessage() {
    return errorMessage;
  }

  /** Error message */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Bundle request identifier. Used to match this information to another event. This made be absent
   * in case when the instrumentation was enabled only after webbundle was parsed.
   */
  public String getBundleRequestId() {
    return bundleRequestId;
  }

  /**
   * Bundle request identifier. Used to match this information to another event. This made be absent
   * in case when the instrumentation was enabled only after webbundle was parsed.
   */
  public void setBundleRequestId(String bundleRequestId) {
    this.bundleRequestId = bundleRequestId;
  }
}

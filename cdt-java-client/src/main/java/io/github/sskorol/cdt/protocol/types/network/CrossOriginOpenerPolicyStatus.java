package io.github.sskorol.cdt.protocol.types.network;

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

@Experimental
public class CrossOriginOpenerPolicyStatus {

  private CrossOriginOpenerPolicyValue value;

  private CrossOriginOpenerPolicyValue reportOnlyValue;

  @Optional private String reportingEndpoint;

  @Optional private String reportOnlyReportingEndpoint;

  public CrossOriginOpenerPolicyValue getValue() {
    return value;
  }

  public void setValue(CrossOriginOpenerPolicyValue value) {
    this.value = value;
  }

  public CrossOriginOpenerPolicyValue getReportOnlyValue() {
    return reportOnlyValue;
  }

  public void setReportOnlyValue(CrossOriginOpenerPolicyValue reportOnlyValue) {
    this.reportOnlyValue = reportOnlyValue;
  }

  public String getReportingEndpoint() {
    return reportingEndpoint;
  }

  public void setReportingEndpoint(String reportingEndpoint) {
    this.reportingEndpoint = reportingEndpoint;
  }

  public String getReportOnlyReportingEndpoint() {
    return reportOnlyReportingEndpoint;
  }

  public void setReportOnlyReportingEndpoint(String reportOnlyReportingEndpoint) {
    this.reportOnlyReportingEndpoint = reportOnlyReportingEndpoint;
  }
}

package io.github.sskorol.cdt.protocol.types.debugger;

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
import io.github.sskorol.cdt.protocol.types.runtime.RemoteObject;
import java.util.List;

/** JavaScript call frame. Array of call frames form the call stack. */
public class CallFrame {

  private String callFrameId;

  private String functionName;

  @Optional private Location functionLocation;

  private Location location;

  @Deprecated private String url;

  private List<Scope> scopeChain;

  private RemoteObject that;

  @Optional private RemoteObject returnValue;

  @Experimental @Optional private Boolean canBeRestarted;

  /** Call frame identifier. This identifier is only valid while the virtual machine is paused. */
  public String getCallFrameId() {
    return callFrameId;
  }

  /** Call frame identifier. This identifier is only valid while the virtual machine is paused. */
  public void setCallFrameId(String callFrameId) {
    this.callFrameId = callFrameId;
  }

  /** Name of the JavaScript function called on this call frame. */
  public String getFunctionName() {
    return functionName;
  }

  /** Name of the JavaScript function called on this call frame. */
  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  /** Location in the source code. */
  public Location getFunctionLocation() {
    return functionLocation;
  }

  /** Location in the source code. */
  public void setFunctionLocation(Location functionLocation) {
    this.functionLocation = functionLocation;
  }

  /** Location in the source code. */
  public Location getLocation() {
    return location;
  }

  /** Location in the source code. */
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * JavaScript script name or url. Deprecated in favor of using the `location.scriptId` to resolve
   * the URL via a previously sent `Debugger.scriptParsed` event.
   */
  public String getUrl() {
    return url;
  }

  /**
   * JavaScript script name or url. Deprecated in favor of using the `location.scriptId` to resolve
   * the URL via a previously sent `Debugger.scriptParsed` event.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Scope chain for this call frame. */
  public List<Scope> getScopeChain() {
    return scopeChain;
  }

  /** Scope chain for this call frame. */
  public void setScopeChain(List<Scope> scopeChain) {
    this.scopeChain = scopeChain;
  }

  /** `this` object for this call frame. */
  public RemoteObject getThat() {
    return that;
  }

  /** `this` object for this call frame. */
  public void setThat(RemoteObject that) {
    this.that = that;
  }

  /** The value being returned, if the function is at return point. */
  public RemoteObject getReturnValue() {
    return returnValue;
  }

  /** The value being returned, if the function is at return point. */
  public void setReturnValue(RemoteObject returnValue) {
    this.returnValue = returnValue;
  }

  /**
   * Valid only while the VM is paused and indicates whether this frame can be restarted or not.
   * Note that a `true` value here does not guarantee that Debugger#restartFrame with this
   * CallFrameId will be successful, but it is very likely.
   */
  public Boolean getCanBeRestarted() {
    return canBeRestarted;
  }

  /**
   * Valid only while the VM is paused and indicates whether this frame can be restarted or not.
   * Note that a `true` value here does not guarantee that Debugger#restartFrame with this
   * CallFrameId will be successful, but it is very likely.
   */
  public void setCanBeRestarted(Boolean canBeRestarted) {
    this.canBeRestarted = canBeRestarted;
  }
}

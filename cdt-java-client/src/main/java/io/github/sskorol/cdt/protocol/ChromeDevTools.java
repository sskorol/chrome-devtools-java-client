package io.github.sskorol.cdt.protocol;

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

import io.github.sskorol.cdt.protocol.commands.Accessibility;
import io.github.sskorol.cdt.protocol.commands.Animation;
import io.github.sskorol.cdt.protocol.commands.Audits;
import io.github.sskorol.cdt.protocol.commands.BackgroundService;
import io.github.sskorol.cdt.protocol.commands.Browser;
import io.github.sskorol.cdt.protocol.commands.CSS;
import io.github.sskorol.cdt.protocol.commands.CacheStorage;
import io.github.sskorol.cdt.protocol.commands.Cast;
import io.github.sskorol.cdt.protocol.commands.Console;
import io.github.sskorol.cdt.protocol.commands.DOM;
import io.github.sskorol.cdt.protocol.commands.DOMDebugger;
import io.github.sskorol.cdt.protocol.commands.DOMSnapshot;
import io.github.sskorol.cdt.protocol.commands.DOMStorage;
import io.github.sskorol.cdt.protocol.commands.Database;
import io.github.sskorol.cdt.protocol.commands.Debugger;
import io.github.sskorol.cdt.protocol.commands.DeviceOrientation;
import io.github.sskorol.cdt.protocol.commands.Emulation;
import io.github.sskorol.cdt.protocol.commands.EventBreakpoints;
import io.github.sskorol.cdt.protocol.commands.Fetch;
import io.github.sskorol.cdt.protocol.commands.HeadlessExperimental;
import io.github.sskorol.cdt.protocol.commands.HeapProfiler;
import io.github.sskorol.cdt.protocol.commands.IO;
import io.github.sskorol.cdt.protocol.commands.IndexedDB;
import io.github.sskorol.cdt.protocol.commands.Input;
import io.github.sskorol.cdt.protocol.commands.Inspector;
import io.github.sskorol.cdt.protocol.commands.LayerTree;
import io.github.sskorol.cdt.protocol.commands.Log;
import io.github.sskorol.cdt.protocol.commands.Media;
import io.github.sskorol.cdt.protocol.commands.Memory;
import io.github.sskorol.cdt.protocol.commands.Network;
import io.github.sskorol.cdt.protocol.commands.Overlay;
import io.github.sskorol.cdt.protocol.commands.Page;
import io.github.sskorol.cdt.protocol.commands.Performance;
import io.github.sskorol.cdt.protocol.commands.PerformanceTimeline;
import io.github.sskorol.cdt.protocol.commands.Profiler;
import io.github.sskorol.cdt.protocol.commands.Runtime;
import io.github.sskorol.cdt.protocol.commands.Schema;
import io.github.sskorol.cdt.protocol.commands.Security;
import io.github.sskorol.cdt.protocol.commands.ServiceWorker;
import io.github.sskorol.cdt.protocol.commands.Storage;
import io.github.sskorol.cdt.protocol.commands.SystemInfo;
import io.github.sskorol.cdt.protocol.commands.Target;
import io.github.sskorol.cdt.protocol.commands.Tethering;
import io.github.sskorol.cdt.protocol.commands.Tracing;
import io.github.sskorol.cdt.protocol.commands.WebAudio;
import io.github.sskorol.cdt.protocol.commands.WebAuthn;

public interface ChromeDevTools {

  /** Returns the Console command. */
  Console getConsole();

  /** Returns the Debugger command. */
  Debugger getDebugger();

  /** Returns the HeapProfiler command. */
  HeapProfiler getHeapProfiler();

  /** Returns the Profiler command. */
  Profiler getProfiler();

  /** Returns the Runtime command. */
  Runtime getRuntime();

  /** Returns the Schema command. */
  Schema getSchema();

  /** Returns the Accessibility command. */
  Accessibility getAccessibility();

  /** Returns the Animation command. */
  Animation getAnimation();

  /** Returns the Audits command. */
  Audits getAudits();

  /** Returns the BackgroundService command. */
  BackgroundService getBackgroundService();

  /** Returns the Browser command. */
  Browser getBrowser();

  /** Returns the CSS command. */
  CSS getCSS();

  /** Returns the CacheStorage command. */
  CacheStorage getCacheStorage();

  /** Returns the Cast command. */
  Cast getCast();

  /** Returns the DOM command. */
  DOM getDOM();

  /** Returns the DOMDebugger command. */
  DOMDebugger getDOMDebugger();

  /** Returns the EventBreakpoints command. */
  EventBreakpoints getEventBreakpoints();

  /** Returns the DOMSnapshot command. */
  DOMSnapshot getDOMSnapshot();

  /** Returns the DOMStorage command. */
  DOMStorage getDOMStorage();

  /** Returns the Database command. */
  Database getDatabase();

  /** Returns the DeviceOrientation command. */
  DeviceOrientation getDeviceOrientation();

  /** Returns the Emulation command. */
  Emulation getEmulation();

  /** Returns the HeadlessExperimental command. */
  HeadlessExperimental getHeadlessExperimental();

  /** Returns the IO command. */
  IO getIO();

  /** Returns the IndexedDB command. */
  IndexedDB getIndexedDB();

  /** Returns the Input command. */
  Input getInput();

  /** Returns the Inspector command. */
  Inspector getInspector();

  /** Returns the LayerTree command. */
  LayerTree getLayerTree();

  /** Returns the Log command. */
  Log getLog();

  /** Returns the Memory command. */
  Memory getMemory();

  /** Returns the Network command. */
  Network getNetwork();

  /** Returns the Overlay command. */
  Overlay getOverlay();

  /** Returns the Page command. */
  Page getPage();

  /** Returns the Performance command. */
  Performance getPerformance();

  /** Returns the PerformanceTimeline command. */
  PerformanceTimeline getPerformanceTimeline();

  /** Returns the Security command. */
  Security getSecurity();

  /** Returns the ServiceWorker command. */
  ServiceWorker getServiceWorker();

  /** Returns the Storage command. */
  Storage getStorage();

  /** Returns the SystemInfo command. */
  SystemInfo getSystemInfo();

  /** Returns the Target command. */
  Target getTarget();

  /** Returns the Tethering command. */
  Tethering getTethering();

  /** Returns the Tracing command. */
  Tracing getTracing();

  /** Returns the Fetch command. */
  Fetch getFetch();

  /** Returns the WebAudio command. */
  WebAudio getWebAudio();

  /** Returns the WebAuthn command. */
  WebAuthn getWebAuthn();

  /** Returns the Media command. */
  Media getMedia();
}

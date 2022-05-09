package io.github.sskorol.cdt.protocol.commands;

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

import io.github.sskorol.cdt.protocol.events.webaudio.AudioListenerCreated;
import io.github.sskorol.cdt.protocol.events.webaudio.AudioListenerWillBeDestroyed;
import io.github.sskorol.cdt.protocol.events.webaudio.AudioNodeCreated;
import io.github.sskorol.cdt.protocol.events.webaudio.AudioNodeWillBeDestroyed;
import io.github.sskorol.cdt.protocol.events.webaudio.AudioParamCreated;
import io.github.sskorol.cdt.protocol.events.webaudio.AudioParamWillBeDestroyed;
import io.github.sskorol.cdt.protocol.events.webaudio.ContextChanged;
import io.github.sskorol.cdt.protocol.events.webaudio.ContextCreated;
import io.github.sskorol.cdt.protocol.events.webaudio.ContextWillBeDestroyed;
import io.github.sskorol.cdt.protocol.events.webaudio.NodeParamConnected;
import io.github.sskorol.cdt.protocol.events.webaudio.NodeParamDisconnected;
import io.github.sskorol.cdt.protocol.events.webaudio.NodesConnected;
import io.github.sskorol.cdt.protocol.events.webaudio.NodesDisconnected;
import io.github.sskorol.cdt.protocol.support.annotations.EventName;
import io.github.sskorol.cdt.protocol.support.annotations.Experimental;
import io.github.sskorol.cdt.protocol.support.annotations.ParamName;
import io.github.sskorol.cdt.protocol.support.annotations.Returns;
import io.github.sskorol.cdt.protocol.support.types.EventHandler;
import io.github.sskorol.cdt.protocol.support.types.EventListener;
import io.github.sskorol.cdt.protocol.types.webaudio.ContextRealtimeData;

/** This domain allows inspection of Web Audio API. https://webaudio.github.io/web-audio-api/ */
@Experimental
public interface WebAudio {

  /** Enables the WebAudio domain and starts sending context lifetime events. */
  void enable();

  /** Disables the WebAudio domain. */
  void disable();

  /**
   * Fetch the realtime data from the registered contexts.
   *
   * @param contextId
   */
  @Returns("realtimeData")
  ContextRealtimeData getRealtimeData(@ParamName("contextId") String contextId);

  /** Notifies that a new BaseAudioContext has been created. */
  @EventName("contextCreated")
  EventListener onContextCreated(EventHandler<ContextCreated> eventListener);

  /** Notifies that an existing BaseAudioContext will be destroyed. */
  @EventName("contextWillBeDestroyed")
  EventListener onContextWillBeDestroyed(EventHandler<ContextWillBeDestroyed> eventListener);

  /** Notifies that existing BaseAudioContext has changed some properties (id stays the same).. */
  @EventName("contextChanged")
  EventListener onContextChanged(EventHandler<ContextChanged> eventListener);

  /** Notifies that the construction of an AudioListener has finished. */
  @EventName("audioListenerCreated")
  EventListener onAudioListenerCreated(EventHandler<AudioListenerCreated> eventListener);

  /** Notifies that a new AudioListener has been created. */
  @EventName("audioListenerWillBeDestroyed")
  EventListener onAudioListenerWillBeDestroyed(
      EventHandler<AudioListenerWillBeDestroyed> eventListener);

  /** Notifies that a new AudioNode has been created. */
  @EventName("audioNodeCreated")
  EventListener onAudioNodeCreated(EventHandler<AudioNodeCreated> eventListener);

  /** Notifies that an existing AudioNode has been destroyed. */
  @EventName("audioNodeWillBeDestroyed")
  EventListener onAudioNodeWillBeDestroyed(EventHandler<AudioNodeWillBeDestroyed> eventListener);

  /** Notifies that a new AudioParam has been created. */
  @EventName("audioParamCreated")
  EventListener onAudioParamCreated(EventHandler<AudioParamCreated> eventListener);

  /** Notifies that an existing AudioParam has been destroyed. */
  @EventName("audioParamWillBeDestroyed")
  EventListener onAudioParamWillBeDestroyed(EventHandler<AudioParamWillBeDestroyed> eventListener);

  /** Notifies that two AudioNodes are connected. */
  @EventName("nodesConnected")
  EventListener onNodesConnected(EventHandler<NodesConnected> eventListener);

  /**
   * Notifies that AudioNodes are disconnected. The destination can be null, and it means all the
   * outgoing connections from the source are disconnected.
   */
  @EventName("nodesDisconnected")
  EventListener onNodesDisconnected(EventHandler<NodesDisconnected> eventListener);

  /** Notifies that an AudioNode is connected to an AudioParam. */
  @EventName("nodeParamConnected")
  EventListener onNodeParamConnected(EventHandler<NodeParamConnected> eventListener);

  /** Notifies that an AudioNode is disconnected to an AudioParam. */
  @EventName("nodeParamDisconnected")
  EventListener onNodeParamDisconnected(EventHandler<NodeParamDisconnected> eventListener);
}

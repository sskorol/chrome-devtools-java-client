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

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DeprecationIssueType {
  @JsonProperty("AuthorizationCoveredByWildcard")
  AUTHORIZATION_COVERED_BY_WILDCARD,
  @JsonProperty("CanRequestURLHTTPContainingNewline")
  CAN_REQUEST_URLHTTP_CONTAINING_NEWLINE,
  @JsonProperty("ChromeLoadTimesConnectionInfo")
  CHROME_LOAD_TIMES_CONNECTION_INFO,
  @JsonProperty("ChromeLoadTimesFirstPaintAfterLoadTime")
  CHROME_LOAD_TIMES_FIRST_PAINT_AFTER_LOAD_TIME,
  @JsonProperty("ChromeLoadTimesWasAlternateProtocolAvailable")
  CHROME_LOAD_TIMES_WAS_ALTERNATE_PROTOCOL_AVAILABLE,
  @JsonProperty("CookieWithTruncatingChar")
  COOKIE_WITH_TRUNCATING_CHAR,
  @JsonProperty("CrossOriginAccessBasedOnDocumentDomain")
  CROSS_ORIGIN_ACCESS_BASED_ON_DOCUMENT_DOMAIN,
  @JsonProperty("CrossOriginWindowAlert")
  CROSS_ORIGIN_WINDOW_ALERT,
  @JsonProperty("CrossOriginWindowConfirm")
  CROSS_ORIGIN_WINDOW_CONFIRM,
  @JsonProperty("CSSSelectorInternalMediaControlsOverlayCastButton")
  CSS_SELECTOR_INTERNAL_MEDIA_CONTROLS_OVERLAY_CAST_BUTTON,
  @JsonProperty("CustomCursorIntersectsViewport")
  CUSTOM_CURSOR_INTERSECTS_VIEWPORT,
  @JsonProperty("DeprecationExample")
  DEPRECATION_EXAMPLE,
  @JsonProperty("DocumentDomainSettingWithoutOriginAgentClusterHeader")
  DOCUMENT_DOMAIN_SETTING_WITHOUT_ORIGIN_AGENT_CLUSTER_HEADER,
  @JsonProperty("EventPath")
  EVENT_PATH,
  @JsonProperty("GeolocationInsecureOrigin")
  GEOLOCATION_INSECURE_ORIGIN,
  @JsonProperty("GeolocationInsecureOriginDeprecatedNotRemoved")
  GEOLOCATION_INSECURE_ORIGIN_DEPRECATED_NOT_REMOVED,
  @JsonProperty("GetUserMediaInsecureOrigin")
  GET_USER_MEDIA_INSECURE_ORIGIN,
  @JsonProperty("HostCandidateAttributeGetter")
  HOST_CANDIDATE_ATTRIBUTE_GETTER,
  @JsonProperty("InsecurePrivateNetworkSubresourceRequest")
  INSECURE_PRIVATE_NETWORK_SUBRESOURCE_REQUEST,
  @JsonProperty("LegacyConstraintGoogCpuOveruseDetection")
  LEGACY_CONSTRAINT_GOOG_CPU_OVERUSE_DETECTION,
  @JsonProperty("LegacyConstraintGoogIPv6")
  LEGACY_CONSTRAINT_GOOG_I_PV_6,
  @JsonProperty("LegacyConstraintGoogScreencastMinBitrate")
  LEGACY_CONSTRAINT_GOOG_SCREENCAST_MIN_BITRATE,
  @JsonProperty("LegacyConstraintGoogSuspendBelowMinBitrate")
  LEGACY_CONSTRAINT_GOOG_SUSPEND_BELOW_MIN_BITRATE,
  @JsonProperty("LocalCSSFileExtensionRejected")
  LOCAL_CSS_FILE_EXTENSION_REJECTED,
  @JsonProperty("MediaElementAudioSourceNode")
  MEDIA_ELEMENT_AUDIO_SOURCE_NODE,
  @JsonProperty("MediaSourceAbortRemove")
  MEDIA_SOURCE_ABORT_REMOVE,
  @JsonProperty("MediaSourceDurationTruncatingBuffered")
  MEDIA_SOURCE_DURATION_TRUNCATING_BUFFERED,
  @JsonProperty("NoSysexWebMIDIWithoutPermission")
  NO_SYSEX_WEB_MIDI_WITHOUT_PERMISSION,
  @JsonProperty("NotificationInsecureOrigin")
  NOTIFICATION_INSECURE_ORIGIN,
  @JsonProperty("NotificationPermissionRequestedIframe")
  NOTIFICATION_PERMISSION_REQUESTED_IFRAME,
  @JsonProperty("ObsoleteWebRtcCipherSuite")
  OBSOLETE_WEB_RTC_CIPHER_SUITE,
  @JsonProperty("PaymentRequestBasicCard")
  PAYMENT_REQUEST_BASIC_CARD,
  @JsonProperty("PaymentRequestShowWithoutGesture")
  PAYMENT_REQUEST_SHOW_WITHOUT_GESTURE,
  @JsonProperty("PictureSourceSrc")
  PICTURE_SOURCE_SRC,
  @JsonProperty("PrefixedCancelAnimationFrame")
  PREFIXED_CANCEL_ANIMATION_FRAME,
  @JsonProperty("PrefixedRequestAnimationFrame")
  PREFIXED_REQUEST_ANIMATION_FRAME,
  @JsonProperty("PrefixedStorageInfo")
  PREFIXED_STORAGE_INFO,
  @JsonProperty("PrefixedVideoDisplayingFullscreen")
  PREFIXED_VIDEO_DISPLAYING_FULLSCREEN,
  @JsonProperty("PrefixedVideoEnterFullscreen")
  PREFIXED_VIDEO_ENTER_FULLSCREEN,
  @JsonProperty("PrefixedVideoEnterFullScreen")
  PREFIXED_VIDEO_ENTER_FULL_SCREEN,
  @JsonProperty("PrefixedVideoExitFullscreen")
  PREFIXED_VIDEO_EXIT_FULLSCREEN,
  @JsonProperty("PrefixedVideoExitFullScreen")
  PREFIXED_VIDEO_EXIT_FULL_SCREEN,
  @JsonProperty("PrefixedVideoSupportsFullscreen")
  PREFIXED_VIDEO_SUPPORTS_FULLSCREEN,
  @JsonProperty("RangeExpand")
  RANGE_EXPAND,
  @JsonProperty("RequestedSubresourceWithEmbeddedCredentials")
  REQUESTED_SUBRESOURCE_WITH_EMBEDDED_CREDENTIALS,
  @JsonProperty("RTCConstraintEnableDtlsSrtpFalse")
  RTC_CONSTRAINT_ENABLE_DTLS_SRTP_FALSE,
  @JsonProperty("RTCConstraintEnableDtlsSrtpTrue")
  RTC_CONSTRAINT_ENABLE_DTLS_SRTP_TRUE,
  @JsonProperty("RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics")
  RTC_PEER_CONNECTION_COMPLEX_PLAN_B_SDP_USING_DEFAULT_SDP_SEMANTICS,
  @JsonProperty("RTCPeerConnectionLegacyCreateWithMediaConstraints")
  RTC_PEER_CONNECTION_LEGACY_CREATE_WITH_MEDIA_CONSTRAINTS,
  @JsonProperty("RTCPeerConnectionSdpSemanticsPlanB")
  RTC_PEER_CONNECTION_SDP_SEMANTICS_PLAN_B,
  @JsonProperty("RtcpMuxPolicyNegotiate")
  RTCP_MUX_POLICY_NEGOTIATE,
  @JsonProperty("RTPDataChannel")
  RTP_DATA_CHANNEL,
  @JsonProperty("SharedArrayBufferConstructedWithoutIsolation")
  SHARED_ARRAY_BUFFER_CONSTRUCTED_WITHOUT_ISOLATION,
  @JsonProperty("TextToSpeech_DisallowedByAutoplay")
  TEXT_TO_SPEECH_DISALLOWED_BY_AUTOPLAY,
  @JsonProperty("V8SharedArrayBufferConstructedInExtensionWithoutIsolation")
  V_8SHARED_ARRAY_BUFFER_CONSTRUCTED_IN_EXTENSION_WITHOUT_ISOLATION,
  @JsonProperty("XHRJSONEncodingDetection")
  XHRJSON_ENCODING_DETECTION,
  @JsonProperty("XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload")
  XML_HTTP_REQUEST_SYNCHRONOUS_IN_NON_WORKER_OUTSIDE_BEFORE_UNLOAD,
  @JsonProperty("XRSupportsSession")
  XR_SUPPORTS_SESSION
}

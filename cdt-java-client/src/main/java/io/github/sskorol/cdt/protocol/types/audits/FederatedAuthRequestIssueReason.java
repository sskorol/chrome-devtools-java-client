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

/**
 * Represents the failure reason when a federated authentication reason fails. Should be updated
 * alongside RequestIdTokenStatus in third_party/blink/public/mojom/devtools/inspector_issue.mojom
 * to include all cases except for success.
 */
public enum FederatedAuthRequestIssueReason {
  @JsonProperty("ApprovalDeclined")
  APPROVAL_DECLINED,
  @JsonProperty("TooManyRequests")
  TOO_MANY_REQUESTS,
  @JsonProperty("ManifestListHttpNotFound")
  MANIFEST_LIST_HTTP_NOT_FOUND,
  @JsonProperty("ManifestListNoResponse")
  MANIFEST_LIST_NO_RESPONSE,
  @JsonProperty("ManifestListInvalidResponse")
  MANIFEST_LIST_INVALID_RESPONSE,
  @JsonProperty("ManifestNotInManifestList")
  MANIFEST_NOT_IN_MANIFEST_LIST,
  @JsonProperty("ManifestListTooBig")
  MANIFEST_LIST_TOO_BIG,
  @JsonProperty("ManifestHttpNotFound")
  MANIFEST_HTTP_NOT_FOUND,
  @JsonProperty("ManifestNoResponse")
  MANIFEST_NO_RESPONSE,
  @JsonProperty("ManifestInvalidResponse")
  MANIFEST_INVALID_RESPONSE,
  @JsonProperty("ClientMetadataHttpNotFound")
  CLIENT_METADATA_HTTP_NOT_FOUND,
  @JsonProperty("ClientMetadataNoResponse")
  CLIENT_METADATA_NO_RESPONSE,
  @JsonProperty("ClientMetadataInvalidResponse")
  CLIENT_METADATA_INVALID_RESPONSE,
  @JsonProperty("ClientMetadataMissingPrivacyPolicyUrl")
  CLIENT_METADATA_MISSING_PRIVACY_POLICY_URL,
  @JsonProperty("DisabledInSettings")
  DISABLED_IN_SETTINGS,
  @JsonProperty("ErrorFetchingSignin")
  ERROR_FETCHING_SIGNIN,
  @JsonProperty("InvalidSigninResponse")
  INVALID_SIGNIN_RESPONSE,
  @JsonProperty("AccountsHttpNotFound")
  ACCOUNTS_HTTP_NOT_FOUND,
  @JsonProperty("AccountsNoResponse")
  ACCOUNTS_NO_RESPONSE,
  @JsonProperty("AccountsInvalidResponse")
  ACCOUNTS_INVALID_RESPONSE,
  @JsonProperty("IdTokenHttpNotFound")
  ID_TOKEN_HTTP_NOT_FOUND,
  @JsonProperty("IdTokenNoResponse")
  ID_TOKEN_NO_RESPONSE,
  @JsonProperty("IdTokenInvalidResponse")
  ID_TOKEN_INVALID_RESPONSE,
  @JsonProperty("IdTokenInvalidRequest")
  ID_TOKEN_INVALID_REQUEST,
  @JsonProperty("ErrorIdToken")
  ERROR_ID_TOKEN,
  @JsonProperty("Canceled")
  CANCELED
}

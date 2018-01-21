package com.github.kklisura.cdtp.protocol.types.console;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Message source.
 */
public enum Source {

	@JsonProperty("xml")
	XML, @JsonProperty("javascript")
	JAVASCRIPT, @JsonProperty("network")
	NETWORK, @JsonProperty("console-api")
	CONSOLE_API, @JsonProperty("storage")
	STORAGE, @JsonProperty("appcache")
	APPCACHE, @JsonProperty("rendering")
	RENDERING, @JsonProperty("security")
	SECURITY, @JsonProperty("other")
	OTHER, @JsonProperty("deprecation")
	DEPRECATION, @JsonProperty("worker")
	WORKER
}

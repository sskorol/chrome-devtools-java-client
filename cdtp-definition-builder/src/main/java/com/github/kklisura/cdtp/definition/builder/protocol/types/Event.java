package com.github.kklisura.cdtp.definition.builder.protocol.types;

import com.github.kklisura.cdtp.definition.builder.protocol.types.type.object.Property;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Event type.
 *
 * @author Kenan Klisura
 */
@Getter
@Setter
public class Event {
	private String name;

	private String description;

	private Boolean experimental;

	private Boolean deprecated;

	private List<Property> parameters;
}
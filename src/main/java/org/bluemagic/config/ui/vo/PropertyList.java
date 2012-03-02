package org.bluemagic.config.ui.vo;

import java.util.ArrayList;
import java.util.List;

public class PropertyList {

	private List<Property> properties;

	public List<Property> getProperties() {
		if (properties == null) {
			return new ArrayList<Property>();
		}
		
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
}
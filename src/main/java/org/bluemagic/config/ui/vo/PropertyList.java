package org.bluemagic.config.ui.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Convenient wrapper class that allows us to pass a group of 
 * properties back and forth between the JSP's and Controller's.  This
 * makes the Spring integration much smoother.
 */
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

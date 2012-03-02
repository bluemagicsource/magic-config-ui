package org.bluemagic.config.ui.service;

import org.bluemagic.config.ui.vo.Property;
import org.bluemagic.config.ui.vo.PropertyList;

/**
 * The Service Layer obfuscates the Controller classes from changes
 * in the actual retrieval of the properties.
 */
public interface PropertyService {

	public PropertyList getAllProperties();
	
	public Property getProperty(String property);
	
	public String deleteProperty(String property);
	
	public String updatePropery(Property property);
	
	public String createProperty(Property property);
}

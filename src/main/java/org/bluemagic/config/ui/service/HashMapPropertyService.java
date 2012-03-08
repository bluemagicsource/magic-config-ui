package org.bluemagic.config.ui.service;

import java.util.HashMap;
import java.util.Map;

import org.bluemagic.config.ui.vo.Property;
import org.bluemagic.config.ui.vo.PropertyList;

/**
 * An In-Memory HashMap implementation of the PropertyService.  Please note that if server is bounced,
 * or the service is re-deployed all properties will be lost.
 */
public class HashMapPropertyService implements PropertyService {

	/**
	 * Map's the properties full name (the base name plus the tags) to the property itself.
	 * 
	 */
	private Map<String, Property> propertiesTable;
	
	public HashMapPropertyService() {
		propertiesTable = new HashMap<String, Property>();
	}
	
	@Override
	public PropertyList getAllProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getProperty(String property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProperty(String property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePropery(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createProperty(Property property) {
		// TODO Auto-generated method stub
		return null;
	}
}
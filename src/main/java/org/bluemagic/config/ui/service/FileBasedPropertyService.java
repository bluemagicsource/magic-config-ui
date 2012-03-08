package org.bluemagic.config.ui.service;

import org.bluemagic.config.ui.vo.Property;
import org.bluemagic.config.ui.vo.PropertyList;

/**
 * The File Based Property Service implementation reads from and writes
 * to a local properties file.
 */
public class FileBasedPropertyService implements PropertyService {

	private String propertiesFile;
	
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

	public String getPropertiesFile() {
		return propertiesFile;
	}

	public void setPropertiesFile(String propertiesFile) {
		this.propertiesFile = propertiesFile;
	}
}
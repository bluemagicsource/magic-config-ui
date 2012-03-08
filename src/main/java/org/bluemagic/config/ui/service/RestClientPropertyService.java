package org.bluemagic.config.ui.service;

import org.bluemagic.config.location.remote.RestClientManager;
import org.bluemagic.config.ui.vo.Property;
import org.bluemagic.config.ui.vo.PropertyList;

/**
 * RESTful Implementation of the Property Service.  Allows us to make a
 * REST call to another server to retrieve the property. 
 */
public class RestClientPropertyService implements PropertyService {

	private RestClientManager restClientManager;
	
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

	public RestClientManager getRestClientManager() {
		return restClientManager;
	}

	public void setRestClientManager(RestClientManager restClientManager) {
		this.restClientManager = restClientManager;
	}
}
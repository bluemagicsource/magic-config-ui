package org.bluemagic.config.ui.controller;

import org.bluemagic.config.ui.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * This controller should handle all calls to the 
 * HomePage.  It should display useful/relevant information
 * to the user, along with giving them options for individual properties.  
 * Some ideas are "Last X number of Properties Accessed", 
 * "Most Used Properties", or "Last X number of Properties Created."
 */
@Controller
@RequestMapping("/ui")
public class HomePageController {

	@Autowired
	private PropertyService propertyService;
	
	/**
	 * To begin with, this method should display all of the properties currently in the database.  It
	 * should also contain a menu that allows us to do various actions on those properties.
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView displayHomePage() {		
		
		return null;
	}
	
	/**
	 * This method should create a new Property object, and bind it to a form
	 * which is rendered as a JSP. This JSP should allow us to create a new property
	 * object with a name, value, and a varying number of tags.
	 * 
	 * When this form is posted, it should call the PropertyController's "createPropery"
	 * method.
	 */
	@RequestMapping(value="/createProperty", method=RequestMethod.GET)
	public ModelAndView createPropertyForm() {
		
		return null;
	}

	public PropertyService getPropertyService() {
		return propertyService;
	}

	public void setPropertyService(PropertyService propertyService) {
		this.propertyService = propertyService;
	}
}

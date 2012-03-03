package org.bluemagic.config.ui.controller;

import org.bluemagic.config.ui.vo.Property;
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

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView displayHomePage() {
		// TODO
		return null;
	}
	
	@RequestMapping(value="/createProperty", method=RequestMethod.GET)
	public ModelAndView createPropertyForm() {
		// TODO
		return null;
	}
}

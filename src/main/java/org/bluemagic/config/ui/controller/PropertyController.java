package org.bluemagic.config.ui.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * The PropertyController has been designed to handle all of 
 * the actions relating to an <i>individual</i> property.
 */
@Controller
@RequestMapping(value="/property")
public class PropertyController {

	/**
	 * This method will handle all requests to view a particular property.  We
	 * do not know how many components make up the property (length wise), so we 
	 * will need to somehow parse out the baseUrl so that we are left with the property 
	 * itself.
	 * 
	 * <p>
	 * For example, we can receive requests like this:<br>
	 * http://www.testserver.com/magic/property/some/value<br>
	 * http://www.testserver.com/magic/property/some/really/cool/value<br>
	 * http://www.testserver.com/magic/property/some/really/cool/value/thats/really/long?tags=tag1,tag2&key=value<br>
	 * </p>
	 * 
	 * So we need to design a method which can handle URL's of any length relating to an 
	 * individual property.  When we send the request to the service, we need to make sure we 
	 * remove the baseUrl.
	 * 
	 * <p>
	 * So a request for:<br>
	 * http://www.testserver.com/magic/property/some/really/cool/value/thats/really/long?tags=tag1,tag2&key=value<br>
	 * </p>
	 * <p>
	 * Should become:<br>
	 * some/really/cool/value/thats/really/long?tags=tag1,tag2&key=value<br>
	 * </p>
	 */
	@RequestMapping(value="/**", method=RequestMethod.GET)
	public @ResponseBody String getProperty(HttpServletRequest request) {
		// TODO
		return null;
	}
	
	/**
	 * Handles all requests to delete a particular property.
	 * 
	 * @param propertyToDelete
	 *             Name of the property to delete.
	 * @return
	 *             A page showing a confirmation of the delete.
	 */
	@RequestMapping(params="delete", method=RequestMethod.POST)
	public ModelAndView deleteProperty(@RequestParam("delete") String propertyToDelete) {
		// TODO
		return null;
	}
	
	/**
	 * Handles all requests to edit a particular property.
	 */
	@RequestMapping(params="edit", method=RequestMethod.POST)
	public ModelAndView editProperty(@RequestParam("edit") String propertyToEdit) {
		// TODO
		return null;
	}
	
	/**
	 * Handles all requests to create a new property.
	 */
	@RequestMapping(params="create", method=RequestMethod.POST)
	public ModelAndView createPropery(HttpServletRequest request) {
		// TODO
		return null;
	}
}

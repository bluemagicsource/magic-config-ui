package org.bluemagic.config.ui.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/property")
public class PropertyController {

	@RequestMapping(value="/**", method=RequestMethod.GET)
	public @ResponseBody String getProperty(HttpServletRequest request) {
		//TODO
		return null;
	}
}

package org.bluemagic.ui.controller;

import org.bluemagic.ui.service.MagicDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReadController {

	@Autowired
	private MagicDisplayService displayService; 
	
	@RequestMapping("")
	public ModelAndView home() {
		return show();
	}
	
	@RequestMapping("show")
	public ModelAndView show() {
		
		ModelAndView mav = new ModelAndView("show");
		
		mav.addObject("propertyInfoList", displayService.allPropertyInfo());
		
		return mav;
	}
	
	@RequestMapping("detail")
	public ModelAndView detail(@RequestParam(value="key", required=false) String key, @RequestParam(value="tag", required=false) String tag) {

		if (key != null && !key.isEmpty()) {
			return detailForProperty(key);
		} else {
			return detailForTag(tag);
		}
	}
	
	public ModelAndView detailForProperty(String key) {
		
		ModelAndView mav = new ModelAndView("property");
		
		mav.addObject("propertyDetail", displayService.propertyDetail(key));
		
		return mav;
	}

	
	public ModelAndView detailForTag(@RequestParam(value="tag") String tag) {
		
		ModelAndView mav = new ModelAndView("tag");

		mav.addObject("tagDetail", displayService.tagDetail(tag));
		
		return mav;
	}
}

package com.spring.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getName(){
		String hello = "Hello Controller";
		ModelAndView model = new ModelAndView("Home");
		model.addObject("home", hello);
		return model;
	}
	
	@RequestMapping(value="/home/{country}/{username}")
	public ModelAndView getUser(@PathVariable("country")String country, @PathVariable("username")String name){
		ModelAndView model = new ModelAndView("home");
		model.addObject("home", "Hello " + name + " You r from "+ country);
		return model;
	}
	
}

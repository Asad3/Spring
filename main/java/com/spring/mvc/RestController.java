package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class RestController {

	@RequestMapping("/message")
	@ResponseBody
	public String getMessage(){
		return "Hello Rest API";
	}
	
}

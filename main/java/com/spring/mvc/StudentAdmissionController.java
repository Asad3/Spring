package com.spring.mvc;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.data.Student;

@Controller
@RequestMapping(value="/admissionform")
public class StudentAdmissionController {

	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, "dob",new CustomDateEditor(date, false));
	}
	
	@RequestMapping(value="/form.html", method = RequestMethod.GET)
	public ModelAndView getStudentForm(){
		ModelAndView model = new ModelAndView("StudentForm");
		return model;
	}
	
//	@RequestMapping(value="/submit.html" , method = RequestMethod.POST)
//	public ModelAndView submitStudentForm(@RequestParam("name")String name, @RequestParam("password")String password){
//		Student student = new Student();
//		student.setName(name);
//		student.setPassword(password);
//		ModelAndView model = new ModelAndView("SubmitForm");
//		model.addObject("student1", student);
//		return model;
//	}

	@ModelAttribute
	public void pageHeader(Model model){
		model.addAttribute("header", "Student Form");
	}
	
	@RequestMapping(value="/submit.html", method=RequestMethod.POST)
	public ModelAndView submitStudentForm(@ModelAttribute("student1") Student student, BindingResult result){
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("StudentForm");
			return model;
		}
		ModelAndView model = new ModelAndView("SubmitForm");
		model.addObject("student1",student);
		return model;
	}
	
	
}

 package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Course;
import com.example.demo.service.CourseDaoImpl;

@Controller
@ComponentScan("com.example.demo.service")
public class LogicController {
	public LogicController() {
		
	}

	@RequestMapping("/")
	public String loginPage() {

		System.out.println("this is login page");
		return "login";
	}       
	
	@RequestMapping("/add")
	public String showEmployee() {
		System.out.println("This is show course");
		return "AddCourse";
	
		}
	@Autowired
	CourseDaoImpl  cdi;
	
    @RequestMapping("/validate")
	public ModelAndView AddCourse(@ModelAttribute Course cou) {
		System.out.println("This is addCourse");
		System.out.println(cdi);
		int i = 1;
	if (i == 1) {
		 cdi.AddCourse(cou);
			ModelAndView mv = new ModelAndView("home");
			mv.addObject("message", "Record added Sucessfully");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("message", "Error Occured");
			return mv;
		
		}
	}
    
	@RequestMapping("/display")
	public ModelAndView displayAll(@ModelAttribute Course cou) {
		System.out.println("This is Display All");
		ModelAndView mv=new ModelAndView("display");
		List<Course> list=cdi.displayAll();
		mv.addObject("lemp",list);
		cdi.displayAll();
		return mv;
	}
	
}

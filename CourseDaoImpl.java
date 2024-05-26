package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Course;

@Component
public class CourseDaoImpl  {
	
	@Autowired
	CourseService cs;
	 public CourseDaoImpl() {
		 
	 }
	 public void AddCourse(Course cou) {
		System.out.println(cs.save(cou));
		 
		 
	 }
	 public List<Course> displayAll(){
			List<Course> list=(List<Course>) cs.findAll();
			System.out.println(list);
			return list;
		}

}

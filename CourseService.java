package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dao.Course;

public interface CourseService extends CrudRepository <Course , Integer> {
	
}

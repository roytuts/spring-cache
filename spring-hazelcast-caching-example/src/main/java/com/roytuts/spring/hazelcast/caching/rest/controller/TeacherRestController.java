package com.roytuts.spring.hazelcast.caching.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.hazelcast.caching.entity.Teacher;
import com.roytuts.spring.hazelcast.caching.service.TeacherService;

@RestController
public class TeacherRestController {

	@Autowired
	private TeacherService teacherService;

	@GetMapping("/teachers")
	public ResponseEntity<List<Teacher>> getTeachers() {
		return new ResponseEntity<List<Teacher>>(teacherService.getTeachers(), HttpStatus.OK);
	}

	@GetMapping("/teacher/{id}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable Integer id) {
		return new ResponseEntity<Teacher>(teacherService.getTeacher(id), HttpStatus.OK);
	}

}
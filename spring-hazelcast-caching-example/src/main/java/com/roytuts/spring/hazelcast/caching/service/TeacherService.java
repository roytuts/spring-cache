package com.roytuts.spring.hazelcast.caching.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.roytuts.spring.hazelcast.caching.entity.Teacher;
import com.roytuts.spring.hazelcast.caching.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;

	@Cacheable("teachers")
	public List<Teacher> getTeachers() {
		return teacherRepository.findAll();
	}

	@Cacheable("teacher")
	public Teacher getTeacher(Integer id) {
		return teacherRepository.findById(id).orElse(new Teacher());
	}

}
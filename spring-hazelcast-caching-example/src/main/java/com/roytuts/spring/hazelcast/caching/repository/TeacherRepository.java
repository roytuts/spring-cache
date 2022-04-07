package com.roytuts.spring.hazelcast.caching.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.hazelcast.caching.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
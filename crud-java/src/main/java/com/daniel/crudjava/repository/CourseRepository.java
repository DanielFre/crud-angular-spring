package com.daniel.crudjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.crudjava.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
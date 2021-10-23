package com.tqpp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqpp.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
                                     
}

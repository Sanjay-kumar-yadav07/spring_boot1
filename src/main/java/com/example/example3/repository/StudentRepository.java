package com.example.example3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.example3.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
               
}

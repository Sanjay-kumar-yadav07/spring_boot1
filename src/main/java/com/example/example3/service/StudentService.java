package com.example.example3.service;

import com.example.example3.model.Student;

public interface StudentService  {
public Student createStudent(Student createStudent);
public Student updateStudent(Student updateStudent);
public Student getStudentById(int id);
public void deleteStudent(int deleteStudent);
}

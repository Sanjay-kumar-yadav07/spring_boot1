package com.example.example3.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.example3.model.Student;
import com.example.example3.repository.StudentRepository;
import com.example.example3.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		student=studentRepository.save(student);
		System.out.println(student);
		return student;
	}

	public Student updateStudent(Student updateStudent) {
		// TODO Auto-generated method stub
		updateStudent=studentRepository.save(updateStudent);
		return updateStudent;
	}

	public Student getStudent(int getStudent) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteStudent(int deleteStudent) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(deleteStudent);
		
	}

	public Student getStudentById(int id) {
		Optional<Student> studentOpt=studentRepository.findById(id);
		Student student=null;
		try {
		if(studentOpt.isPresent()) {
			 student=studentOpt.get();
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return student;
	}

}

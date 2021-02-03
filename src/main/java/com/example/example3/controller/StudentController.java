package com.example.example3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.example3.model.Student;
import com.example.example3.service.StudentService;


@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/getStudent")
	public Student getStudentById(int id) {
		
		
		Student student=studentService.getStudentById(id);
		
		
		return student;
	}
	@PostMapping("/create_student" )
	public Student putStudents(@RequestBody  Student studentDetails) {
		studentDetails=studentService.createStudent(studentDetails);
		System.out.println(studentDetails);
		
		return studentDetails;
	}
	
	@PutMapping("/update_student")
	public Student updateStudentDetails(@RequestBody Student putStudentDetails) {
		 putStudentDetails = studentService.updateStudent(putStudentDetails);
		return putStudentDetails;
	}
	
	@DeleteMapping("/delete_student_details")
	public void deleteStudentDetails( int id) {
		studentService.deleteStudent(id);
		
	}
	
	
	
}












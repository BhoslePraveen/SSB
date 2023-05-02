package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Student;
import com.velocity.service.StudentService;

@RestController
@RequestMapping("/ssb")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<Void> saveStudentData(@RequestBody Student student ){
		studentService.saveData(student);
		return new ResponseEntity<>(HttpStatus.CREATED);
			
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> saveStudentData(@PathVariable int id ){
		Student student = studentService.getStudentById(id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
			
	}

}

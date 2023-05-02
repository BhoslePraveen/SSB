package com.velocity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Student;
import com.velocity.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Override
	public void saveData(Student student) {
		repo.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> optional = repo.findById(id);
		return optional.get();
	}

}

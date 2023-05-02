package com.velocity.service;

import com.velocity.model.Student;

public interface StudentService {

	void saveData(Student student);

	Student getStudentById(int id);

}

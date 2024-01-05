package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Student;

public interface StudentService {

	public List<Student> getallStudent();
	
	public Student addStudent(Student student);
	
	public Optional<Student> findEmpId(int id);

	public String deleteById(int id);
	
	public Student updateStudent(Student student);
	

}

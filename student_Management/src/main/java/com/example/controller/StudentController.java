package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
  @Autowired
   StudentService studentService;
	
//	@GetMapping("get")
//	
//	public String send() {
//		return "I am from employee";
//	}
	
  @PostMapping("/add")
	public ResponseEntity<Student>createdata(@RequestBody Student student){
		Student e1=studentService.addStudent( student);
		return new ResponseEntity<Student>(e1,HttpStatus.CREATED);	
	}
  
  @GetMapping("/findemp/{id}")
	public ResponseEntity<Optional<Student>> findById(@PathVariable int id){
		 Optional<Student>stud=studentService.findEmpId(id);
		 System.out.println(stud);
			if(stud.isPresent()) {
				return new ResponseEntity< Optional<Student>>(stud,HttpStatus.ACCEPTED);
			}
			else {
				 return new ResponseEntity< Optional<Student>>(stud,HttpStatus.NO_CONTENT); 
			}
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>>showAllStudent(){
		List<Student>st1= studentService.getallStudent();
		return new ResponseEntity<List<Student>>(st1,HttpStatus.ACCEPTED);
	}
	
	
//  @PutMapping("/update/{id}")
//	public ResponseEntity<Student> removeStudent(@PathVariable int id){
//	  Optional<Student> stud=studentService.findEmpId(id);
//		return new ResponseEntity<Student>(stud,HttpStatus.ACCEPTED);	
//	}
  @DeleteMapping("/delete/{id}")
  public ResponseEntity< String> deleteStu(@PathVariable int id) {
	 String st2= studentService.deleteById(id);
	return new ResponseEntity<>(st2,HttpStatus.ACCEPTED);
  
  }

  @PutMapping("/update")
  public ResponseEntity< Student >renameStudent(@RequestBody Student student) {
	 Student st1= studentService.updateStudent(student);
	return new ResponseEntity< Student >(st1,HttpStatus.OK); 
	  
  }
}
 
	
	


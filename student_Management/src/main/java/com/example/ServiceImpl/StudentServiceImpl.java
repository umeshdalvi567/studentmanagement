 package com.example.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.Student;
import com.example.repository.StudentRepo;
import com.example.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getallStudent() {
		return studentRepo.findAll();
//		List<Student> student=studentRepo.findAll();
//		return student;
	}

	@Override
	public Student addStudent(Student student) {
		Student st1= studentRepo.save(student);
		return st1;
	}

	@Override
	public Optional<Student> findEmpId(int id) {
		return studentRepo.findById(id);
		
				
	}

//	@Override
//	public Student update(int id) {
//	Optional<Student>st1=studentRepo.findById(id);
//	if(st1.isPresent()) {
//		
//		Student st2=studentRepo.save();
//		return st2;
//	}
//	else {
//	return null;
//	}}
//
	public String deleteById(int id) {//not proper working
if(studentRepo.findById(id) != null ){
	studentRepo.deleteById(id);

	return "delete successfully";
}
	else {

return "please select correct Id ";
}	

	}

	@Override
	public Student updateStudent(Student student) {
		Student st1= studentRepo.save(student);
		return st1;
	}







	
	

}

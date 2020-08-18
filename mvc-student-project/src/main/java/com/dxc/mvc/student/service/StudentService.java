package com.dxc.mvc.student.service;

import java.util.List;

import com.dxc.mvc.student.model.Student;

public class StudentService {
	
	private List<Student> listOfStudents;
	
	
	public List<Student> getStudentList(){
		
		Student student1= new Student("asnan",14,"me",9.6f);
		Student student2= new Student("ajay",18,"me",9.8f);
		Student student3= new Student("ajnas",19,"me",9.5f);
		Student student4= new Student("linu",16,"me",9.4f);
		getStudentList().add(student1);
		getStudentList().add(student2);
		getStudentList().add(student3);
		getStudentList().add(student4);
		return getStudentList();
	}
	

}

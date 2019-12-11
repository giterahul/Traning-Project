package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDAO {
	public List<Student> getAllStudents();
	public Student getStudent(int rollno);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	

}

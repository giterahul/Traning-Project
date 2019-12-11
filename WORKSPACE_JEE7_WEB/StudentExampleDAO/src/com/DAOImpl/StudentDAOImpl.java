package com.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import com.dao.StudentDAO;
import com.model.Student;

public class StudentDAOImpl implements StudentDAO {
	List<Student> students;
	
	public StudentDAOImpl() {
		students=new ArrayList<Student>();
		Student student1=new Student("rahul",0);
		Student student2=new Student("sheetal",1);
		students.add(student1);
		students.add(student2);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int rollno) {
		return students.get(rollno);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollno()).setName(student.getName());
	      System.out.println("Student: Roll No " + student.getRollno() + ", updated in the database");

	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollno());
	      System.out.println("Student: Roll No " + student.getRollno() + ", deleted from database");
	}

}

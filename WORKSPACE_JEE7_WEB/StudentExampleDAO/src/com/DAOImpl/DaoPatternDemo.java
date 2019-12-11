package com.DAOImpl;

import com.dao.StudentDAO;
import com.model.Student;

public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDAO studentDao = new StudentDAOImpl();

      //print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollno() + ", Name : " + student.getName() + " ]");
      }


      //update student
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Michael");
      studentDao.updateStudent(student);

      //get the student
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollno() + ", Name : " + student.getName() + " ]");		
   }
}
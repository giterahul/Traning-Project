package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDAB2 {

    private Connection connection;

    public StudentDAB2() {
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/allianz";
        String dbUsername = "root";
        String dbPassword = "";
        try {
            Class.forName(dbDriver);
            connection = DriverManager.getConnection(dbUrl, dbUsername,
                    dbPassword);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Connection getConnection() {
        return connection;
    }

    public void add(Student student) {
        String querAdd = "insert into Student(ROLL_No,NAME,MARK)values(?,?,?)";
        try {
            Connection connection = getConnection();
            PreparedStatement prep = connection.prepareStatement(querAdd);

            prep.setInt(1, student.getRollno());
            prep.setString(2, student.getName());
            prep.setFloat(3, student.getMark());
            int i = prep.executeUpdate();
            System.out.println(i + "  Record Inserted");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void findRecord(int rollNo) {
        boolean flag = true;
        String sqlFind = "select * from Student where ROLL_No=?";
        Student student = null;
        try (Connection connection = getConnection();
                PreparedStatement prep = connection
                        .prepareStatement(sqlFind);) {
            prep.setInt(1, rollNo);
            student = new Student();
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                student.setRollno(rs.getInt("ROLL_No"));
                student.setName(rs.getString("NAME"));
                student.setMark(rs.getFloat("MARK"));
                flag = true;
                break;
            }

            if (flag == true) {
                System.out.println("\n\tRecord Found\n");
                System.out.println("RollNo:\t" + student.getRollno());
                System.out.println("Name:\t" + student.getName());
                System.out.println("Mark:\t" + student.getMark());
            } else {
                System.err.println("No Record Found\n\tTry With Valid RollNo");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void showRecord() {
        try {
            Connection connection = getConnection();
            Statement stat = connection.createStatement();
            ResultSet rs = stat.executeQuery("select * from Student");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("ROLL_No") + "\t" + rs.getString("NAME")
                                + "\t" + rs.getFloat("MARK"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRecord(int roll) {
        try {
            Connection connection = getConnection();
            PreparedStatement prep = connection
                    .prepareStatement("delete from Student where ROLL_No=?");
            prep.setInt(1, roll);
            int i = prep.executeUpdate();
            System.out.println(i + "  Delete Successful");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateRecord(Student student) {
        String sqlUpdate = "update Student set NAME=?,MARK=? where ROLL_No=?";
        try (Connection connection = getConnection();
                PreparedStatement prep = connection
                        .prepareStatement(sqlUpdate);) {
            prep.setString(1, student.getName());
            prep.setFloat(2, student.getMark());
            prep.setInt(3, student.getRollno());
            int i = prep.executeUpdate();
            System.out.println("\n" + i + "\tRecord Updated..\n\n");
            showRecord();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        StudentDAB2 stud = new StudentDAB2();
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(
                    "\n1.Add\n2.Show\n3.delete\n4.Update\n5.Search\n6.Exit\nEnter Choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Roll No:");
                    int rollno = sc.nextInt();
                    System.out.println("Enter Name:");
                    String name = sc.next();
                    System.out.println("Enter Mark:");
                    float mark = sc.nextFloat();

                    stud.add(new Student(rollno, name, mark));

                    break;
                case 2:
                    stud.showRecord();
                    break;
                case 3:
                    System.out.println("\nEnter RollNo Want's To delete:");
                    int rollno1 = sc.nextInt();
                    stud.deleteRecord(rollno1);
                    System.out.println("\n\n");
                    stud.showRecord();
                    break;
                case 4:
                    System.out.println("\nEnter Roll Number Want's To Update:");
                    int roll_no = sc.nextInt();
                    System.out.println("Enter Updated Name:");
                    String StudentName = sc.next();
                    System.out.println("Enter Updated Mark:");
                    float StudentMark = sc.nextFloat();
                    stud.updateRecord(
                            new Student(roll_no, StudentName, StudentMark));
                    break;
                case 5:
                    System.out.println("Enter Roll Number Wants to Search:");
                    int studentRollno = sc.nextInt();
                    stud.findRecord(studentRollno);
                    break;

            }
        } while (ch != 6);

    }

}

class Student {

    private int rollno;
    private String name;
    private float mark;

    public Student() {
        super();
    }

    public Student(int rollno, String name, float mark) {
        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }

    /**
     * @return the rollno
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * @param rollno the rollno to set
     */
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mark
     */
    public float getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(float mark) {
        this.mark = mark;
    }

}
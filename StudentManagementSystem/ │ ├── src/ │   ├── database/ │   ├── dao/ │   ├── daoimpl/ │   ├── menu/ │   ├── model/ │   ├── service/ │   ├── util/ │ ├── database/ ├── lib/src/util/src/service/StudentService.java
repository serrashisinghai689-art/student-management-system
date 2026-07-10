package service;

import dao.StudentDAO;
import daoimpl.StudentDAOImpl;
import model.Student;
import util.Validation;

import java.util.List;

public class StudentService {

    private StudentDAO studentDAO;

    public StudentService() {

        studentDAO = new StudentDAOImpl();

    }

    // Add Student
    public boolean addStudent(Student student) {

        if (!Validation.isValidName(student.getFirstName())) {

            System.out.println("Invalid First Name");

            return false;

        }

        if (!Validation.isValidName(student.getLastName())) {

            System.out.println("Invalid Last Name");

            return false;

        }

        if (!Validation.isValidEmail(student.getEmail())) {

            System.out.println("Invalid Email");

            return false;

        }

        if (!Validation.isValidMobile(student.getMobile())) {

            System.out.println("Invalid Mobile Number");

            return false;

        }

        if (!Validation.isValidAge(student.getAge())) {

            System.out.println("Invalid Age");

            return false;

        }

        if (!Validation.isValidPercentage(student.getPercentage())) {

            System.out.println("Invalid Percentage");

            return false;

        }

        return studentDAO.addStudent(student);

    }

    // View Students
    public List<Student> getAllStudents() {

        return studentDAO.getAllStudents();

    }

    // Search Student by ID
    public Student searchStudent(int id) {

        return studentDAO.getStudentById(id);

    }

    // Search Student by Email
    public Student searchStudentByEmail(String email) {

        return studentDAO.getStudentByEmail(email);

    }

    // Update Student
    public boolean updateStudent(Student student) {

        return studentDAO.updateStudent(student);

    }

    // Delete Student
    public boolean deleteStudent(int id) {

        return studentDAO.deleteStudent(id);

    }

    // Count Students
    public int getStudentCount() {

        return studentDAO.getStudentCount();

    }

}

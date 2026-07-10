package dao;

import java.util.List;

import model.Student;

public interface StudentDAO {

    // Add Student
    boolean addStudent(Student student);

    // View All Students
    List<Student> getAllStudents();

    // Search Student by ID
    Student getStudentById(int studentId);

    // Search Student by Email
    Student getStudentByEmail(String email);

    // Update Student
    boolean updateStudent(Student student);

    // Delete Student
    boolean deleteStudent(int studentId);

    // Count Students
    int getStudentCount();

}

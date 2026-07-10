package daoimpl;

import dao.StudentDAO;
import database.DBConnection;
import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean addStudent(Student student) {

        String query = "INSERT INTO students(first_name,last_name,gender,age,email,mobile,course,city,percentage) VALUES(?,?,?,?,?,?,?,?,?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getGender());
            ps.setInt(4, student.getAge());
            ps.setString(5, student.getEmail());
            ps.setString(6, student.getMobile());
            ps.setString(7, student.getCourse());
            ps.setString(8, student.getCity());
            ps.setDouble(9, student.getPercentage());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return false;
    }

    @Override
    public List<Student> getAllStudents() {

        List<Student> studentList = new ArrayList<>();

        String query = "SELECT * FROM students";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Student student = new Student();

                student.setStudentId(rs.getInt("student_id"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setGender(rs.getString("gender"));
                student.setAge(rs.getInt("age"));
                student.setEmail(rs.getString("email"));
                student.setMobile(rs.getString("mobile"));
                student.setCourse(rs.getString("course"));
                student.setCity(rs.getString("city"));
                student.setPercentage(rs.getDouble("percentage"));

                studentList.add(student);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return studentList;

    }

    @Override
    public Student getStudentById(int studentId) {

        String query = "SELECT * FROM students WHERE student_id=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, studentId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Student student = new Student();

                student.setStudentId(rs.getInt("student_id"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setGender(rs.getString("gender"));
                student.setAge(rs.getInt("age"));
                student.setEmail(rs.getString("email"));
                student.setMobile(rs.getString("mobile"));
                student.setCourse(rs.getString("course"));
                student.setCity(rs.getString("city"));
                student.setPercentage(rs.getDouble("percentage"));

                return student;
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return null;

    }

    @Override
    public Student getStudentByEmail(String email) {

        String query = "SELECT * FROM students WHERE email=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Student student = new Student();

                student.setStudentId(rs.getInt("student_id"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setGender(rs.getString("gender"));
                student.setAge(rs.getInt("age"));
                student.setEmail(rs.getString("email"));
                student.setMobile(rs.getString("mobile"));
                student.setCourse(rs.getString("course"));
                student.setCity(rs.getString("city"));
                student.setPercentage(rs.getDouble("percentage"));

                return student;
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return null;

    }

    @Override
    public boolean updateStudent(Student student) {

        String query = "UPDATE students SET first_name=?, last_name=?, gender=?, age=?, email=?, mobile=?, course=?, city=?, percentage=? WHERE student_id=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getGender());
            ps.setInt(4, student.getAge());
            ps.setString(5, student.getEmail());
            ps.setString(6, student.getMobile());
            ps.setString(7, student.getCourse());
            ps.setString(8, student.getCity());
            ps.setDouble(9, student.getPercentage());
            ps.setInt(10, student.getStudentId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return false;

    }

    @Override
    public boolean deleteStudent(int studentId) {

        String query = "DELETE FROM students WHERE student_id=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, studentId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return false;

    }

    @Override
    public int getStudentCount() {

        String query = "SELECT COUNT(*) FROM students";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {

                return rs.getInt(1);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return 0;

    }

}

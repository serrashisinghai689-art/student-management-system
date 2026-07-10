package menu;

import java.util.List;
import java.util.Scanner;

import model.Student;
import service.StudentService;

public class Menu {

    private Scanner scanner;
    private StudentService studentService;

    public Menu() {
        scanner = new Scanner(System.in);
        studentService = new StudentService();
    }

    public void start() {

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("      STUDENT MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Search Student by Email");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("7. Count Students");
            System.out.println("8. Exit");
            System.out.print("\nEnter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchById();
                    break;

                case 4:
                    searchByEmail();
                    break;

                case 5:
                    updateStudent();
                    break;

                case 6:
                    deleteStudent();
                    break;

                case 7:
                    countStudents();
                    break;

                case 8:
                    System.out.println("Thank you for using Student Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);
    }

    private void addStudent() {

        Student student = new Student();

        System.out.print("First Name : ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Last Name : ");
        student.setLastName(scanner.nextLine());

        System.out.print("Gender : ");
        student.setGender(scanner.nextLine());

        System.out.print("Age : ");
        student.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Email : ");
        student.setEmail(scanner.nextLine());

        System.out.print("Mobile : ");
        student.setMobile(scanner.nextLine());

        System.out.print("Course : ");
        student.setCourse(scanner.nextLine());

        System.out.print("City : ");
        student.setCity(scanner.nextLine());

        System.out.print("Percentage : ");
        student.setPercentage(scanner.nextDouble());
        scanner.nextLine();

        boolean result = studentService.addStudent(student);

        if (result) {
            System.out.println("\nStudent Added Successfully.");
        } else {
            System.out.println("\nFailed to Add Student.");
        }
    }

    private void viewStudents() {

        List<Student> students = studentService.getAllStudents();

        if (students.isEmpty()) {

            System.out.println("\nNo Student Records Found.");

        } else {

            for (Student student : students) {

                System.out.println(student);

            }

        }

    }

    private void searchById() {

        System.out.print("Enter Student ID : ");

        int id = scanner.nextInt();

        scanner.nextLine();

        Student student = studentService.searchStudent(id);

        if (student != null)

            System.out.println(student);

        else

            System.out.println("Student Not Found.");

    }

    private void searchByEmail() {

        System.out.print("Enter Email : ");

        String email = scanner.nextLine();

        Student student = studentService.searchStudentByEmail(email);

        if (student != null)

            System.out.println(student);

        else

            System.out.println("Student Not Found.");

    }

    private void updateStudent() {

        System.out.print("Enter Student ID to Update : ");

        int id = scanner.nextInt();

        scanner.nextLine();

        Student student = studentService.searchStudent(id);

        if (student == null) {

            System.out.println("Student Not Found.");

            return;

        }

        System.out.print("New First Name : ");
        student.setFirstName(scanner.nextLine());

        System.out.print("New Last Name : ");
        student.setLastName(scanner.nextLine());

        System.out.print("New Gender : ");
        student.setGender(scanner.nextLine());

        System.out.print("New Age : ");
        student.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.print("New Email : ");
        student.setEmail(scanner.nextLine());

        System.out.print("New Mobile : ");
        student.setMobile(scanner.nextLine());

        System.out.print("New Course : ");
        student.setCourse(scanner.nextLine());

        System.out.print("New City : ");
        student.setCity(scanner.nextLine());

        System.out.print("New Percentage : ");
        student.setPercentage(scanner.nextDouble());
        scanner.nextLine();

        if (studentService.updateStudent(student))

            System.out.println("Student Updated Successfully.");

        else

            System.out.println("Update Failed.");

    }

    private void deleteStudent() {

        System.out.print("Enter Student ID : ");

        int id = scanner.nextInt();

        scanner.nextLine();

        if (studentService.deleteStudent(id))

            System.out.println("Student Deleted Successfully.");

        else

            System.out.println("Student Not Found.");

    }

    private void countStudents() {

        int count = studentService.getStudentCount();

        System.out.println("\nTotal Students : " + count);

    }

}

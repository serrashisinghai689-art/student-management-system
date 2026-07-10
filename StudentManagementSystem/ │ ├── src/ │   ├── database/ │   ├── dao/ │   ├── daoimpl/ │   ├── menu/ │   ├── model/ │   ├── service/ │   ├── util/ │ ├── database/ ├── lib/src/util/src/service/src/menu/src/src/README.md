# 🎓 Student Management System

A Java-based Student Management System developed using **Java 8, JDBC, and MySQL**. The application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records through a menu-driven console interface.

---

## 📌 Features

- Add Student
- View All Students
- Search Student by ID
- Search Student by Email
- Update Student Details
- Delete Student
- Count Total Students
- Input Validation
- Exception Handling
- JDBC Connectivity
- MySQL Database Integration

---

## 🛠️ Technologies Used

- Java 8
- JDBC
- MySQL (XAMPP)
- VS Code
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```
StudentManagementSystem
│
├── src
│   ├── database
│   │      DBConnection.java
│   ├── dao
│   │      StudentDAO.java
│   ├── daoimpl
│   │      StudentDAOImpl.java
│   ├── exception
│   │      StudentException.java
│   ├── menu
│   │      Menu.java
│   ├── model
│   │      Student.java
│   ├── service
│   │      StudentService.java
│   ├── util
│   │      Validation.java
│   └── Main.java
│
├── database
│      student_management.sql
│
├── README.md
└── .gitignore
```

---

## 🗄️ Database Setup

1. Start Apache and MySQL from XAMPP.
2. Open phpMyAdmin.
3. Create a database named:

```sql
student_management
```

4. Import the `student_management.sql` file.

---

## ▶️ How to Run

1. Clone this repository.

```
git clone https://github.com/yourusername/StudentManagementSystem.git
```

2. Open the project in VS Code.

3. Add `mysql-connector-j.jar` to the project.

4. Update the database username and password in:

```
DBConnection.java
```

5. Run:

```
Main.java
```

---

## 📚 Concepts Used

- Java OOP
- Encapsulation
- DAO Design Pattern
- JDBC
- MySQL
- Exception Handling
- CRUD Operations
- Collections
- Input Validation

---

## 📸 Screenshots

### Main Menu

(Add Screenshot Here)

### Add Student

(Add Screenshot Here)

### View Students

(Add Screenshot Here)

---

## 👩‍💻 Author

**Serrashi Singhai**

LinkedIn:
https://linkedin.com/in/serrashi-singhai-822867246

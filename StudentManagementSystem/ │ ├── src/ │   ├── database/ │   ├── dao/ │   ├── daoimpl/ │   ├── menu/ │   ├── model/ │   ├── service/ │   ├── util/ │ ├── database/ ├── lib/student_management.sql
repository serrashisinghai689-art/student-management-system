CREATE DATABASE IF NOT EXISTS student_management;

USE student_management;

CREATE TABLE students
(
    student_id INT PRIMARY KEY AUTO_INCREMENT,

    first_name VARCHAR(50) NOT NULL,

    last_name VARCHAR(50) NOT NULL,

    gender VARCHAR(10),

    age INT,

    email VARCHAR(100) UNIQUE,

    mobile VARCHAR(15),

    course VARCHAR(50),

    city VARCHAR(50),

    percentage DOUBLE,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

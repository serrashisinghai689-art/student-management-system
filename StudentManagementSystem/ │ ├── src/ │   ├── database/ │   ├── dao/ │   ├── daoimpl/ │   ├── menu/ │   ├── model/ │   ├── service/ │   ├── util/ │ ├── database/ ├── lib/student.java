package model;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String email;
    private String mobile;
    private String course;
    private String city;
    private double percentage;

    public Student() {

    }

    public Student(int studentId, String firstName, String lastName,
                   String gender, int age, String email,
                   String mobile, String course,
                   String city, double percentage) {

        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.mobile = mobile;
        this.course = course;
        this.city = city;
        this.percentage = percentage;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {

        return "\n----------------------------------------" +
               "\nStudent ID : " + studentId +
               "\nName       : " + firstName + " " + lastName +
               "\nGender     : " + gender +
               "\nAge        : " + age +
               "\nEmail      : " + email +
               "\nMobile     : " + mobile +
               "\nCourse     : " + course +
               "\nCity       : " + city +
               "\nPercentage : " + percentage +
               "\n----------------------------------------";
    }

}

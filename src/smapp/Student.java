/*
STUDENT NAME:Masike Junior Rasenyalo
STUDENT ID:ST10452404
PROJECT NAME:STUDENT-MANAGEMENT-APPLICATION BETA ROUGH
*/
package smapp;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String course;
    private int studentNumber;

    public Student(String name, String surname, int age, String email, String course, int studentNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.course = course;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
}
package day13.restassureddemo.pojoExp1;

import java.util.ArrayList;

public class StudentOne {

    String firstName;
    String lastName;
    String email;
    String programme;

    Course courses;


    public StudentOne(String firstName, String lastName, String email, String programme) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.programme = programme;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

}

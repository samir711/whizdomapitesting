package day13.restassureddemo.pojoExp4;

import java.util.ArrayList;

public class Student {

    String firstName;
    String lastName;
    String programme;
    String email;
    ArrayList<Course>  courses;

    public Student(String firstName, String lastName,  String email, String programme) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.programme = programme;
        this.email = email;
        courses = new ArrayList<Course>();
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

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public Course addCourse(String name, String score) {
        Course course  = new Course(name, score);
        courses.add(course);
        return course;


    }
}

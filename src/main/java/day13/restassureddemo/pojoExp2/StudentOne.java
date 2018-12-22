package day13.restassureddemo.pojoExp2;


import java.util.ArrayList;

public class StudentOne {

    String firstName;
    String lastName;
    String email;
    String programme;



    ArrayList<Course> courses;


    public StudentOne(String firstName, String lastName, String email, String programme) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.programme = programme;
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
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourses(String name, int score) {

        courses.add(new Course(name,score));

    }



}

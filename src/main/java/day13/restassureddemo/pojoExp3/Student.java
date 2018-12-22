package day13.restassureddemo.pojoExp3;

public class Student {

    private String programme;
    private String lastName;
    private String email;
    private String firstName;
    private Courses[] courses;

    public Student(String programme, String lastName, String email, String firstName) {
        this.programme = programme;
        this.lastName = lastName;
        this.email = email;
        this.firstName = firstName;


    }




    public String getProgramme ()
    {
        return programme;
    }

    public void setProgramme (String programme)
    {
        this.programme = programme;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public Courses[] getCourses ()
    {
        return courses;
    }

    public void setCourses (Courses[] courses)
    {
        this.courses = courses;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }


}

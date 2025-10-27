package college.faculty;

public class Faculty {
    private String facultyName;
    private String facultySubject;

    public Faculty(String facultyName,String facultySubject){
        this.facultyName = facultyName;
        this.facultySubject = facultySubject;
    }

    public void display(){
        System.out.println("Student name: " + facultyName);
        System.out.println("Student's Rollno.: " + facultySubject);
    }
}

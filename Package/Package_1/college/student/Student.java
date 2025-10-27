package college.student;

public class Student {
    private String studentName;
    private int studentRollNo;

    public Student(String studentName,int studentRollNo){
        this.studentName=studentName;
        this.studentRollNo=studentRollNo;
    }

    public void display(){
        System.out.println("Student name: " + studentName);
        System.out.println("Student's Rollno.: " + studentRollNo);
    }
}

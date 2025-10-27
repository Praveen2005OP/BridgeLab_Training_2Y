import college.student.Student;
import college.faculty.Faculty;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Student Name: ");
        String name = input.next();
        System.out.print("Student RollNo.: ");
        int rollno = input.nextInt();
        System.out.print("Faculty Name: ");
        String facultyname = input.next();
        System.out.print("subject Name: ");
        String subject = input.next();
        Student s1 = new Student(name,rollno);
        Faculty s2 = new Faculty(facultyname,subject);
        s1.display();
        s2.display();
    }
}

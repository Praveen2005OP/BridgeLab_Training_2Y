import java.util.Scanner;

public class AgeOfStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numofStudents = input.nextInt();
        int[] ages = new int[numofStudents];
        for (int i = 0; i < numofStudents; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
            if (ages[i] < 0) {
                System.out.println("Invalid age. Age must be positive.");
                i--;
            }
        }
        for (int j = 0; j < numofStudents; j++) {
            if (ages[j] >= 18) {
                System.out.println("Student with the age "+ages[j]+" can vote.");
            }
            else {
                System.out.println("Student with the age "+ages[j]+" cannot vote.");
            }
        }
    }
}

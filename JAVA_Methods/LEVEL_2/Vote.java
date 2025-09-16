import java.util.Scanner;

public class Vote {
    public static int[] ageOfStudents(int number) {
        int[] ages = new int[number];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }
        return ages;
    }
    public static boolean ableToVote(int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudent = input.nextInt();
        int[] ages = ageOfStudents(numberOfStudent);
        for (int i = 0 ; i<numberOfStudent ; i++) {
            if (ableToVote(ages[i])) {
                System.out.println("Student of age " + ages[i] + " is able to vote.");
            }
            else {
                System.out.println("Student of age " + ages[i] + " is not able to vote.");
            }
        }
    }
}

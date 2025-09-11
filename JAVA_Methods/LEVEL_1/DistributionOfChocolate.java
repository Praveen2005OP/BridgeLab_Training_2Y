import java.util.Scanner;

public class DistributionOfChocolate {
    public static void choco(int totalChocolates, int numStudents) {
        int chocolatesPerStudent = totalChocolates / numStudents;
        int remainingChocolates = totalChocolates % numStudents;
        System.out.println("Chocolates per student: " + chocolatesPerStudent);
        System.out.println("Remaining chocolates: " + remainingChocolates);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total chocolates: ");
        int totalChocolates = input.nextInt();
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        choco(totalChocolates, numStudents);
    }
}

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
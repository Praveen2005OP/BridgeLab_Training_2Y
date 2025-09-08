import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        if (n>0) {
            int sum = n * (n+1) / 2;
            System.out.println("Sum of natural numbers up to " + n + " is: " + sum);
        }
        else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}

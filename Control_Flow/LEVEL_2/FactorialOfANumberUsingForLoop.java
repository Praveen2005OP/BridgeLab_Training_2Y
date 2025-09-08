import java.util.Scanner;

public class FactorialOfANumberUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        double factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}

import java.util.Scanner;

public class SumofNaturalNumberUsingFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        int sum1 = 0;
        int sum = (n*(n+1))/2;
        while (n>0) {
            sum1 += n;
            n--;
        }
        System.out.println("Sum of natural numbers using formula: " + sum);
        System.out.println("Sum of natural numbers using loop: " + sum1);
    }
}

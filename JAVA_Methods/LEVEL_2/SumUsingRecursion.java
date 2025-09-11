import java.util.Scanner;

public class SumUsingRecursion {
    public static int sum(int n) {
        while (n!=0){
            return n + sum(n-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scanner.nextInt();
        int result = sum(n);
        int sumusingformula = (n*(n+1))/2;
        System.out.println("Sum of numbers from 1 to " + n + " is: " + result);
        System.out.println("Sum of numbers using formula from 1 to " + n + " is: " + sumusingformula);
        scanner.close();
    }
}

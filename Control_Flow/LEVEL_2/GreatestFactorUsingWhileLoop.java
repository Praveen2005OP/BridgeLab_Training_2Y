import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num1 = input.nextInt();
        int greatestfactor = 1;
        int i = 1;
        while (i <= num1) {
            if (num1 % i == 0) {
                greatestfactor = i;
            }
            i++;
        }
        System.out.println("Greatest factor of " + num1 + " is: " + greatestfactor);
    }
}

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        int greatestfactor = 1;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                greatestfactor = i;
            }
        }
        System.out.println("Greatest factor of " + num1 + " is: " + greatestfactor);
    }
}

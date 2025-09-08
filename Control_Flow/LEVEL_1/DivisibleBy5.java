import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check if it is divisible by 5: ");
        int number = input.nextInt();
        if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
    }
}

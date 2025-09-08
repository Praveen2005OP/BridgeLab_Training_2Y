import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter num3: ");
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largestest number is: " + num2);
        } else {
            System.out.println("Largest number is: " + num3);
        }
    }
}

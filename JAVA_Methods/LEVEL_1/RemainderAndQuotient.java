import java.util.Scanner;

public class RemainderAndQuotient {
    public static void remainderAndQuotient(int a, int b) {
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        remainderAndQuotient(num1, num2);
    }
}
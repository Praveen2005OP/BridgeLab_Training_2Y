import java.util.Scanner;

public class JAVA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.print("The sum is: " + sum);
    }
}

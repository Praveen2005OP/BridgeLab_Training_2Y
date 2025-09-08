import java.util.Scanner;

public class ToPrintOddandEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nOdd numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}

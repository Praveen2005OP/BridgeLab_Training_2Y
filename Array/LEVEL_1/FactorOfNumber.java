import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int[] factors = new int[10];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[count] = i;
                count++;
            }
        }
        System.out.print("Factors of " + n + " are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

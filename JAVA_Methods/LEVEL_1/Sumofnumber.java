import java.util.Scanner;

public class Sumofnumber {
    public static int Sumofnaturalnumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        int result = Sumofnaturalnumber(n);
        System.out.println("The sum of natural numbers up to " + n + " is: " + result);
    }
}

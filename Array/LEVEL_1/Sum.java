import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int n = 0;
        double sum = 0;
        while (n < 10) {
            System.out.print("Enter a number: ");
            numbers[n] = input.nextInt();
            if (numbers[n] <= 0) {
                break;
            }
            n++;
        }
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
    }
}

import java.util.Scanner;

public class MultipleBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        for (int i = 100; i >= 1; i--) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

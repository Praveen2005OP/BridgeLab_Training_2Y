import java.util.Scanner;

public class MultipleBelow100UsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        System.out.println("Multiples of " + n + " below 100 are:");
        int i = 100;
        while (i >= 1) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}

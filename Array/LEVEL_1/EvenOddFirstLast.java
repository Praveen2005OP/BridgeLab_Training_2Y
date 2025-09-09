import java.util.Scanner;

public class EvenOddFirstLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of inputs: ");
        int INPUT = input.nextInt();
        int[] numbers = new int[INPUT];
        for (int i = 0; i < INPUT; i++) {
            numbers[i] = input.nextInt();
        }
        for (int j = 0; j < INPUT; j++) {
            if (numbers[j] > 0) {
                System.out.print("Positive ");
            }
            else if (numbers[j] < 0) {
                System.out.print("Negative ");
            }
            else {
                System.out.print("Zero ");
            }
        }
        System.out.println("");
        for (int k = 0; k < INPUT; k++) {
            if (numbers[k] % 2 ==0) {
                System.out.print("Even ");
            }
            else {
                System.out.print("Odd ");
            }
        }
        System.out.println("");
        if (numbers[0] == numbers[INPUT - 1]) {
            System.out.println("First and last elements are equal.");
        }
        else if (numbers[0] < numbers[INPUT - 1]) {
            System.out.println("First element is smaller than last element.");
        }
        else {
            System.out.println("First element is greater than last element.");
        }
    }
}

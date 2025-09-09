import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        String[] array = new String[n];
        for (int i=0; i<n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                array[i] = "Fizz";
            } else if (i % 5 == 0) {
                array[i] = "Buzz";
            } else {
                array[i] = String.valueOf(i);
            }
        }
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
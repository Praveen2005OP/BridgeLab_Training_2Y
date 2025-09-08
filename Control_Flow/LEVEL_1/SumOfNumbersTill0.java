import java.util.Scanner;

public class SumOfNumbersTill0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0 && num > 0) {
            sum += num;
            num--;
        }
        System.out.println("Sum of numbers till 0 is: " + sum);
    }
}

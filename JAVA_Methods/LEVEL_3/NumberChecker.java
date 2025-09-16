import java.util.Scanner;

public class NumberChecker {
    public static int numbercounter(int number) {
        int count = 0;
        while (number!=0) {
            number = number/10;
            count++;
        }
        return count;
    }
    public static int[] checkNumber(int number, int count) {
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }
    public static boolean ducknumber(int[] digits, int count) {
        boolean isDuck = true;
        for (int i = 0; i<count; i++) {
            if (digits[i]==0){
                isDuck = false;
            }
        }
        return isDuck;
    }
    public static int armstrongNumber(int[] digits, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += Math.pow(digits[i], count);
        }
        return sum;
    }
    public static int[] sortedarray(int[] digits, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (digits[j] > digits[j + 1]) {
                    int temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = temp;
                }
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = numbercounter(number);
        int[] digits = checkNumber(number, count);
        if (ducknumber(digits, count)) {
            System.out.println("The number is a Duck Number.");
        }
        else{
            System.out.println("The number is not a Duck Number.");
        }
        if (armstrongNumber(digits, count) == number) {
            System.out.println("The number is an Armstrong Number.");
        }
        else {
            System.out.println("The number is not an Armstrong Number.");
        }
        System.out.println("The largest digit is: " + sortedarray(digits, count)[count - 1]);
        System.out.println("The second largest digit is: " + sortedarray(digits, count)[count - 2]);
        System.out.println("The smallest digit is: " + sortedarray(digits, count)[0]);
        System.out.println("The second smallest digit is: " + sortedarray(digits, count)[1]);
    }
}

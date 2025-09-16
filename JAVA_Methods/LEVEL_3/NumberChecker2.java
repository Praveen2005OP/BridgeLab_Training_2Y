import java.util.Scanner;

public class NumberChecker2 {
    public static int  digitcounter(int number) {
        int count = 0;
        while (number!=0) {
            number = number/10;
            count++;
        }
        return count;
    }
    public static int[] digits(int number, int count) {
        int[] digit = new int[count];
        for (int i = 0; i<count; i++) {
            digit[i] = number % 10;
            number = number / 10;
        }
        return digit;
    }
    public static int sumofdigits(int digit, int count) {
        int sum = 0;
        for (int i=0; i<count; i++) {
            sum += digit[i];
        }
        return sum;
    }
    public static int sumofsquareofdigits(int digit, int count) {
        int sum = 0;
        for (int i=0; i<count; i++) {
            sum += Math.sqrt(digit[i]);
        }
        return sum;
    }
    public static boolean checkharshadnumber(int number, int digit, int count){
        int sum = sumofdigits(digit, count);
        return number % sum == 0;
    }
    public static int[][] frequency(int digit, int count) {
        int[][] freq = new int[count][2];
        for (int i=0; i<count; i++){
            int count = 0;
            for (int j=0; j<count; j++) {
                if (digit[i] == digit[j]) {
                    freq[i][0] = digit[i];
                    count++;
                }
            }
            freq[i][1] = count;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digit = input.nextInt();
        int count = digitcounter(digit);
        int[] digits = digits(digit, count);
        int sum = sumofdigits(digits, count);
        int sumOfSquares = sumofsquareofdigits(digits, count);
        boolean isHarshad = checkharshadnumber(digit, digits, count);
        int[][] frequency = frequency(digits, count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad number: " + isHarshad);
        System.out.println("Digit frequency: ");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
        }
    }
}

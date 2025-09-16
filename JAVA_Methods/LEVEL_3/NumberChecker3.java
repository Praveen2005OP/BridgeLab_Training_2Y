import java.util.Scanner;

public class NumberChecker3 {
    public static int countdigit(int number) {
        int count = 0;
        while (number!=0) {
            count++;
            number=number/10;
        }
        return count;
    }
    public static int[] array(int number, int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = number % 10;
            number/=10;
        }
        return array;
    }
    public static int[] reversedarray(int number, int count) {
        int[] reversearray = new int[count];
        for (int i = 0; i < count; i++) {
            reversearray[i] = number % 10;
            number/=10;
        }
        return reversearray;
    }
    public static int reverse(int number) {
        int newnumber = 0;
        while (number != 0) {
            newnumber = newnumber * 10 + number % 10;
            number/=10;
        }
        return newnumber;
    }
    public static boolean palindrome(int[] array, int[] reversearray, int count) {
        int c = 0;
        boolean condition = true;
        for (int i = 0; i < count; i++) {
            if (array[i] == reversearray[i]) {
                c++;
            }
        }
        if (c == count) {
            condition = true;
        }
        else {
            condition = false;
        }
        return condition;
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = countdigit(number);
        int[] digits = array(number, count);
        int[] reverse = reversedarray(number, count);
        boolean isPalindrome = palindrome(digits, reverse, count);
        boolean isDuck = ducknumber(digits, count);
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
    }   
}

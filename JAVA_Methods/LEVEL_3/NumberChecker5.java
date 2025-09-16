import java.util.Scanner;

public class NumberChecker5 {
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum == number;
    }
    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum > number;
    }
    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum < number;
    }
    public static boolean isStrong(int number) {
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
            sum += fact;
        }
        return sum == number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
        }
        if (isAbundant(number)) {
            System.out.println(number + " is a abundant number.");
        }
        if (isDeficient(number)) {
            System.out.println(number + " is a deficient number.");
        }
        if (isStrong(number)) {
            System.out.println(number + " is a strong number.");
        }
    }
}

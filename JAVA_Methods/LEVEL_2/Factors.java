import java.util.Scanner;

public class Factors {
    public static int[] getFactors(int number, int[] countHolder) {
        int[] factors = new int[100];
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[count] = i;
                count++;
            }
        }
        countHolder[0] = count;
        for (int i = 0; i < count; i++) {
            System.out.print("Factor " + factors[i] + " ");
        }
        System.out.println();
        return factors;
    }

    public static int sumOfFactors(int[] factors, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static int squareSumOfFactors(int[] factors, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += factors[i] * factors[i];
        }
        return sum;
    }

    public static int productOfFactors(int[] factors, int count) {
        int product = 1;
        for (int i = 0; i < count; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        int[] countHolder = new int[1];
        int[] factors = getFactors(n, countHolder);
        int count = countHolder[0];
        
        System.out.println("Sum of factors: " + sumOfFactors(factors, count));
        System.out.println("Sum of squares of factors: " + squareSumOfFactors(factors, count));
        System.out.println("Product of factors: " + productOfFactors(factors, count));
        
        input.close();
    }
}

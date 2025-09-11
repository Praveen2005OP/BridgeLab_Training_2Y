import java.util.Scanner;

public class GreatestNumberAmongThree {
    public static int greatest(int a, int b, int c) {
        if (a>b && a>c) {
            return a;
        }
        else if (b>a && b>c) {
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int result = greatest(num1, num2, num3);
        System.out.println("The greatest number is: " + result);
    }
}

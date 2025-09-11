import java.util.Scanner;

public class Simpleinterest {
    public static int calculateSimpleInterest(int principal, int rate, int time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int principal = scanner.nextInt();
        System.out.print("Enter rate: ");
        int rate = scanner.nextInt();
        System.out.print("Enter time: ");
        int time = scanner.nextInt();
        int interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + interest);
    }
}

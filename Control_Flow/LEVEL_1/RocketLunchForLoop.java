import java.util.Scanner;

public class RocketLunchForLoop {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lunch second: ");
        int sec = input.nextInt();
        for (int i = sec; i >= 1; i--) {
            System.out.println("Rocket Lunch in " + i + " seconds");
        }
    }
}

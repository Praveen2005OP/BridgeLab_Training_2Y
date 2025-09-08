import java.util.Scanner;

public class RocketLunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lunch second: ");
        int sec = input.nextInt();
        while (sec >= 1) {
            System.out.println("Rocket Lunch in " + sec + " seconds");
            sec--;
        }
    }
}
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSalery = input.nextDouble();
        System.out.print("Enter the service year: ");
        double serviceYear = input.nextDouble();
        double bonus = 0;
        if (serviceYear > 5) {
            bonus = basicSalery * 0.1;
        }
        System.out.println("Bonus: " + bonus);
    }
}

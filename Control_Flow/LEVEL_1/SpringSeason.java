import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the date(1-31): ");
        int day = input.nextInt();
        if ((month==3) && (day>=20)) {
            System.out.print("It's a Spring Season");
        }
        else if ((month == 6) && (day<=20)) {
            System.out.print("It's a Spring Season");
        }
        else if (month>3 && month<6) {
            System.out.print("It's a Spring Season");
        }
        else {
            System.out.print("It's not a Spring Season");
        }
    }
}

import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason(int month, int date) {
        if (month == 3 && date >= 20 && date <=31) {
            return true;
        }
        else if (month > 3 && month < 6 && date >=1 && date <= 31) {
            return true;
        }
        else if (month == 6 && date >= 1 && date <=20) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter date (1-31): ");
        int date = scanner.nextInt();

        if (isSpringSeason(month, date)) {
            System.out.println("It's spring season.");
        } else {
            System.out.println("It's not spring season.");
        }
    }
}

import java.util.Scanner;

public class YoungestAmong3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age of first person: ");
        int age1 = input.nextInt();
        System.out.print("Enter age of second person: ");
        int age2 = input.nextInt();
        System.out.print("Enter age of third person: ");
        int age3 = input.nextInt();

        if (age1 < age2 && age1 < age3) {
            System.out.println("Youngest person is first person with age: " + age1);
        } else if (age2 < age1 && age2 < age3) {
            System.out.println("Youngest person is second person with age: " + age2);
        } else {
            System.out.println("Youngest person is third person with age: " + age3);
        }
    }
}
import java.util.Scanner;

public class tableform6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] table = new int[4];
        for (int i = 0; i < 4; i++) {
            table[i] = number * (i + 1);
        }
        System.out.println("Table");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " x " + (i + 1) + " = " + table[i]);
        }
    }
}

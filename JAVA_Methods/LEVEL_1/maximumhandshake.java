import java.util.Scanner;

public class maximumhandshake {
    public static int maxhandshake(int students) {
        return (students*(students - 1))/2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Student: ");
        int n = input.nextInt();
        System.out.print("The total number of handshakes is: " + maxhandshake(n));
    }
}

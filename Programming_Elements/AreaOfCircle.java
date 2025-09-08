import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = scanner.nextInt();
        double area = Math.PI * r * r;
        System.out.print("Area of circle: " + area);
    }
}
import java.util.Scanner;

public class JAVA3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int a = scanner.nextInt();
        int f= (a*9/5)+32;
        System.out.print(a + " Degree Celsius is equal to " + f + " Degree Fahrenheit");
    }
}

import java.util.Scanner;

public class BMI {
    public static int[] calculateBMI(int number, Scanner input) {
        int[] bmiResults = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            double height = input.nextDouble();
            double bmi = weight / ((height)/100 * (height)/100);
            bmiResults[i] = (int) bmi;
        }
        return bmiResults;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();
        int[] bmiResults = calculateBMI(numberOfPersons, input);
    }
}

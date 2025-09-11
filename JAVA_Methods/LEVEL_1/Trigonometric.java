import  java.util.Scanner;

public class Trigonometric {
    public double[] calculateTrigonometricFunctions(double angle) {
        double[] results = new double[3];
        results[0] = Math.sin(Math.toRadians(angle));
        results[1] = Math.cos(Math.toRadians(angle));
        results[2] = Math.tan(Math.toRadians(angle));
        return results;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();
        Trigonometric trig = new Trigonometric();
        double[] results = trig.calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}

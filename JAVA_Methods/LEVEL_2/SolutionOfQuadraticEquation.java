import java.util.Scanner;

public class SolutionOfQuadraticEquation {
    public static int[] findRoots(int a, int b, int c) {
        int delta = Math.sqrt(b) - (4 * a * c);
        if (delta > 0) {
            int[] root = new int[1];
            root[0] = (-1)*(b/(2*a));
            return root;
        }
        else if (delta<0) {
            int[] root = new int[0];
            return root;
        }
        else {
            int[] root = new int[2];
            root[0] = ((-1)*b + delta)/(2*a);
            root[1] = ((-1)*b - delta)/(2*a);
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic Equation ax^2+bx+c");
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        int[] roots = findRoots(a, b, c);
        for (int i=0; i<roots.length; i++) {
            System.out.println("Root " + (i+1) + ": " + roots[i]);
    }
}
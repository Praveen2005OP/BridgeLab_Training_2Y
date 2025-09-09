import java.util.Scanner;

public class Convertion2DTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = input.nextInt();
        System.out.print("\nEnter number of columns: ");
        int c = input.nextInt();
        int [][] arr2D = new int[r][c];
        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2D[i][j] = input.nextInt();
            }
        }
        int [] arr1D = new int[r*c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1D[index] = arr2D[i][j];
                index++;
            }
        }
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
    }
}

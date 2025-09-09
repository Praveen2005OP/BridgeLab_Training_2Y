import java.util.Scanner;

public class oddevenarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int o = n/2;
        int p = n-o;
        int[] even = new int[o];
        int[] odd = new int[p];
        int eIndex = 0;
        int oIndex = 0;
        for (int i = 1; i<=n; i++) {
            if (i%2==0) {
                even[eIndex] = i;
                eIndex++;
            } 
            else {
                odd[oIndex] = i;
                oIndex++;
            }
        }
        System.out.println("Even numbers: ");
        for (int j = 0; j < eIndex; j++) {
            System.out.print(even[j] + " ");
        }
        System.out.println("\nOdd numbers: ");
        for (int j = 0; j < oIndex; j++) {
            System.out.print(odd[j] + " ");
        }
    }
}

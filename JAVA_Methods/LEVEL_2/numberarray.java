import java.util.Scanner;

public class numberarray {
    public static int[] numbers(Scanner input) {
        int[] nums = new int[5];
        for (int i = 0;i<5;i++) {
            System.out.print("Enter a number: ");
            nums[i]=input.nextInt();
        }
        return nums;
    }
    public static boolean isPositive(int numbers) {
        if (numbers>0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isEven(int numbers) {
        if (numbers%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = numbers(input);
        for (int i=0;i<55;i++){
            if (isPositive(number[i])) {
                if (isEven(number[i])) {
                    System.out.print("The number "+number[i]+" is positive and even.");
                }
                else {
                    System.out.print("The number "+number[i]+" is positive and odd.");
                }
            }
            else {
                if (isEven(number[i])) {
                    System.out.print("The number "+number[i]+" is negative and even.");
                }
                else {
                    System.out.print("The number "+number[i]+" is negative and odd.");
                }
            }
        }

        input.close();
    }
}

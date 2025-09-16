import java.util.Scanner;

public class tallestandyoungest {

    public static int[] agesOf3(Scanner input) {
        int[] ages = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }
        return ages;
    }

    public static int[] heightsOf3(Scanner input) {
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = input.nextInt();
        }
        return heights;
    }

    public static int youngest(int[] age) {
        int young = age[0];
        for (int i = 1; i < 3; i++) {
            if (age[i] < young) {
                young = age[i];
            }
        }
        return young;
    }

    public static int tallest(int[] height) {
        int tall = height[0];
        for (int i = 1; i < 3; i++) {
            if (height[i] > tall) {
                tall = height[i];
            }
        }
        return tall;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] ages = agesOf3(input);
        int[] heights = heightsOf3(input);

        System.out.println("Youngest age is: " + youngest(ages));
        System.out.println("Tallest height is: " + tallest(heights));

        input.close();
    }
}

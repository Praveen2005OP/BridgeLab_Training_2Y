import java.util.Scanner;

public class shortesttallestmean {
    public static int[] heightofplayers(Scanner input) {
        int[] heights = new int[11];
        int i = 0;
        while (i<11) {
                System.out.print("Enter the heights of 11 players(cms):");
                heights[i] = input.nextInt();
                if (heights[i] > 150 && heights[i] < 250) {
                    i++;
                }
        }
        return heights;
    }
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }
    public static double findMean(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return (double) sum / heights.length;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] players = heightofplayers(input);
        System.out.println("Shortest player height: " + findShortest(players));
        System.out.println("Tallest player height: " + findTallest(players));
        System.out.println("Mean player height: " + findMean(players));
    }
}
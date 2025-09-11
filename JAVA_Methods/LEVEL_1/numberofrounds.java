public import java.util.Scanner;

public class numberofrounds {
   public numberofrounds() {
   }

   public static float roundsoftriangle(int var0, int var1, int var2, int var3) {
      float var4 = (float)var3 / (float)(var0 + var1 + var2);
      return var4;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the lengths of the three sides of the triangle: ");
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = var1.nextInt();
      System.out.print("Enter the number of km completed: ");
      int var5 = var1.nextInt();
      System.out.printf("The number of rounds is: %.2f\n", roundsoftriangle(var2, var3, var4, var5));
   }    
}

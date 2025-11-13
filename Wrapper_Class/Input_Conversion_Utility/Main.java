package Wrapper_Class.Input_Conversion_Utility;
import java.util.*;

public class Main {
	public static int safeParseInt(String input) {
		try {
			Integer.parseInt(input);
		}
		catch(NumberFormatException e) {
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string value: ");
		String n = input.next();
		System.out.println(safeParseInt(n));
	}
}

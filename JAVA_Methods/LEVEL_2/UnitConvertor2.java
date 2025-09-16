import java.util.Scanner;

public class UnitConvertor2 {
    public static double convertor(String unit, int value, String towhichunit){
        if (unit.equals("Yards") && towhichunit.equals("Feet")) {
            return value*3;
        }
        else if (unit.equals("Yards") && towhichunit.equals("Meters")) {
            return value*0.9144;
        }
        else if (unit.equals("Yards") && towhichunit.equals("Inches")) {
            return value*36;
        }
        else if (unit.equals("Yards") && towhichunit.equals("Cm")) {
            return value*1.609344;
        }
        else if (unit.equals("Feet") && towhichunit.equals("Yards")) {
            return value*0.333333;
        }
        else if (unit.equals("Feet") && towhichunit.equals("Meters")) {
            return value*0.3048;
        }
        else if (unit.equals("Feet") && towhichunit.equals("Inches")) {
            return value*12;
        }
        else if (unit.equals("Feet") && towhichunit.equals("Cm")) {
            return value*30.48;
        }
        else if (unit.equals("Meters") && towhichunit.equals("Yards")) {
            return value*1.09361;
        }
        else if (unit.equals("Meters") && towhichunit.equals("Feet")) {
            return value*3.28084;
        }
        else if (unit.equals("Meters") && towhichunit.equals("Inches")) {
            return value*39.3701;
        }
        else if (unit.equals("Meters") && towhichunit.equals("Cm")) {
            return value*100;
        }
        else if (unit.equals("Inches") && towhichunit.equals("Yards")) {
            return value*0.027778;
        }
        else if (unit.equals("Inches") && towhichunit.equals("Feet")) {
            return value*0.083333;
        }
        else if (unit.equals("Inches") && towhichunit.equals("Meters")) {
            return value*0.0254;
        }
        else if (unit.equals("Inches") && towhichunit.equals("Cm")) {
            return value*2.54;
        }
        else if (unit.equals("Cm") && towhichunit.equals("Yards")) {
            return value*0.0109361;
        }
        else if (unit.equals("Cm") && towhichunit.equals("Feet")) {
            return value*0.0328084;
        }
        else if (unit.equals("Cm") && towhichunit.equals("Meters")) {
            return value*0.01;
        }
        else if (unit.equals("Cm") && towhichunit.equals("Inches")) {
            return value*0.393701;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit you want to convert from (Yards, Feet, Meters, Inches, Cm): ");
        String fromUnit = input.nextLine();

        System.out.print("Enter the unit you want to convert to (Yards, Feet, Meters, Inches, Cm): ");
        String toUnit = input.nextLine();

        System.out.print("Enter the value you want to convert: ");
        int value = input.nextInt();
        
        double result = convertor(fromUnit, value, toUnit);
        System.out.println("Converted value: " + result + ' ' + toUnit);
    }
}

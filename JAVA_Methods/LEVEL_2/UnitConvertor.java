import java.util.Scanner;

public class UnitConvertor {
    public static double convertor(String unit, int value, String towhichunit){
        if (unit.equals("Km") && towhichunit.equals("Miles")) {
            return value*0.621371;
        }
        else if (unit.equals("Km") && towhichunit.equals("Feet")) {
            return value*3280.84;
        }
        else if (unit.equals("Km") && towhichunit.equals("Meters")) {
            return value*1000.0;
        }
        else if (unit.equals("Miles") && towhichunit.equals("Km")) {
            return value*1.609344;
        }
        else if (unit.equals("Miles") && towhichunit.equals("Feet")) {
            return value*5280;
        }
        else if (unit.equals("Miles") && towhichunit.equals("Meters")) {
            return value*1609.344;
        }
        else if (unit.equals("Meters") && towhichunit.equals("Km")) {
            return value*0.001;
        }
        else if (unit.equals("Meters") && towhichunit.equals("Feet")) {
            return value*3.28084;
        }
        else if (unit.equals("Meters") && towhichunit.equals("Miles")) {
            return value*0.0006213712;
        }
        else if (unit.equals("Feet") && towhichunit.equals("Miles")) {
            return value*0.0001893939;
        }
        else if (unit.equals("Feet") && towhichunit.equals("Km")) {
            return value*0.0003048;
        }
        else if (unit.equals("Feet") && towhichunit.equals("Meters")) {
            return value*0.3048;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit you want to convert from (Km, Miles, Meters, Feet): ");
        String fromUnit = input.nextLine();

        System.out.print("Enter the unit you want to convert to (Km, Miles, Meters, Feet): ");
        String toUnit = input.nextLine();

        System.out.print("Enter the value you want to convert: ");
        int value = input.nextInt();
        
        double result = convertor(fromUnit, value, toUnit);
        System.out.println("Converted value: " + result + ' ' + toUnit);
    }
}

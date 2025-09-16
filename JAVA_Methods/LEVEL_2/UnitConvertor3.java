import java.util.Scanner;

public class UnitConvertor3 {
    public static double convertor(String unit, int value, String towhichunit, String type){
        if (type.equals("Volume")) {
            if (unit.equals("Gallons") && towhichunit.equals("Liters")) {
                return value*3.78541;
            }
            else if (unit.equals("Liters") && towhichunit.equals("Gallons")) {
                return value*0.264172;
            }
            else {
                return 0;
            }
        }
        else if (type.equals("Weight")) {
            if (unit.equals("Pounds") && towhichunit.equals("Kilograms")) {
                return value*0.453592;
            }
            else if (unit.equals("Kilograms") && towhichunit.equals("Pounds")) {
                return value*2.20462;
            }
            else {
                return 0;
            }
        }
        else if (type.equals("Temperature")) {
            if (unit.equals("Celsius") && towhichunit.equals("Fahrenheit")) {
                return (value * 9/5) + 32;
            }
            else if (unit.equals("Fahrenheit") && towhichunit.equals("Celsius")) {
                return (value - 32) * 5/9;
            }
            else {
                return 0;
            }
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the type on which you want to do conversion (Volume, Weight, Temperature): ");
        String type = input.nextLine();

        System.out.print("Enter the unit you want to convert from (Farhenheit, Celsius, Pounds, Kilograms, Gallons, Liters): ");
        String fromUnit = input.nextLine();

        System.out.print("Enter the unit you want to convert to (Farhenheit, Celsius, Pounds, Kilograms, Gallons, Liters): ");
        String toUnit = input.nextLine();

        System.out.print("Enter the value you want to convert: ");
        int value = input.nextInt();
        
        double result = convertor(fromUnit, value, toUnit , type);
        System.out.println("Converted value: " + result + ' ' + toUnit);
    }
}

import java.util.Scanner;

public class Bonus2darray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the salary and years of experience after thee salary: ");
        int[][] employeeData = new int[10][2];
        int[][] bonusedsalary = new int[10][3];
        for (int i =0; i < 10 ; i++) {
            employeeData[i][0] = input.nextInt();
            employeeData[i][1] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (employeeData[i][1] > 5) {
                bonusedsalary[i][0] = (int) (employeeData[i][0] * 0.05);
                bonusedsalary[i][1] = employeeData[i][0] + bonusedsalary[i][0];
                bonusedsalary[i][2] = employeeData[i][1];
            } else {
                bonusedsalary[i][0] = (int) (employeeData[i][0] * 0.02);
                bonusedsalary[i][1] = employeeData[i][0] + bonusedsalary[i][0];
                bonusedsalary[i][2] = employeeData[i][1];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Bonus = " + bonusedsalary[i][0] + ", Total Salary = " + bonusedsalary[i][1] + ", Years of Experience = " + bonusedsalary[i][2]);
        }
    }
}

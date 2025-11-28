package JDBC_Student_Result_Management_System_App.src.main.java.com.tech.JDBC_Student_Result_Management_System_App;

import java.sql.*;
import java.util.*;

public class AppJDBC {
	private static final String url = "jdbc:mysql://localhost:3306/Student_management_database";
	private static final String username = "root";
	private static final String password = "Pr@220405";
	
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(url, username, password);
	}
	
	public static void addStudent() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		int id = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter Student Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Student Course: ");
		String course = input.nextLine();
		
		Connection connect = getConnection();
		PreparedStatement ps = connect.prepareStatement(
			"INSERT INTO student VALUES (?,?,?)"
		);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, course);
		
		ps.executeUpdate();
		System.out.println("Stuednts detail is added successfully.");
	}
	
	public static void viewStudents() throws Exception {
		Connection connect = getConnection();
		ResultSet rs= connect.createStatement().executeQuery("SELECT * FROM student");
		System.out.println("ID | Name | Course");
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" | "+rs.getString("name")+" | "+rs.getString("course"));
		}
	}
	
	public static void updateStudent() throws Exception{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Student ID which you want to edit: ");
		int id = input.nextInt();
		input.nextLine();
		System.out.print("Enter new student name: ");
		String name = input.nextLine();
		System.out.print("Enter the new student's course: ");
		String course = input.nextLine();
		
		Connection connect = getConnection();
		PreparedStatement ps = connect.prepareStatement(
				"UPDATE student SET name=?, course=? WHERE id=?"
		);		
		ps.setString(1,name);
		ps.setString(2,course);
		ps.setInt(3, id);
		
		ps.executeUpdate();
		System.out.println("The table is updated successfully.");
	}
	
	public static void deleteStudent() throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Student ID whose data you want to delete: ");
		int id = input.nextInt();
		
		Connection connect = getConnection();
		PreparedStatement ps = connect.prepareStatement(
			"DELETE FROM student WHERE id=?"
		);
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Student's recode is deleted successfully.");
	}
	
	public static String getGrade(double percentage) {
		if (percentage >= 90) return "A";
        if (percentage >= 75) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        return "F";
	}
	
	public static void addResult() throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Student ID: ");
		int id = input.nextInt();
		
		System.out.print("Enter the marks of Physics out of 100: ");
		int phy = input.nextInt();
		
		System.out.print("Enter the marks of Chemistry out of 100: ");
		int chem = input.nextInt();
		
		System.out.print("Enter the marks of Maths out of 100: ");
		int math = input.nextInt();
		
		int total = phy+chem+math;
		double percentage = (total/300.0)*100.0;
		String grade = getGrade(percentage);		
		
		Connection connect = getConnection();
		PreparedStatement ps = connect.prepareStatement(
			"INSERT INTO result VALUES (?,?,?,?,?,?,?)"
		);
		ps.setInt(1, id);
		ps.setInt(2, phy);
		ps.setInt(3, chem);
		ps.setInt(4, math);
		ps.setInt(5, total);
		ps.setDouble(6,percentage);
		ps.setString(7, grade);
		
		ps.executeUpdate();
		System.out.println("Student's result is added successfully.");
	}
	
	public static void viewResult() throws Exception {
		Connection connect = getConnection();
		ResultSet rs = connect.createStatement().executeQuery("SELECT * FROM result");
		System.out.println("ID | Physics | Chemistry | Maths | Total | Percentage | Grade");
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" | "+rs.getInt("phy")+" | "+rs.getInt("chem")+" | "+rs.getInt("math")+" | "+rs.getInt("total")+" | "+rs.getDouble("percentage")+rs.getString("grade"));
		}
	}
	
	public static void updateResult() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Student Id whose result you want to update: ");
		int id = input.nextInt();
		
		System.out.print("Enter the updated marks of Physics: ");
		int phy = input.nextInt();
		
		System.out.print("Enter the updated marks of Chemistry: ");
		int chem = input.nextInt();
		
		System.out.print("Enter the updated marks of Maths: ");
		int math = input.nextInt();
		
		int total = phy+chem+math;
		double percentage = (total/300.0)*100.0;
		String grade = getGrade(percentage);
		
		Connection connect = getConnection();
		PreparedStatement ps = connect.prepareStatement("UPDATE result SET phy=?, chem=?, math=?, total=?, percentage=?, grade=? WHERE id=?");
		ps.setInt(1,phy);
		ps.setInt(2, chem);
		ps.setInt(3, math);
		ps.setInt(4, total);
		ps.setDouble(5, percentage);
		ps.setString(6, grade);
		ps.setInt(7, id);
		
		ps.executeUpdate();
		System.out.println("Student's result is successfully updated.");
	}
	
	public static void removeResult() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Student's Id whose result you want to remove: ");
		int id = input.nextInt();
		Connection connect = getConnection();
		PreparedStatement ps = connect.prepareStatement("DELETE FROM result WHERE id=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Student's result is removed successfully.");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			boolean t = true;
			while(t==true) { 
				System.out.println("Student Result Management System ----------------------->");
				System.out.println("1.Add Student");
				System.out.println("2.View Student");
				System.out.println("3.Update Student");
				System.out.println("4.Delete Student");
				System.out.println("5.Add Result");
				System.out.println("6.View All Results");
				System.out.println("7.Update Result");
				System.out.println("8.Remove Result");
				System.out.println("9.Exit the App");
				System.out.print("Enter what you want to do: ");
				int n = input.nextInt();
				switch(n) {
				case 1:
					addStudent();
					break;
				case 2:
					viewStudents();
					break;
				case 3:
					updateStudent();
					break;
				case 4:
					deleteStudent();
					break;
				case 5:
					addResult();
					break;
				case 6:
					viewResult();
					break;
				case 7:
					updateResult();
					break;
				case 8:
					removeResult();
					break;
				case 9:
					t=false;
					System.out.println("Thank you, come again later.");
					break;
				default:
					System.out.println("Invalid Input!");
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

package trainingAssignments;

import java.util.Scanner;

public class Employee {
	String name;
	int id;
	String grade;
	int pay;
	String location;
	Scanner sc = new Scanner(System.in);
void getData() {
    System.out.println("Enter username:");
    name = sc.nextLine();
    System.out.println("Enter Id:");
    id = sc.nextInt(); 
	System.out.println("Enter Grade:");
	grade = sc.next();
	System.out.println("Enter Salary:");
	pay = sc.nextInt();
	System.out.println("Enter Location:");
	location = sc.next();
	
}	
	
void printData() {
	System.out.println("Employee name: " + name);
	System.out.println("Employee Id: " + id);
	System.out.println("Employee Grade: " + grade);
	System.out.println("Employee Salary: " + pay);
	System.out.println("Employee Location: " + location);
	}

}

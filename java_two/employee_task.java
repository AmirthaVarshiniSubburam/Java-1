package java_two;

import java.util.Scanner;

public class employee_task {
	
	

	public static void main(String[] args) {
		
		
		Integer employeeId;
		String employeeName;
		float basicSalary;
		float esi;
		float pf;
		float ta;
		float hra;
		String location;
		String department;
		float serviceInYears;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input Employee Id:");
		employeeId = s.nextInt();
		
		
		System.out.println("Input Employee name:");
		employeeName = s.next();
		
		
		System.out.println("Input Your Salary:");
		basicSalary = s.nextFloat();
		
		
		System.out.println("Input Your ESI:");
		esi = s.nextFloat();
		
		
		System.out.println("Input Your Travel Allowance:");
		ta = s.nextFloat();
		
		
		System.out.println("Input Your HRA:");
		hra = s.nextFloat();
		
		
		System.out.println("Input Your Location:");
		location = s.next();
		
		
		System.out.println("Input Your department:");
		department = s.next();
		
		
		System.out.println("Input serviceInYears:");
		serviceInYears = s.nextFloat();
		
		
		
		//Printing the details
		
		System.out.println("Employee id:"+ employeeId);
		System.out.println("Employee Name:"+ employeeName);
		System.out.println("Basic Salary:"+ basicSalary);
		System.out.println("ESI:"+ esi);
		System.out.println("Travel Allowance:"+ ta);
		System.out.println("HRA:"+ hra);
		System.out.println("Location:"+ location);
		System.out.println("Department:"+ department);
		System.out.println("Service in Years:"+ serviceInYears);
		
		
		

	}

}

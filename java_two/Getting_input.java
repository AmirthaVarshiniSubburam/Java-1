package java_two;

import java.util.Scanner;

public class Getting_input {

	public static void main(String[] args) {
		Integer studentId;
		String studentName;
		Integer age;
		float cgpa;
		char grade;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input Student Id:");
		studentId = s.nextInt();
		System.out.println("Your id:"+ studentId);
		System.out.println("Input Student Name:");
		studentName = s.next();
		System.out.println("Your Name:"+ studentName);
		System.out.println("Input Your Age:");
		age = s.nextInt();
		System.out.println("Your age:"+age);
		System.out.println("Input Your cgpa:");
		cgpa = s.nextInt();
		System.out.println("Your cgpa:"+cgpa);
		System.out.println("Input your grade:");
		grade = s.next().charAt(4);
		System.out.println("Your grade:"+grade);
		

	}

}

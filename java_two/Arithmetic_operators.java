package java_two;

import java.util.Scanner;

public class Arithmetic_operators {

	public static void main(String[] args) {
		
		float num1, num2 , sum, sub, multi, div, mod;

		
		Scanner s = new Scanner(System.in);
		System.out.println("num1=");
		num1 = s.nextFloat();
		
		System.out.println("num2=");
		num2 = s.nextFloat();
		
		sum = num1 + num2;
		System.out.println("Addition="+sum);
		
		sub = num1 - num2;
		System.out.println("Subtraction="+sub);
		
		multi = num1 * num2;
		System.out.println("Multiplication="+multi);
		
		div = num1 / num2;
		System.out.println("Divition="+div);
		
		mod = num1 % num2;
		System.out.println("Modules="+mod);
		
		
	}

}

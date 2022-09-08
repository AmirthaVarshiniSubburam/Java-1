package java_three;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int sum = 0;
		int num [] = new int [5];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input array elements");
		
		// to create array without for loop
//		 num [0] = scan.nextInt();
//		 num [1] = scan.nextInt();
//		 num [2] = scan.nextInt();
//		 num [3] = scan.nextInt();
//		 num [4] = scan.nextInt();
//		 
//		 
//		 System.out.println(num [0] + "-" + num[1] + "-" + num[2] + "-" + num[3] + "-" + num[4]);
//		
//		base for loop
		
//		for (int i=4;i<=5;i++) {
//		
//			System.out.println("Amirtha");
//		}
		
		for (int i =0 ;i<5;i++)
		{
			num [i] = scan.nextInt();	
			sum = num [i] + sum;
			
		}
		
		for (int i = 0;i<5;i++) {
		System.out.println(num [i]);
		}
		
		System.out.println(sum);
		
		
		


	}

}

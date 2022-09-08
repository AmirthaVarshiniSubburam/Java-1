package java_two;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		String userName, pword;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Input your User name and Password= ");
		
		userName = scan.next();
		pword = scan.next();
		
		if (userName.equals("Amirtha") && pword.equals("123"))
		{
			System.out.println("Welcome Amirtha");			
		}
		
		else
			
		{
			System.out.println("Invalid Creditails");
		}
		
		
	}

}

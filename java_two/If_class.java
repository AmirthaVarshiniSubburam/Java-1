package java_two;

import java.util.Scanner;

public class If_class {

	public static void main(String[] args) {
		double mark1, mark2, mark3;
		Scanner scan = new Scanner (System.in);
System.out.println("Input number1,number2 and number3");
mark1 = scan.nextDouble();
mark2 = scan.nextDouble();
mark3 = scan.nextDouble();
	
if (mark1>mark2 && mark1>mark3)
{
	System.out.println("mark 1 is greater");
	
}

else if (mark2>mark3)
{
	System.out.println("mark2 is greater");
	}

else
{
	System.out.println("mark 3 is greater");
}
}

		}

	

	
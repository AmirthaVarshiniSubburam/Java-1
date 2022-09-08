package java_two;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {		
		double mark1, mark2, mark3, mark4;
		Scanner scan = new Scanner (System.in);
System.out.println("Input mark1,mark2,mark3 and mark4");
mark1 = scan.nextDouble();
mark2 = scan.nextDouble();
mark3 = scan.nextDouble();
mark4 = scan.nextDouble();

String result = ((mark1>mark2) && (mark1>mark3) && (mark1>mark4))? "Mark1 is greater" : ((mark2>mark3) && (mark2>mark4))? "Mark2 is greater" : (mark3>mark4)? "Mark3 is greater": "Mark4 is greater";

System.out.println("Result="+result);

	}

}

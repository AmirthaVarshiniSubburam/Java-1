package java_three;

public class Ooops_cls {
	
	
		
	

	public class Customer {
		//Data members
		private int accNum;
		private String aName;
		private int balance;
		
		public void deposit() {
			System.out.println(aName+ "has deposited");			
		}
		
		public void withdraw () {
			System.out.println(aName+ "has withdrawen");
		}
		
		public void displayDetails() {
			System.out.println("Account Number=" +accNum);
			System.out.println("Account holder name="+ aName);
			System.out.println("Account balance="+ balance );
		}

	}
	
	}




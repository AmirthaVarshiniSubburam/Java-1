package java_five;

public class StringUtility {
	public void sayHello() {
		System.out.println("Hello World");
	}
	
	public String getName() {
		return "Amirtha Varshini";
		
	}

	public int getNameLength(String name) {
		return name.length();
	}
	
	public String joinName(String fName,String lName) {
		return fName + "" +lName;
	}
	
	public char getFirstLetter(String name) {
		return name.charAt(0);
	}
}

package java_three;

public class Student_cls {
	public static void main(String[] args) {
		Student amit = new Student();
		
		//setter method
		amit.setSid(101);
		amit.setStudentName("Amit");
		amit.setStandard(5);
		
		//getter method
		System.out.println("Student Id:"+ amit.getSid());
		System.out.println("StudentName:"+ amit.getStudentName());
		System.out.println("Standard:"+ amit.getStandard());
		
		amit.DisplayDetails();
		
	}

}

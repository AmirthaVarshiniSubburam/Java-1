package java_three;

public class Student {

	private int sid;
	private String studentName;
	private int standard;
	
	//getter method
	
	public int getSid() {
		return sid;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStandard() {
		return standard;
	}
			
	//setter method
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public void setStudentName(String studentname) {
		this.studentName = studentname;
	}
	
	public void setStandard(int standard) {
		this.standard = standard;
	}

	
	public void DisplayDetails()
	{
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+studentName);
		System.out.println("Standard: "+standard);
	}

}

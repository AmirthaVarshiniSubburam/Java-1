package java_three;

public class Car {
	private int plateNo;
	private String color;
	private String make;
	
	
	//Default constructor
	
	public Car() {
		plateNo =869;
		color="yellow";
		make="2001";
	}
	
	
	
	// Parametric constructor
	
	public Car(int plateNo, String color, String make) {
		
		this.plateNo = plateNo;
		this.color = color;
		this.make = make;
	}
	
	public void displayCar() {
		System.out.println("Plate number is"+ plateNo);
		System.out.println("Color is"+ color);
		System.out.println("Make is"+ make);
	}



	public int getPlateNo() {
		return plateNo;
	}



	public void setPlateNo(int plateNo) {
		this.plateNo = plateNo;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		this.make = make;
	}
	
				
		
}




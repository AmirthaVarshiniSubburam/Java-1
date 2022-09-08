package java_three;

public class Car_Main {

	public static void main(String[] args) {
//		Car dcar = new Car(123,"black","2017");
//		dcar.displayCar();
		
		Car bcar = new Car();
		bcar.displayCar();
		
		bcar.setColor("pink");
		
		bcar.getColor();
		bcar.displayCar();
		
		System.out.println(bcar.getColor());
	}

}

package java_five;

public class MainClassAnimal {

	public static void main(String[] args) {
		Animal lion = new Lion();
		
		lion.drink();
		lion.sleep();
		
		Animal cat = new Cat();
		
		cat.drink();
		cat.sleep();
		
		Animal elephant = new Animal() {

			@Override
			public void drink() {
				System.out.println("Elephant drinks water");
				
			}

			@Override
			public void sleep() {
				System.out.println("Elephant sleeps like me");
				
			}
			
		};
		
		elephant.drink();
		elephant.sleep();
			
		
		

	}

}

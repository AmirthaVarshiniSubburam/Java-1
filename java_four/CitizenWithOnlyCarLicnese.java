package java_four;

public class CitizenWithOnlyCarLicnese implements CarLicense{

	@Override
	public void applyForLLRForCarLicense() {
		System.out.println("has to apply for LLR ");
		
	}

	@Override
	public void payFeeForCarLicense() {
		System.out.println("has to pay License fee");
		
	}

	@Override
	public void carDriveTest() {
		System.out.println("has to take drive test");
		
	}

}

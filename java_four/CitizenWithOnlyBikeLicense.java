package java_four;

public class CitizenWithOnlyBikeLicense implements BikeLicense {

	@Override
	public void applyForLLRForBikeLicense() {
		System.out.println("Has to apply for LLr");
		
	}

	@Override
	public void payFeeForBikeLicense() {
		System.out.println("has to pay fee for bike license");
		
		
	}

	@Override
	public void bikeDrivetest() {
		System.out.println("has to take drive test");
		
	}

}

package java_four;

public class MainLicense {
	
	public static void main(String[] args) {
		
		CitizenWithOnlyBikeLicense Amirtha = new  CitizenWithOnlyBikeLicense();
		CitizenWithOnlyCarLicnese Varshini = new CitizenWithOnlyCarLicnese();
		
		
		Amirtha.applyForLLRForBikeLicense();
		Amirtha.bikeDrivetest();
		Amirtha.payFeeForBikeLicense();
		
		Varshini.applyForLLRForCarLicense();
		Varshini.payFeeForCarLicense();
		Varshini.carDriveTest();
		
	}

}

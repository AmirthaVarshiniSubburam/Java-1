package java_four;

public class CustomerInterface implements NetBank,HomeLoan {

	@Override
	public void fillInApplicationForm() {
		System.out.println("Fill the Home Loan Application Form");
		
	}

	@Override
	public void submitRequiredDocuments() {
		System.out.println("Submit the filled documents");
		
	}

	@Override
	public void awaitForBankConfirmation() {
		System.out.println("Wait for the banks response");
		
	}

	@Override
	public void openRegisterPage() {
		System.out.println("Open bank portal");
		
	}

	@Override
	public void createUserName() {
		System.out.println("Create Login Creditials");
		
	}

	@Override
	public void tryToLogin() {
		System.out.println("Try to Login");
		
	}
	
}

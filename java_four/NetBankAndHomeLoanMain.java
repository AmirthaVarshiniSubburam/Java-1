package java_four;

public class NetBankAndHomeLoanMain {

	public static void main(String[] args) {
		CustomerInterface amir = new CustomerInterface();
		CustomerInterface varshini = new CustomerInterface();
		CustomerInterface ammu = new CustomerInterface();
				
		
		amir.openRegisterPage();
		amir.createUserName();
		amir.tryToLogin();
		
		amir.fillInApplicationForm();
		amir.submitRequiredDocuments();
		amir.awaitForBankConfirmation();
		
		varshini.fillInApplicationForm();
		varshini.submitRequiredDocuments();
		varshini.awaitForBankConfirmation();
		
		ammu.openRegisterPage();
		ammu.createUserName();
		ammu.tryToLogin();
									
		}
}

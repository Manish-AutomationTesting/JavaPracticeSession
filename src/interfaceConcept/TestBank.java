package interfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		//ICICIBank class object
		ICICIBank icici=new ICICIBank();
		icici.autoLoan();
		icici.credit();
		icici.debit();
		icici.educationLoan();
		icici.homeLoan();
		icici.transferMoney();
		
		System.out.println("******");
		USBank usbank=new ICICIBank();
		usbank.credit();
		usbank.debit();
		usbank.transferMoney();
		System.out.println("********");
		RBI  rbiBank=new ICICIBank();
		rbiBank.autoLoan();
		rbiBank.educationLoan();
		rbiBank.homeLoan();
	}

}

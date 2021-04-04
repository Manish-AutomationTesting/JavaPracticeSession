package interfaceConcept;

public class ICICIBank implements RBI, USBank {

	// USBank Interface
	@Override
	public void credit() {
		System.out.println("USBank---credit");

	}

	@Override
	public void debit() {
		System.out.println("USBank---debit");

	}

	@Override
	public void transferMoney() {
		System.out.println("USBank---transferMoney");

	}

	// RBI Bank Interface
	@Override
	public void educationLoan() {

		System.out.println("RBI---educationLoan");
	}

	@Override
	public void homeLoan() {
		System.out.println("RBI---homeLoan");

	}

	@Override
	public void autoLoan() {
		System.out.println("RBI---autoLoan");

	}

}

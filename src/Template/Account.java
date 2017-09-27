package Template;

public abstract class Account {
    public final double calculateInterest() {
    	double interestRate = doCalculateInterest();
    	String accountType = doCalculateAccountType();
    	double amount = calculateAmount(accountType);
		return amount*interestRate;
    	
    }

	private double calculateAmount(String accountType) {
		// TODO Auto-generated method stub
		return 7243.00;
	}

	protected abstract  String doCalculateAccountType();
	

	protected abstract double doCalculateInterest();
}

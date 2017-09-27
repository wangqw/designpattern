package Template;

public class CDAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return "Certificate of Deposite";
	}

	@Override
	protected double doCalculateInterest() {
		// TODO Auto-generated method stub
		return 0.06;
	}

}

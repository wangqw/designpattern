package Template;

public class MoneyMarketAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return "Money Market";
	}

	@Override
	protected double doCalculateInterest() {
		// TODO Auto-generated method stub
		return 0.045;
	}

}

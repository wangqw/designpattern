package Template;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Account account = new MoneyMarketAccount();
       System.out.println("�����г��˺ŵ���Ϣ��Ϊ��"+account.calculateInterest());
        account= new CDAccount();
        System.out.println("�����˺ŵ���Ϣ��Ϊ��"+account.calculateInterest());
	}

}

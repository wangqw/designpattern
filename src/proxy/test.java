package proxy;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       IUserDao target = new UserDao();
       System.out.println(target.getClass());
       IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
       System.out.println(proxy.getClass());
       proxy.save();
	}

}

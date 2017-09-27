package Staticagents;

public class test {
   public static void main(String[] args) {
	UserDao target = new UserDao();
	UserDaoProxy proxy = new UserDaoProxy(target);
	proxy.save();
}
}

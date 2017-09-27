package Staticagents;

public class UserDaoProxy implements IUserDao {
    private IUserDao target;
    public UserDaoProxy(IUserDao target) {
    	this.target = target;
    }
	@Override
	public void save() {
		// TODO Auto-generated method stub
      System.out.println("开始事务-------------------");
      target.save();
      System.out.println("提交事务-----------------------");
	}

}

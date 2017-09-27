package Staticagents;

public class UserDaoProxy implements IUserDao {
    private IUserDao target;
    public UserDaoProxy(IUserDao target) {
    	this.target = target;
    }
	@Override
	public void save() {
		// TODO Auto-generated method stub
      System.out.println("��ʼ����-------------------");
      target.save();
      System.out.println("�ύ����-----------------------");
	}

}

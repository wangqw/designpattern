package Strategy;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("����Ľ�����ǧ��ٹ�");
         System.out.println("------------------------------------------");
         Context context = new Context(new Dog());
         System.out.println(context.Sound("С��")+"\n-----------------------");
          context = new Context(new Cat());
          System.out.println(context.Sound("Сè")+"\n-----------------------");
          context = new Context(new Cat());
          System.out.println(context.Sound("Ѽ��")+"\n-----------------------");
	}

}

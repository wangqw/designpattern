package Strategy;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("动物的叫声，千奇百怪");
         System.out.println("------------------------------------------");
         Context context = new Context(new Dog());
         System.out.println(context.Sound("小狗")+"\n-----------------------");
          context = new Context(new Cat());
          System.out.println(context.Sound("小猫")+"\n-----------------------");
          context = new Context(new Cat());
          System.out.println(context.Sound("鸭子")+"\n-----------------------");
	}

}

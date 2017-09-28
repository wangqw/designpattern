package singleton;

public class Singleton1 {
    private Singleton1() {
    	
    }
    private static class SingletonHolder{
    	private static Singleton1  instance = new Singleton1();
    }
    public static Singleton1  getInstance() {
    	return SingletonHolder.instance;
    }
}

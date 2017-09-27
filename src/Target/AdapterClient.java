package Target;

public class AdapterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ITarget adapter = new Adapter();
     adapter.request();
     ITarget target = new ConcreteTarget();
     target.request();
	}

}

package Target;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adapter implements ITarget {
    private static Logger log = LoggerFactory.getLogger(Adapter.class);
    private Adaptee  adaptee = new Adaptee();
	@Override
	public void request() {
		// TODO Auto-generated method stub
		log.info("Adapter.request()");
		adaptee.onRequest();

	}

}

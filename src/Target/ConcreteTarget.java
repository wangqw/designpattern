package Target;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteTarget implements ITarget {
	 private static Logger LOG = LoggerFactory.getLogger(ConcreteTarget.class);
	@Override
	public void request() {
		// TODO Auto-generated method stub
    LOG.info("ConcreteTarget.request()");
	}

}

package Decorator;

public class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
    	this.component = component;
    }
	@Override
	public void sampleOpreation() {
		// TODO Auto-generated method stub
       component.sampleOpreation();
	}

}

package Decorator;

public class Bird extends Change {

	public Bird(TheGreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void move() {
		System.out.println("Bird Move");
	}

}

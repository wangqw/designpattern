package Decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TheGreatestSage sage = new Monkey();
         TheGreatestSage bird = new Bird(sage);
         TheGreatestSage fish  = new Fish(sage);
         fish.move();
	}

}

package Observer;

public class JobSeeker implements Observer {
	private String name;
	public JobSeeker(String name) {
		this.name = name;
	}

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"got notified!");
		System.out.println(subject);
	}

}

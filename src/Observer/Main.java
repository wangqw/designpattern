package Observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HeadCounter headCounter = new HeadCounter();
      headCounter.registObserver(new JobSeeker("Mike"));
      headCounter.registObserver(new JobSeeker("Chris"));
      headCounter.registObserver(new JobSeeker("Tom"));
      headCounter.addJob("Google Job");
      headCounter.addJob("Yahoo Job");
      
	}

}

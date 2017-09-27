package Observer;

import java.util.ArrayList;
import java.util.List;


public class HeadCounter implements Subject {
	private List<Observer> observerList;
	public List<String> jobList;
	public HeadCounter() {
		observerList =new ArrayList<Observer>();
		jobList =new ArrayList<String>();
	}

	@Override
	public void registObserver(final Observer observer) {
		
       if(!observerList.contains(observer)) {
    	   observerList.add(observer);
       }
	}

	@Override
	
	public void removeObserver(final Observer observer) {
		// TODO Auto-generated method stub
        if(observerList.contains(observer)) {
        	observerList.remove(observer);
        }
	}

	 @Override
	 
	     public void notifyAllObservers() {
	 
	         for(Observer observer : observerList){
	 
	             observer.update(this);
	 
	         }
	 
	     }
	 
	  

	public void addJob(final String job) {
		this.jobList.add(job);
	}
	public List<String> getJobs(){
		return jobList;
	}
    public String toString() {
    	return jobList.toString();
    }
}

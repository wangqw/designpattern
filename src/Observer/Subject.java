package Observer;


public interface Subject {
      public void registObserver(Observer observer);
      public void removeObserver(Observer observer);
      public void notifyAllObservers();
}

package AbstractFactory;

public class IntelCpu implements Cpu {
	private int pins  = 0;
	public IntelCpu (int pins) {
		this.pins = pins;
	}
    @Override
	public void conculate() {
		// TODO Auto-generated method stub
      System.out.println("Intel Cpu µÄÕë½ÅÊı£º"+pins);
	}

}

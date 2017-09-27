package SimpleFactory;

public class AmdCpu implements Cpu{
	
	private int pins = 0;
	public AmdCpu(int pins) {
		this.pins = pins;
	}

	@Override
	public void conculate() {
		// TODO Auto-generated method stub
		System.out.println("AmdCpu µÄÕë½ÅÊı"+pins);
	}
	

}

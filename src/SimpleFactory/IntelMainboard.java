package SimpleFactory;

public class IntelMainboard implements Mainboard {
	private int cpuHoles = 0;
	public IntelMainboard(int cpuHoles) {
		this.cpuHoles= cpuHoles;
	}

	@Override
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("Intel主板的CPU槽孔数是"+cpuHoles);
		
	}

}

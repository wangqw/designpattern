package SimpleFactory;

public class AmdMainboard implements Mainboard {
	private int cpuHoles = 0;
	public AmdMainboard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
		
	}

	@Override
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("AmdMainboard�����CPU��ײ�����"+cpuHoles);

	}

}

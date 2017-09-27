package AbstractFactory;

public class AmdFactory implements AbstractFactory {

	@Override
	public Cpu CreateCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(938);
	}

	@Override
	public Mainboard CreareMainboard() {
		// TODO Auto-generated method stub
		return new IntelMainboard(938);
	}

}

package AbstractFactory;

public class IntelFactory implements  AbstractFactory{

	@Override
	public Cpu CreateCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(755);
	}

	@Override
	public Mainboard CreareMainboard() {
		// TODO Auto-generated method stub
		return new IntelMainboard(755);
	}

}



package AbstractFactory;

public class ComputerEngineer {
       private Cpu cpu = null;
       private Mainboard mainboard = null;
       public void makeComputer(AbstractFactory af) {
    	   prepareHardwares(af);
       }
	private void prepareHardwares(AbstractFactory af) {
		// TODO Auto-generated method stub
		this.cpu = af.CreateCpu();
		this.mainboard = af.CreareMainboard();
		this.cpu.conculate();
		this.mainboard.installCPU();
	}
}

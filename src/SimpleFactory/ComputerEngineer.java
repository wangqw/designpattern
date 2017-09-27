package SimpleFactory;

public class ComputerEngineer {
   private Cpu cpu = null;
   private Mainboard mainboard = null;
   public void makeComputer(int cpuType,int mainboard) {
	   prapareHardwared(cpuType,mainboard);
   }
private void prapareHardwared(int cpuType, int mainboard) {
	// TODO Auto-generated method stub
	this.cpu= CpuFactory.CreateCpu(cpuType);
	this.mainboard = MainboardFactory.createMainboard(mainboard);
	this.cpu.conculate();
	this.mainboard.installCPU();
	
}
}

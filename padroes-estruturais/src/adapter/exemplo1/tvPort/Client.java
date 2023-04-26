package adapter.exemplo1.tvPort;

import adapter.exemplo1.tvPort.adapters.HDMIToVGAAdapter;
import adapter.exemplo1.tvPort.devices.Computer;
import adapter.exemplo1.tvPort.devices.OldMonitor;
import adapter.exemplo1.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor ----------");

		Computer pc2 = new Computer();
		OldMonitor oldMonitor = new OldMonitor();

		pc2.connectPort(new HDMIToVGAAdapter(oldMonitor));
		pc2.sendImageAndSound("Video", "Som");
	}
}

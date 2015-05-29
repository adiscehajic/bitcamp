package exercises;

public class PC {

	private String version;
	private int productionYear;
	private boolean isWorking;
	private int ramMemory;
	private int hddMemory;
	
	public PC (String ver, int prd, boolean isw, int ram, int hdd){
		version = ver;
		productionYear = prd;
		isWorking = isw;
		ramMemory = ram;
		hddMemory = hdd;
	}
	
	public String toString() {
		String s = "";
		s = s + "Version: " + version + "\n";
		s = s + "Production year: " + productionYear + "\n";
		s = s + "Is working: " + isWorking + "\n";
		s = s + "RAM memory: " + ramMemory + "\n";
		s = s + "HDD memory: " + hddMemory + "\n";
		
		return s;
	}
}

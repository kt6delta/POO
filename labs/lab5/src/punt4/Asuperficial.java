package punt4;

public class Asuperficial {

	private int hal;
	private int rad;	
	private double Asup;
	
	public double getAsuper(int hal,int rad){
		this.hal=hal;
		this.rad=rad;
		Asup=2*Math.PI*rad*(rad+hal);
		return Asup;
	}
	
}

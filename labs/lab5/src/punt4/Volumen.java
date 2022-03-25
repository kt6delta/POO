package punt4;

public class Volumen {

	private int hal;
	private int rad;
	private double V;
	
	public double getVolu(int hal, int rad){
		this.hal=hal;
		this.rad=rad;
		V=Math.PI*Math.pow(rad, 2)*hal;
		return V;
	}
	
	
}

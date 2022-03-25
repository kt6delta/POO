package punt2;

public class Lado {
	//atributos
	private int lad1;
	private int lad2;
	private double angu;
	private double L;
	//get and set
	public int getLad1() {
		return lad1;
	}

	public void setLad1(int lad1) {
		this.lad1 = lad1;
	}

	public int getLad2() {
		return lad2;
	}

	public void setLad2(int lad2) {
		this.lad2 = lad2;
	}

	public double getAngu() {
		return angu;
	}

	public void setAngu(double angu) {
		this.angu = angu;
	}

	public double getL() {
		return L;
	}

	public void setL(double l) {
		L = l;
	}
	
	//metodo
	public void getL(int lad1, int lad2, double angu) {
		//teorema del coseno
		L=Math.pow(lad1, 2)+Math.pow(lad2,2)-(2*lad1*lad2*Math.cos(angu)); 
		L=Math.pow(L, 0.5);
		System.out.println("el tercer lado mide: "+ L);
	}

}

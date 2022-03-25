package punt1;

public class Area {
	//atributos
	private int lad1;
	private int lad2;
	private int lad3;
	private double Semip;
	private double Asup;
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

		public int getLad3() {
			return lad3;
		}

		public void setLad3(int lad3) {
			this.lad3 = lad3;
		}

		public double getSemip() {
			return Semip;
		}

		public void setSemip(double semip) {
			Semip = semip;
		}

		public double getAsup() {
			return Asup;
		}

		public void setAsup(double asup) {
			Asup = asup;
		}
	
	//metodo
	public double getAsup(int lad1, int lad2, int lad3) {
		//formula de heron
		Semip=0.5*(lad1+lad2+lad3);
		Asup= Semip*(Semip-lad1)*(Semip-lad2)*(Semip-lad3);
		Asup=Math.pow(Asup, 0.5);
		return Asup;
	}
}

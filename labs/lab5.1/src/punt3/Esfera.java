/*laura catalina preciado
 * Volumen y Area superficial de la esfera
 * abril 28 del 2019
 * version 1.0
 */
package punt3;
public class Esfera {
	//atributos
	private int radio;
	private double V;
	private double Asuper;
		//set and get
		public int getRadio() {
			return radio;
		}

		public void setRadio(int radio) {
			this.radio = radio;
		}

		public double getV() {
			return V;
		}

		public void setV(double v) {
			V = v;
		}

		public double getAsuper() {
			return Asuper;
		}

		public void setAsuper(double asuper) {
			Asuper = asuper;
		}
		//constructores
		public Esfera(){
			radio=1;
		}
		public Esfera(int radio){
			this.radio=radio;
		}
		//metodos
		private double Volumen(){
			V=4*Math.PI*Math.pow(radio, 3)/3;
			return V;
		}
		private double Superficie(){
			Asuper=4*Math.PI*Math.pow(radio, 2);
			return Asuper;
		}
		public void imprimir(){
			System.out.println("el Area superficial es: "+Superficie());
			System.out.println("el Volumen es: "+ Volumen());
		}

	}

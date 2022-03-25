package punut1;

public class Ave extends Animal {
	public String clase() {
		return "Clase: AVE";
	}
	
	public String cantidad(int j) { //entrega el dato de los animales
		if(j==1){
			Tucan mostrar = new Tucan();
			return mostrar.getCa();
		}
		else{
			Aguila mostrar2 = new Aguila();
			return mostrar2.getCa();
		}
	}
	
	public String nombre(int i) {
		if(i==1){
			Tucan mostrar = new Tucan();
			return mostrar.getNo();
		}
		else{
			Aguila mostrar2 = new Aguila();
			return mostrar2.getNo();
		}
	}
}
package punut1;

public class Reptiles extends Animal {

	public String clase() {
		return "Clase: REPTIL";
	}

	public String cantidad(int j) {
		if(j==1){
			Iguana mostrar = new Iguana();
			return mostrar.getCa();
		}
		else{
			Tortuga mostrar2 = new Tortuga();
			return mostrar2.getCa();
		}
	}
	
	public String nombre(int i) {
		if(i==1){
			Iguana mostrar = new Iguana ();
			return mostrar.getNo();
		}
		else{
			Tortuga mostrar2 = new Tortuga();
			return mostrar2.getNo();
		}
	}

}

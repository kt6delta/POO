package punut1;

public class Mamifero extends Animal {
	
	public String clase() {
		return "Clase: MAMIFERO";
	}

	public String cantidad(int j) {
		if(j==1){
			Leon mostrar = new Leon();
			return mostrar.getCa();
		}
		else{
			Chimpance mostrar2 = new Chimpance();
			return mostrar2.getCa();
		}
	}
	
	public String nombre(int i) {
		if(i==1){
			Leon mostrar = new Leon();
			return mostrar.getNo();
		}
		else{
			Chimpance mostrar2 = new Chimpance();
			return mostrar2.getNo();
		}
	}
}

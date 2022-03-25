package cl2;

//EJEMPLO1
//A simple class hierarchy. 

//A class for two-dimensional objects. 
class TwoDShape {
	double width;
	double height;

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}
// EJERCICIO CLASE 1 DE HERENCIA
// Herencia.java
// Primer ejemplo de herencia entre clases,
// todas definidas en el mismo fichero
// Introducci�n a Java, Nacho Cabanes
class Escritor {
	public static void escribe(String texto) {
		System.out.println(texto);
	}
}

class EscritorAmpliado extends Escritor {
	public static void escribeConAsteriscos(String texto) {
		escribe("**" + texto + "**");
	}
}

class EscritorMayusculas extends Escritor {
	public static void escribe(String texto)

	{
		Escritor.escribe(texto.toUpperCase());
	}
}

class Herencia {
	public static void main(String args[]) {
		Escritor e = new Escritor();
		EscritorAmpliado eAmp = new EscritorAmpliado();
		EscritorMayusculas eMays = new EscritorMayusculas();
		e.escribe("El primer escritor sabe escribir");
		eAmp.escribe("El segundo escritor tambi�n");
		eAmp.escribeConAsteriscos("y rodear con asteriscos");
		eMays.escribe("El tercero s�lo escribe en may�sculas");
	}
}

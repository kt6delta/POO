//Este es el paquete donde hemos desarrollado la---LOGICA DEL NEGOCIO---
package metodosGetSet;

/**
* Esta es la clase que modele el Objeto Figura. Aqui  aparecen los metodos que
* permiten calcular el area y perimetro de un rectangulo Aqui  NO ESTAR  EL
* MAIN...
* @author Fernando Martinez R
* @version 2.0
*/
public class Figura {
	// DECLARAMOS LAS VARIABLES
	private int largo;
	private int ancho;

	// DECLARAMOS EL METODO CONSTRUCTOR. POR DEFAULT
	public Figura() {

	}

	// DECLARAMOS EL METODO CONSTRUCTOR CON ARGUMENTOS
	public Figura(int largo, int ancho) {
		this.largo = largo;
		this.ancho = ancho;
		
	}

	// DEFINIMOS LOS METODOS GET Y SET DE LAS VARIABLES PRIVADAS

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	// ESTE MeTODO PERMITE CALCULAR EL AREA DE UN RETaNGULO.
	public int area(int largo, int ancho) {
		return largo*ancho;
	}

	// ESTE METODO PERMITE CALCULAR EL PERIMETRO DE UN RECTANGULO,CONOCIDOS SUS
	// LARGO Y ANCHO
	public int perimetro(int largo, int ancho) {
		return (2 * ancho + 2 * largo);
	}
}

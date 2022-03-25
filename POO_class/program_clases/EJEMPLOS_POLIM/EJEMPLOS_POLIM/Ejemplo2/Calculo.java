package Ejemplo2;

// Declaracion de la clase ...
public class Calculo {
// Metodo Principal
	
	public static void main(String[] args) {
	// Declaracion de Variables
		Operaciones Operar = new Operaciones();
		 int Suma = 0;
		 double Suma2=0;
	// Realizando Operaciones
	//OJO COMO PASO LOS ARGUMENTOS.	 
	Suma = Operar.Sumar(5,6);
	Suma2 = Operar.Sumar(3.5,4.5);
	} // fin del metodo principal
} // fin de la clase



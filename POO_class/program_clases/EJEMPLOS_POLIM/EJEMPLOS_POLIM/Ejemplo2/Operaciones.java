package Ejemplo2;


// Declaracion de la clase ...
public class Operaciones {
	int Resultado = 0;
	double Resultado2=0;
	// Metodos de la Clase
	
	//OJO AL NOMBRE DEL METODO Y LOS PARAMETROS
	public int Sumar (int A , int B) {
		Resultado = A + B;
		System.out.println("Estoy Sumando " + A +  "+" + B);
		System.out.println(" y El resultado fue "+ Resultado);
		return Resultado;
	} // fin del metodo
	
	//OJO AL NOMBRE DEL METODO Y LOS PARAMETROS
	public double Sumar (double A, double B) {
		Resultado2 = A + B;
		System.out.println("Estoy Sumando " + A +  "+" + B);
		System.out.println(" y El resultado fue "+ Resultado2);
		return Resultado;
	} // fin del metodo
	
} // fin de la clase



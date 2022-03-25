package Ejemplo3;

class Empleado extends Trabajador
{
	private double sueldo;
	private double impuestos;
	private final int PAGAS = 14;
	// Constructor
	public Empleado (String nombre, String NSS, double sueldo)
	{
		super(nombre,NSS);
		this.sueldo = sueldo;
		this.impuestos = 0.3 * sueldo;
	}
// N�mina
	public double calcularPaga ()
	{
		return (sueldo-impuestos)/PAGAS;
	}
// toString AQUI HAY REDEFINICION DEL METODO DE TRABAJADOR
	public String toString ()
	{
		return "Empleado "+super.toString();
	}
}



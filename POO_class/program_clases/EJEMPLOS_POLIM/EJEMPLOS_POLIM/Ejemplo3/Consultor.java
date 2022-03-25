package Ejemplo3;

class Consultor extends Trabajador
{
	private int horas;
	private double tarifa;
	// Constructor
	public Consultor (String nombre, String NSS,int horas, double tarifa)
	{
		super(nombre,NSS);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	// Paga por horas
	public double calcularPaga ()
	{
		return horas*tarifa;
	}
	// toString. AQUI HAY REDEFINICION DEL METODO DE TRABAJADOR.
	public String toString ()
	{
		return "Consultor "+super.toString();
	}
}


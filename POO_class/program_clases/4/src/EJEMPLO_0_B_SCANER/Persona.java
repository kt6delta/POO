package EJEMPLO_0_B_SCANER;

//CLASE INICIAL

public class Persona {
//DECLARAMOS VARIABLES DE INSTANCIA
	private String identificacion;
	private String nombre;
	private String apellido;
	private double salario;
	
	//METODOS SET Y GET DE CADA VARIABLE
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellidos(String apellido) {
		this.apellido = apellido;
	}
	
		public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	//METODO CONSTRUCTOR
	public Persona(String identificacion,String nombres,String apellidos,double salario) {
		this.identificacion=identificacion;
		this.nombre=nombres;
		this.apellido=apellidos;
		this.salario=salario;
		
	}
	
	//CALCULA EL VALOR A PAGAR SI EL SALARIO ES MENOR A $500000
	public double chequeMensualMayor(double valor){
		return valor*1.25;
	}
	
	//CALCULA EL VALOR A PAGAR SI EL SALARIO ES MAYOR A $500000
	public double chequeMensualMenor(double valor){
		return valor*1.10;
	}
}


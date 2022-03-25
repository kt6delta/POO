package Ejemplo3;

class Nomina { 
	public static void main(String args[]){
		
		Trabajador trabajador = new Trabajador ("Juan", "456");
		Consultor consultor = new Consultor ("Juan", "456", 10, 50.0);
		
		Empleado empleado;
		empleado = new Empleado ("Jose", "123", 24000.0);
		
		System.out.println(trabajador);
		
		System.out.println("calcular paga Empleado"+empleado.calcularPaga());
		System.out.println("calcular paga Consultor"+consultor.calcularPaga());
		
		trabajador.setNombre("Fercho");// Le damos a Trabajador un nuevo nombre 
		trabajador.getNombre(); //Recuperamos el nombre del trabajador 
		System.out.println(trabajador.getNombre()); //Lo mostramos por la consola. 
		
		System.out.println(trabajador.equals(empleado));

		
	  	}
}

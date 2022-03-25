package EJEMPLO_0_B_SCANER;

//CLASE ASOCIADA


import java.util.Scanner;

public class PagoMensual {
	
	public static void main(String[] args) {
		//DECLARAMOS E INICIALIZAMOS LAS VARIABLES
		String identificacion="";
		String nombre="";
		String apellido="";
		double salario=0;
		double chequeOpcionUno=0;
		double chequeOpcionDos=0;
		
		//CREA EL OBJETO SCANNER PARA INGRESAR DATOS
		Scanner valor = new Scanner (System.in);
		  
        //CAPTURA DE DATOS DEL TRABAJADOR
		System.out.println("\t***DATOS PARA CALCULAR EL PAGO MENSUAL***\n");
		System.out.print("Escriba la identificación del trabajador: "); //ID
		identificacion= valor.next(); //Lee el ID
		System.out.print("Escriba el nombre del trabajador: "); //NOMBRE
		nombre= valor.next(); //Lee NOMBRES
		System.out.print("Escriba el apellido del trabajador: "); //APELLIDO
		apellido= valor.next(); //Lee APELLIDOS
		System.out.print("Escriba el Salario del trabajador: "); //SALARIO
		salario= valor.nextDouble(); //Lee el SALARIO

		//SE CREA EL OBJETO TRABAJADOR DE TIPO PERSONA	
		Persona trabajador = new Persona(identificacion,nombre,apellido,salario);
		
		//SE DECIDE SOBRE EL CALCULO DE SALARIO
		if(trabajador.getSalario()<500000){
			chequeOpcionUno=trabajador.chequeMensualMayor(salario);
			System.out.println("\n\t***CALCULO DEL PAGO MENSUAL***\n");
			System.out.println("Identificación: "+trabajador.getIdentificacion());
			System.out.println("Nombre: "+trabajador.getNombre());
			System.out.println("Apellido: "+trabajador.getApellido());
			System.out.println("Valor del Cheque para este mes: "+chequeOpcionUno);
			
		}
		else
		{
			chequeOpcionDos=trabajador.chequeMensualMenor(salario);
			System.out.println("\n\t***CALCULO DEL PAGO MENSUAL***\n");
			System.out.println("Identificación: "+trabajador.getIdentificacion());
			System.out.println("Nombre: "+trabajador.getNombre());
			System.out.println("Apellido: "+trabajador.getApellido());
			System.out.println("Valor del Cheque para este mes: "+chequeOpcionDos);
		}

		
	}

}

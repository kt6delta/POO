package punt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Empleado {
	public static void main(String Arg[]) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		salario salario= new salario();
		
		String nombre;
		System.out.println("dar el nombre: ");
		nombre=in.readLine();
		salario.setNombre(nombre);
		
		String apellido;
		System.out.println("dar el apellido: ");
		apellido=in.readLine();
		salario.setapellido(apellido);
		
		String identi;
		System.out.println("dar tarjeta de ID: ");
		identi=in.readLine();
		salario.setidenti(identi);
		
		int salario1;
		System.out.println("dar el salario: ");
		salario1=Integer.parseInt(in.readLine());
		
		System.out.println(" el salario total es: "+ (salario.subsidio(salario1)+salario1) );
		
		
	}
}

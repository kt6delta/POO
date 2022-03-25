package EJEMPLO_0_BASE_ARREGLOS_A;
import java.util.Scanner;

class EjemploVec
{
	
	public static void main (String arg[ ])
	{
		
		int tam;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca el tamaño del arreglo ");
		tam= entrada.nextInt();	
			
		Vector prueba =new Vector();
		
		prueba.llenarVector(tam);
		prueba.mostrarVector(tam);
		prueba.mostrarTam(tam);
				
	}

}// fin de clase

package EJEMPLO_0_A_SCANER;

//EJEMPLO No 1. Operaciones


import java.util.Scanner;

public class operacion
{
  public static void main(String arg[]) 
  {                                   
 
 //Crea el objeto Scanner para obtener la entrada de la ventana de comandos
	  Scanner entrada = new Scanner (System.in);
	  int x; // Primer n�mero
	  int y; // Segundo n�mero
	  int z; //Tercer n�mero
	  int resultado;//Producto de ellos

	  System.out.print("Escriba el primer entero: "); //Primer n�mero
	  x= entrada.nextInt(); //Lee el primer n�mero

	  System.out.print("Escriba el segundo entero: "); //Segundo n�mero
	  y= entrada.nextInt(); //Lee el segundo n�mero

	  System.out.print("Escriba el tercer entero: "); //tercer n�mero
	  z= entrada.nextInt(); //Lee el tercer n�mero

	  resultado = (x+y)*z;  //calcula la operaci�n de los n�meros

	  System.out.printf("El resultado de la opeaci�n x+y*z es %d\n", resultado);

  }//fin del m�todo main

} // fin de la clase operacion











package EJEMPLO_0_A_SCANER;

//EJEMPLO No 1. Operaciones


import java.util.Scanner;

public class operacion
{
  public static void main(String arg[]) 
  {                                   
 
 //Crea el objeto Scanner para obtener la entrada de la ventana de comandos
	  Scanner entrada = new Scanner (System.in);
	  int x; // Primer número
	  int y; // Segundo número
	  int z; //Tercer número
	  int resultado;//Producto de ellos

	  System.out.print("Escriba el primer entero: "); //Primer número
	  x= entrada.nextInt(); //Lee el primer número

	  System.out.print("Escriba el segundo entero: "); //Segundo número
	  y= entrada.nextInt(); //Lee el segundo número

	  System.out.print("Escriba el tercer entero: "); //tercer número
	  z= entrada.nextInt(); //Lee el tercer número

	  resultado = (x+y)*z;  //calcula la operación de los números

	  System.out.printf("El resultado de la opeación x+y*z es %d\n", resultado);

  }//fin del método main

} // fin de la clase operacion











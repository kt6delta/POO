package EJEMPLO_1;

//EJEMPLO1

public  class  Cuenta
{
	public  static  void  main(String[]   args)
	{
		//Declaración  de  arreglo   de   tipo  int   con  nombre  numeros
		int[]  numeros;
		//Creación  de  arreglo
			numeros  =  new  int[5];
			//Incialización   de   elementos  del  arreglo
			numeros[0]  =  10;
			numeros[1]  =  20;
			numeros[2]  =  30;
			numeros[3]  =  40;
			numeros[4]  =  50;

			System.out.println("Contando  de  10  en  10:");
			//Acceso  a  elementos  del   arreglo
			System.out.println(numeros[0]);
			System.out.println(numeros[1]);
			System.out.println(numeros[2]);
			System.out.println(numeros[3]);
			System.out.println(numeros[4]);
	}
}

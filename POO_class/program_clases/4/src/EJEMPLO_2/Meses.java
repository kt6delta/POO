package EJEMPLO_2;

//EJEMPLO 2
public   class   Meses
{
	public  static   void  main(String[]  args)
	{
		//Declaraci�n,  creaci�n  e   inicializaci�n   de   un   arreglo
		//de   tipo  String   con  identificador   nombre
		String[]  meses  =
		{
				"Ene",
				"Feb",
				"Mar",
				"Abr",
				"May",
				"Jun",
				"Jul",
				"Agt",
				"Sep",
				"Oct",
				"Nov",
				"Dic"   
		};
		//Uso  de  la  variable  impl�cita  length   para  un  arreglo
		//length  retorna   el   n�mero  de  elementos  del   arreglo
		System.out.println("Un   a�o  tiene:  "  +   meses.length  +   "meses");

		System.out.println("Los  meses  del  a�o   son:  ");
		//Acceso  a   los  elementos  del   arreglo  usando   un   ciclo   for
		//  y   una  variable  que  representa  el  �ndice  del   arreglo
		for  (int  i   =  0;  i  <   meses.length;  i++)
		{
 
			System.out.print(meses[i]  +  ",  ");
		}
	}
}


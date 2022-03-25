package EJEMPLO_2;

//EJEMPLO 2
public   class   Meses
{
	public  static   void  main(String[]  args)
	{
		//Declaración,  creación  e   inicialización   de   un   arreglo
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
		//Uso  de  la  variable  implícita  length   para  un  arreglo
		//length  retorna   el   número  de  elementos  del   arreglo
		System.out.println("Un   año  tiene:  "  +   meses.length  +   "meses");

		System.out.println("Los  meses  del  año   son:  ");
		//Acceso  a   los  elementos  del   arreglo  usando   un   ciclo   for
		//  y   una  variable  que  representa  el  índice  del   arreglo
		for  (int  i   =  0;  i  <   meses.length;  i++)
		{
 
			System.out.print(meses[i]  +  ",  ");
		}
	}
}


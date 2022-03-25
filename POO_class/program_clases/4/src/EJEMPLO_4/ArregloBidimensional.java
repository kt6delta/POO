package EJEMPLO_4;

//EJEMPLO 4
public   class   ArregloBidimensional
{
	public   static  void   main(String[]  args)
	{
		//Declaración  y   creación   del  arreglo
		int[][]  Tabla  =   new  int[4][3];
		//Incialización   de   los  valores   de   los
		//elementos  de  Tabla
		for   (int  i  =   0;  i  <  Tabla.length;   i++)  //Recorre   filas
		{
			//Recorre  columnas
			for  (int  j   =  0;  j  <   Tabla[i].length;  j++)
			{
				Tabla[i][j]  =   i  -  j;
			}
		}
		//Imprime   los  valores   de   la   Tabla
		for   (int  i  =   0;  i  <  Tabla.length;   i++)
		{
			for  (int  j   =  0;  j  <   Tabla[i].length;  j++)
			{
				System.out.print(Tabla[i][j]   +  "  ");
			}
			System.out.println();
		}
	}
}

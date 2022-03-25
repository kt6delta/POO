package EJEMPLO_5;

//EJEMPLO 5

public   class  CopiaArreglos
{
	public  static   void  main(String[]  args)
	{
		char[]  arregloFuente  =
		{  'S',  'i',   'H',  'O',  'L',   'A',  'p',  'e',   'p',  'e'   };
		char[]  arregloDestino  =  new  char[4];
		System.arraycopy(arregloFuente,   2,   arregloDestino,  0,  4);
		System.out.println(new   String(arregloDestino));
	}
}

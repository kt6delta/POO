package EJEMPLO_3;

//EJEMPLO3

public  class  ArregloMultidimensional
	{
	public  static   void  main(String[]  args)
	{
		String[][]   nombres  =  {   {  "Sr.   ",  "Sra.  ",  "Srta.  "  },
				{"Smith",  "Jones"   }};
		System.out.println(nombres[0][0]  +   nombres[1][0]);
		System.out.println(nombres[0][2]  +   nombres[1][1]);
	}
}


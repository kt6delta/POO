/**
 * DESCRIPCION:XXXXXXXXX
 * AUTOR: JJJJJJJJJ
 * FECHA:DDDDD
 * VERSION: 0.1 
 */

package CLASE1;
//EJEMPLO 2
class oper1
{
	public static void main(String arg[])
	{
		int a = 2;
		int b = 4;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		//ESTA VARIBLE SE INCREMENTA EN UNO
		a++;
		System.out.print("a++ --> ");
		System.out.println("a : " + a);
   	
		b = a++;
		System.out.print("b = a++ --> ");
		System.out.println("b : " + b + " , a : " + a);
   	
		a = ++b;
		System.out.print("a = ++b --> ");
		System.out.println("a : " + a + " , b : " + b);
	} 	
}



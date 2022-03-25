package CLASE1;
//EJEMPLO 3
public class ejemplo3
{
	public static void main(String arg[])
	{
		int a,b,c;
		a = 2;
		b = 3;
		c = 5;
		a++;
		b += a;
		c *= b;
		b -= 3;
		a %= 2;
		c /= 5;
		
		System.out.println("Los valores finales son : ");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);	
	}	
}
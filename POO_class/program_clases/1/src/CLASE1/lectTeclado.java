package CLASE1;
//EJEMPLO 4
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lectTeclado 
{
	public static void main(String Arg[ ]) throws IOException
	{
   
		BufferedReader in = new BufferedReader(new 
    			InputStreamReader(System.in));

		int num;

		System.out.print("Ingrese numero : ");
		num = Integer.parseInt(in.readLine( ));
		System.out.println("El numero ingresado y multiplicado por PI es : " + num*Math.PI );
	}
} 

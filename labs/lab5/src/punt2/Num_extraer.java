/*laura catalina preciado ballen
 * factorial, raíz cuadrada y logaritmo natural de un numero
 *abril 28 del 2019
 * version 1.0
 */
package punt2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_extraer {

	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ingrese el numero a operar: ");
		int num;
		num=Integer.parseInt(in.readLine());	
		
		Factorial factorial =new Factorial();
		factorial.setNum(num);
		factorial.getNum();
		
		Raiz raiz= new Raiz();
		raiz.setRaiz(num);
		raiz.getRaiz();
		
		Logaritmo logarit=new Logaritmo();
		logarit.setLogarit(num);
		logarit.getLogarit();
	}
}

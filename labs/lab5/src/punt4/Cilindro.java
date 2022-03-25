/*laura catalina preciado ballen
 * volumen y superficie de un cilindro
 *abril 28 del 2019
 * version 1.0
 */
package punt4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cilindro {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ingrese la altura del cilindro: ");
		int hal;
		hal=Integer.parseInt(in.readLine());

		System.out.println("ingrese el radio del cilindro: ");
		int rad;
		rad=Integer.parseInt(in.readLine());
		
		Volumen hallar= new Volumen();
		System.out.println("el volumen es: " +hallar.getVolu(hal, rad));
		
		Asuperficial hallar2 =new Asuperficial();
		System.out.println("el area superficial es: " +hallar2.getAsuper(hal, rad));
	}
}

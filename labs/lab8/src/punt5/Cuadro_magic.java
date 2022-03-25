/*laura catalina preciado
 * hace cubos magicos de 3x3 y 4x4
 * mayo 21 del 2019
 * version 1.1
 */
package punt5;

import java.util.Random;

public class Cuadro_magic {
	public static void main(String[] args){
		Random aleatorio = new Random(System.currentTimeMillis());

		int a = aleatorio.nextInt(10);
		int b = aleatorio.nextInt(10)+2;
		
		Magic hacer= new Magic(a, b);
		
		hacer.cuadro();
		System.out.println("\n");
		hacer.cuadro2();

	}
}

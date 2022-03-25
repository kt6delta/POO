/*laura catalina preciado ballen
 * dezplegar la tabla de ultiplicar
 *abril 28 del 2019
 * version 1.0
 */
package punt3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tabla_multi {
	public static void main(String Arg[]) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("ingrese cual tabla de multiplicar quiere ver: ");
		num=Integer.parseInt(in.readLine());
		
		Multiplica mostrar= new Multiplica();
		mostrar.setNum(num);
		mostrar.getTabla();
		
	}
}

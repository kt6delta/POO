/*laura catalina preciado
 * mostrar una tabla de multiplicar hasta n
 * mayo 12 del 2019
 * version 1.0
 */
package punt2;
import java.util.*;
public class Tablas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese hasta donde quiere la tabla de multiplicar: ");
		int n=sc.nextInt();
	T_2 tab = new T_2();
	tab.numeros(n);
	}
}

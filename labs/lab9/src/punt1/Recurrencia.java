/*laura catalina preciado ballen				
 * detecta la cantidad de veces que se repite un numero
 * version 1.0
 * mayo 23 del 2019
 */
package punt1;

import java.util.Scanner;

public class Recurrencia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int datos[];
		datos = new int[6];

		System.out.println(" ingresar 5 numeros: ");
		for (int n = 0; n < 5; n++) {
			datos[n] = sc.nextInt();
		}
		Repeticion contar = new Repeticion(datos[0], datos[1], datos[2], datos[3], datos[4]);
		int i = 5;
		for (int n = 0; n < 5; n++) {
			if (datos[n] != datos[i]) { //para evitar que se repita muchas veces el mismo numero
				contar.decir(datos[n]);
			}
			i--;
		}
	}
}

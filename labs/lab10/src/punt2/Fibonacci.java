/*fibonacci por recurrecia y por for
 * version 1.1
 * catalina preciado
 * 25/05/2019
 */
package punt2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short ban;
		do {
			System.out.print("¿hasta que parte de la serie quiere?");

			double m = sc.nextDouble();

			int n = 0;
			n = (int) m;
			while (m < 0 || n / m != 1) { // falso si entero
				System.out.println("ingrese otro dato");
				n = sc.nextInt();
				m = (int) n;
			}

			Recurrencia2 hacer = new Recurrencia2(); //se hace primero por recurrencia
			System.out.println("por recurrencia: " + hacer.fibonacci(n));
			//por recursividad
			int serie[];
			serie = new int[n + 1];
			serie[0] = 0;
			serie[1] = 1;

			for (int i = 0; i < n - 1; i++) {
				serie[i + 2] = serie[i + 1] + serie[i];
			}
			System.out.println("por recursividad: " + serie[n]);

			System.out.println("si quiere salir 1 o cualquier numero:");
			ban = sc.nextShort();
		} while (ban != 1);
	}

}

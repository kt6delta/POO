/*factorial por recurrencia y por for
 * version 1.1
 * catalina preciado
 * 25/05/2019
 */
package punt1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short ban = 0;
		do {
			System.out.println("ingrese numero al cual se le sacara factorial");
			double m = sc.nextDouble();

			int n = 0;
			n = (int) m;
			while (m < 0 || n / m != 1) { // falso si entero
				System.out.println("ingrese otro numero");
				n = sc.nextInt();
				m = (int) n;
			}
			Recurrencia hacer = new Recurrencia(); //se ejecuta primero por recurrencia
			System.out.println("por recurrencia: " + hacer.factorial(n));
			
			int fact = 1;
			for (int i = 2; i < n + 1; i++) {
				fact = fact * i;
			}
			System.out.println("por recursividad: " + fact);
			System.out.println("si quiere salir 1 o cualquier numero:");
			ban = sc.nextShort();
		} while (ban != 1);
	}
}

/*determinante 3x3 por recurencia y por for
 * version 1.1
 * catalina preciado
 * 25/05/2019
 */
package punt3;

import java.util.Scanner;

public class Determinante {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//solo es el caso usando for
		short band;
		do {
			System.out.println("ingrese matriz 3x3");

			int datos[][];
			datos = new int[3][3];

			for (int f = 0; f < 3; f++) {//llenar datos
				System.out.println("fila " + (f + 1));
				for (int c = 0; c < 3; c++) {
					datos[f][c] = sc.nextInt();
				}
			}
			Cofactor hacer = new Cofactor(); //hacer las matrices de cofatores
			hacer.determinante(datos);
			System.out.println("para repetir -1 o cualquiera para continuar");
			band = sc.nextShort();
		} while (band != -1);
	}
}
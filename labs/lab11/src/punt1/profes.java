/*mostrar sueldo y profesor con las carateristicas dadas
 * version 1.0
 * catalina preciado
 * 25/05/2019
 */
package punt1;

import java.util.Scanner;

public class profes {
	public static void main(String[] args) {//solo recolecta y organiza los datos

		Scanner sc = new Scanner(System.in);

		System.out.println("cantidad de profesores a ingresar");
		int n = sc.nextInt();

		String profesor[][];
		profesor = new String[n][4];
		// crea 3 vectores adicinales para organizar datos
		short contrat[];
		contrat = new short[n];
		double horas[];
		horas = new double[n];
		short estudios[];
		estudios = new short[n];

		System.out.println("nombre,    apellido,   estudios(doctorado, maestria, especializacion, pregrado),  contrato(planta, vinculacion especial, catedratico)");
		for (int f = 0; f < n; f++) { 
			System.out.println("profesor: " + (f + 1));
			for (int c = 0; c < 4; c++) {
				profesor[f][c] = sc.nextLine();
				if (c == 0 & f == 0) {
					profesor[f][c] = sc.nextLine();
				}
			}//primero llena los datos  luego corrige
			do {
				switch (profesor[f][2]) {
				case "doctorado":
					estudios[f] = 1;
					break;
				case "maestria":
					estudios[f] = 2;
					break;
				case "especializacion":
					estudios[f] = 3;
					break;
				case "pregrado":
					estudios[f] = 4;
					break;
				default:
					System.out
							.println("doctorado, maestria, especializacion, pregrado");
					profesor[f][2] = sc.nextLine();
					break;
				}
			} while (estudios[f] == 0);

			do {
				switch (profesor[f][3]) {
				case "planta":
					contrat[f] = 1;
					break;
				case "vinculacion especial":
					contrat[f] = 2;
					break;
				case "catedratico":
					System.out
							.println("ingrese cantidad de horas trabajadas : ");
					horas[f] = sc.nextDouble();
					contrat[f] = 3;
					break;
				default:
					System.out
							.println("planta, vinculacion especial, catedratico ");
					profesor[f][3] = sc.nextLine();
					break;
				}
			} while (contrat[f] == 0);

		}
		
		Father datos = new Father(contrat, estudios, horas, profesor); //le pasa los datos verificados y organizados
		datos.distribuir(n);
	}
}

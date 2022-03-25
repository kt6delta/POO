/*laura catalina preciado ballen				
 * detecta la cantidad de veces que se repite un numero
 * version 1.0
 * mayo 23 del 2019
 */
package punt2;

import java.util.Scanner;

public class estudiantes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Promedio estudiante= new Promedio();
		
		float notas[];
		notas= new float[3];
		
		String tabla[][];
		tabla = new String[3][2];

		float tabla2[][];
		tabla2 = new float[3][3];
		int c = 0;
		
		for (int f = 0; f < 3; f++) {
			System.out.println(" nombre:");
			if(f!=0){//corregir error a lo maldita sea
			tabla[f][c]= sc.nextLine();
			}
			tabla[f][c]= sc.nextLine();
			System.out.println(" apellido:");
			tabla[f][c + 1] = sc.nextLine();
			
			System.out.println(" Nota 1:");
			tabla2[f][c] = sc.nextFloat();
			System.out.println(" Nota 2:");
			tabla2[f][c + 1] = sc.nextFloat();
			System.out.println(" Nota 3:");
			tabla2[f][c + 2] = sc.nextFloat();
	
			notas[f]=estudiante.promedio( tabla[f][c], tabla[f][c + 1], tabla2[f][c], tabla2[f][c + 1], tabla2[f][c + 2]);
		}

		estudiante.salon(notas[0],notas[1], notas[2]);

	}
}
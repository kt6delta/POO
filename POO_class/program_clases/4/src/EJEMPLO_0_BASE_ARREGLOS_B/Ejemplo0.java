package EJEMPLO_0_BASE_ARREGLOS_B;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo0 {

	private int matriz[];

	public Ejemplo0() {
		matriz = new int[5];
	}

	public int[] retornarMatriz() {
		return (matriz);
	}

	public void llenar() {
		try {

			BufferedReader linea = new BufferedReader(new InputStreamReader(
					System.in));
			String lin = new String();

			for (int i = 0; i < 5; i++) {
				System.out.println("Digite el número que esta en la posición "
						+ i);
				lin = linea.readLine();
				matriz[i] = Integer.parseInt(lin);

			}

		} catch (Exception e) {

		}
	}

	public void mostrar() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(" " + matriz[i]);
				// mostrar_filas(i);
			}
		} catch (Exception e) {
		}
	}

}// fin de clase


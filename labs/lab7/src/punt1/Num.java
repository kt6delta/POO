package punt1;

import java.util.Scanner;

public class Num {

	private Scanner sc;
	public void crear(int num_dat, int caso) {
		sc = new Scanner(System.in);
		
		//matriz con datos
		int datos[];
		datos = new int[num_dat];
		System.out.print("ingresar los numeros a organizar: ");
		for (int i = 0; i < num_dat; i++) {
			datos[i] = sc.nextInt();
		}
		//en caso que en el switch sea 1
		if (caso == 1) {
			for (int i = 0; i < num_dat - 1; i++) {
				for (int j = i + 1; j < num_dat; j++) {
					if (datos[i] > datos[j]) {
						int num1 = datos[i];
						datos[i] = datos[j];
						datos[j] = num1;
					}
				}
			}
			System.out.println("queda");
			for (int l = 0; l < num_dat; l++) {
				System.out.println(datos[l]);
			}
		}
		//en caso que el switch sea 2
		if (caso == 2) {
			for (int i = 0; i < num_dat - 1; i++) {
				for (int j = i + 1; j < num_dat; j++) {
					if (datos[i] < datos[j]) {
						int num1 = datos[i];
						datos[i] = datos[j];
						datos[j] = num1;
					}
				}
			}
			System.out.println("queda");
			for (int l = 0; l < num_dat; l++) {
				System.out.println(datos[l]);
			}
		}

	}
}
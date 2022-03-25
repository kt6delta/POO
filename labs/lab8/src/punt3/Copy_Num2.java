package punt3;

import java.util.Scanner;

public class Copy_Num2 {

	private Scanner sc;

	public void crear(int num_dat, int caso) {
		sc = new Scanner(System.in);

		// matriz con datos
		int datos[];
		datos = new int[num_dat];
		System.out.print("ingresar los numeros a organizar: ");
		for (int i = 1; i < num_dat; i++) {
			datos[i] = sc.nextInt();
		}
		// en caso que sea ascendente
		int p = 0;
		if (caso == 3) {
			do {
			datos[0] = p;
				for (int i = 0; i < num_dat; i++) {
					for (int j = i + 1; j < num_dat; j++) {
						if (datos[i] > datos[j]) {
							int num1 = datos[i];
							datos[i] = datos[j];
							datos[j] = num1;
						}
					}
				}
				if (p == 0) {
					System.out.println("queda");
					for (int n = 1; n < num_dat; n++) {
						System.out.println(datos[n]);
					}
				} 
				else {
					System.out.println("queda");
					for (int n = 0; n < num_dat; n++) {
						System.out.println(datos[n]);
					}
				}
				System.out.println("ingrese el numero adicional a organizar o 0 para salir: ");
				p = sc.nextInt();
			} while (p != 0);
		}
	}
}
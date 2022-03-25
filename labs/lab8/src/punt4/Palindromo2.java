package punt4;

import java.util.Scanner;

import punt2.Verificar;

public class Palindromo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CopyVerificar objclass = new CopyVerificar();//llamar clase del paquete 2

		System.out
				.println("Ingresa la palabra sin comas, tildes ,puntos ,signos de interrogacion y todo en minusulas para verificar si es palidroma: ");
		String nuevo = sc.nextLine();

		if (objclass.espalindromo(nuevo)) {
			System.out.println("Si es Palindromo");
		} else {
			System.out.println("No Palindromo");
		}
	}
}
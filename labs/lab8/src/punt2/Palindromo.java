package punt2;

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Verificar objclass = new Verificar();

		System.out
				.println("Ingresa la palabra sin comas, signos de interrogacion y todo en minusulas para verificar si es palidroma: ");
		String nuevo = sc.nextLine();

		if (objclass.espalindromo(nuevo)) {
			System.out.println("Si es Palindromo");
		} else {
			System.out.println("No Palindromo");
		}
	}
}

package punt1;

import java.util.Scanner;

public class Organiza_7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Copy_Num decir = new Copy_Num();
		short menu;
		System.out.println("1). organizar de forma ascendente:  ");
		System.out.println("2). organizar de forma descendente:  ");
		do {
			menu = sc.nextShort();
			if(menu != 1 && menu != 2){
				System.out.println("ingresar valor valido: ");
			}
		} while (menu != 1 && menu != 2);
		switch (menu) {
		case 1:
			decir.crear(7, menu);
			break;
		case 2:
			decir.crear(7, menu);
			break;
		}
	}
}
/*laura catalina preciado
 *encriptar usando el metodo de Julio Cesar
 * mayo 5 del 2019
 * version 1.0
 */
package punt1;

import java.util.Scanner;

public class Incriptacion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Letras mostrar = new Letras();
		
		short menu;
		//para repetir
		do {
			System.out.print("numero de letras que va a incriptar: ");
			short num_le = sc.nextShort();
			// guardar en word las palabras
			char word[];
			word = new char[num_le];
			System.out.println("ingresar palabra por palabra lo que va incriptar: ");
			for (int i = 0; i < num_le; i++) {
				word[i] = sc.next().charAt(0);
			}
			// mostrar palabra 
			for (int i = 0; i < num_le; i++) {
				System.out.print(word[i]);
			}
			System.out.println();
			 //llamar clase
			for(int i = 0; i < num_le; i++){
				mostrar.cifrar(num_le, word[i]);
			}
			System.out.println();
			//menu
			System.out.println("-1 para detenerse y cualquier numero para continuar");
			menu = sc.nextShort();
		} while (menu != -1);
	}
}
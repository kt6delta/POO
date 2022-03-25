/*laura catalina preciado
 * area del triangulo dado sus tres lados
 * abril 28 del 2019
 * version 1.1
 */
package punt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area_trian{
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int menu;
		do {
		System.out.println("ingrese lados del triangulo: ");
		int lad1;
		int lad2;
		int lad3;
		lad1=Integer.parseInt(in.readLine());
		lad2=Integer.parseInt(in.readLine());
		lad3=Integer.parseInt(in.readLine());
		
		//verificacion de triangulo
		
		while(!(lad1+lad2>lad3 || lad1+lad3>lad2 || lad2+lad3>lad1 )) {
			System.out.println("ingrese lados de un TRIANGULO: ");
			lad1=Integer.parseInt(in.readLine());
			lad2=Integer.parseInt(in.readLine());
			lad3=Integer.parseInt(in.readLine());
		}
		while(lad1<=0) {
			System.out.println("ingrese lado positivo: ");
			lad1=Integer.parseInt(in.readLine());
		}
		while(lad2<=0) {
			System.out.println("ingrese lado positivo: ");
			lad2=Integer.parseInt(in.readLine());
		}
		while(lad3<=0) {
			System.out.println("ingrese lado positivo: ");
			lad3=Integer.parseInt(in.readLine());
		}
		
		// llamar clase 
		Area mostrar= new Area(); 
		System.out.println("el Area es: "+ mostrar.getAsup(lad1, lad2, lad3));
		
		System.out.println("si desea detenerse -1 o cualquier numero para repetir: ");
		menu= Integer.parseInt(in.readLine());
		}while(menu!=-1);
		
}

}

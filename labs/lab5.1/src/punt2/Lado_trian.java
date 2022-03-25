/*laura catalina preciado
 * lado del triangulo dado sus tres lados
 * abril 28 del 2019
 * version 1.0
 */
package punt2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lado_trian {
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int menu;
		do {
		System.out.println("ingrese 2 lados del triangulo y un angulo: ");
		int lad1;
		int lad2;
		double angu;
		
		lad1=Integer.parseInt(in.readLine());
		lad2=Integer.parseInt(in.readLine());
		angu=Double.parseDouble(in.readLine());
		//verificar datos
		while(lad1<=0) {
			System.out.println("ingrese lado positivo: ");
			lad1=Integer.parseInt(in.readLine());
		}
		while(lad2<=0) {
			System.out.println("ingrese lado positivo: ");
			lad2=Integer.parseInt(in.readLine());
		}

		while(angu<=0) {
			System.out.println("ingrese lado positivo: ");
			lad1=Integer.parseInt(in.readLine());
		}
		//comversion a rad
		angu=Math.toRadians(angu);
		
		Lado mostrar =new Lado();
		mostrar.getL(lad1, lad2, angu);
		
		System.out.println("ingrese -1 para detenerse o cualquier numero: ");
		menu=Integer.parseInt(in.readLine());
		}while(menu!=-1);
		
	}
}

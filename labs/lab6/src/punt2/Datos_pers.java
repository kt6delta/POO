/*laura catalina preciado
 *datos de n personas
 * mayo 5 del 2019
 * version 1.0
 */
package punt2;

import java.util.Scanner;

public class Datos_pers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Personas mostrar =new Personas();
		
		short menu=sc.nextShort();
		do{
		System.out.println("ingrese numero de personas: ");
		short num =sc.nextShort();
		
		String datos[][];	
		datos = new String[num][4];				
		//ingresar datos
		for(int f=0;num>f;f++){
			for(int c=0;c<4;c++){
				if(c==0){
					System.out.println("ingrese el nombre:");
				}
				if(c==1){
					System.out.println("ingrese el apellido:");
				}
				if(c==2){
					System.out.println("ingrese la identificacion:");
				}
				if(c==3){
					System.out.println("ingrese la edad:");
				}
				datos[f][c] =sc.next();	
				mostrar.datos(datos[f][c], num, f, c);
				
			}
		}
		//mostar		
		System.out.println("nombre:");
		for(int f=0;num>f;f++){
		mostrar.decir(datos[f][0]);
		}
		System.out.println("apellido:");
		for(int f=0;num>f;f++){
			mostrar.decir(datos[f][1]);
		}
		System.out.println("identificacion:");
		for(int f=0;num>f;f++){
			mostrar.decir(datos[f][2]);
		}
		System.out.println("edad:");
		for(int f=0;num>f;f++){
			mostrar.decir(datos[f][3]);
		}
		
		
	}while(menu!=-1);
}	
}
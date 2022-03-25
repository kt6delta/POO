package punt3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		short menu;
		do{
		System.out.println(" 1.) volumen y superficie de esfera radio 1");
		System.out.println(" 2.) el volumen y superficie de la esfera de un radio que ingrese");
		
		int radio;

		menu=Short.parseShort(in.readLine());
		switch(menu){
		case 1:
			Esfera hallar2= new Esfera();
			hallar2.imprimir();
			break;
		case 2: 
			System.out.println("ingrese el radio: ");
			radio=Integer.parseInt(in.readLine());
			Esfera hallar= new Esfera(radio);
			hallar.imprimir();
			break;
		}
		System.out.println("si desea detenerse (-1) sino cualquier numero: ");
		menu=Short.parseShort(in.readLine());
	}while(menu!=-1) ;
	}
}
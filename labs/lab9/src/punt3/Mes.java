package punt3;
//nombre y dias del mes
import java.util.Scanner;

import punt2.Promedio; //puedes llamar clases de otros paquetes o.O

public class Mes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short rep=0;
		do{
		System.out.println(" numero del mes:");
		short mes= sc.nextShort();
		
		Meses decir= new Meses (mes);
		decir.mes();
		if(mes!=2){
		decir.dias(0);
		}
		else{
			System.out.println(" ingrese el a�o para decir si es bisiesto o no");
			int a�o= sc.nextShort();
			decir.dias(a�o);
		}
		System.out.println("-1 para detenerse o cualquier numero para seguir");
		rep=sc.nextShort();
	}while(rep!=-1);
	}
}
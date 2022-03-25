/*laura catalina preciado
 * hacer inventario de tres productos
 * 05/06/2019
 * version 1
 */
import java.util.Scanner;

public class testHerencia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//todas las variables a usar
		System.out.println("¿cuantos productos ingresara?");
		int n=sc.nextInt();
		
		String[][] basic;
		basic= new String[n][2];
		
		String tipo[];
		tipo = new String[n];
		
		String envasado[];
		envasado= new String[n];
		String pais[];
		pais= new String [n];
		
		String ocontrol[];
		ocontrol= new String [n];
		
		int temp[];
		temp= new int [n];
		
		short organiza[];
		organiza= new short[n];
		//banderas que evitan que se ejute un for si no se ingresa de un tipo de producto
		boolean b1=false;
		boolean b2=false;
		boolean b3=false;
		//ingresar datos
		for(int f=0; f<n; f++){
			System.out.println("ingrese caducidad y lote");
			System.out.println("producto: "+ (f+1));
			for(int c=0; c<2; c++){
				basic[f][c]=sc.nextLine();
				if(c==0 & f==0){ //si lo quitas presenta el error que la primera vez solo lee un dato
					basic[f][c]=sc.nextLine();
				}
			}
			System.out.println("tipo de producto (fresco, refrigerado, congelado)");
			tipo[f]=sc.nextLine();
			boolean b;// para salir del while si se ingresa el dato correcto
				do{
					switch(tipo[f]){//se le asigna un numero a cada tipo
						case "fresco":
							System.out.println("ingrese envasado y pais");
							envasado[f]=sc.nextLine();
							pais[f]=sc.nextLine(); 
							organiza[f]=1; 
							b=false;
							b1=true; // si existe algun dato con este valor se mostrara un mensaje
							break;
						case "refrigerado":
							System.out.println("ingrese código del organismo de supervisión alimentaria");
							ocontrol[f]=sc.nextLine();
							organiza[f]=2;
							b=false;
							b2=true;// si existe algun dato con este valor se mostrara un mensaje
							break;
						case "congelado":
							System.out.println("ingrese temperatura recomendada");
							temp[f]=sc.nextInt();
							organiza[f]=3;
							b=false;
							b3=true;// si existe algun dato con este valor se mostrara un mensaje
							break;
						default:
							do{
								System.out.println("ingrese fresco, refrigerado o congelado");
								tipo[f]=sc.nextLine();
							}while(tipo[f]=="fresco" || tipo[f]=="refrigerado" || tipo[f]=="congelado");
							b=true;
							break;
					}
				}while(b);
			}		
		Empresa productos =new Empresa(basic);
		productos.distribuir(pais, envasado, ocontrol, temp, organiza, n, b1, b2, b3);
	}
}

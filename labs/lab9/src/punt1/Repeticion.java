package punt1;

public class Repeticion {

	private int[] datos;

	public Repeticion(int f, int g, int h, int i, int j) { //copy de la matriz datos
		int datos[];
		datos = new int[5];
		this.datos=datos;
		datos[0]=f;
		datos[1]=g;
		datos[2]=h;
		datos[3]=i;
		datos[4]=j;
	}

	public void decir(int a){ //a es el valor a comparar con la matriz
		int num=0;
		for(int n=0; n<5; n++){
			if(a==datos[n]){
				num++;
			}
		}
		System.out.println(a+ " se repite "+ num);
	}
	
}

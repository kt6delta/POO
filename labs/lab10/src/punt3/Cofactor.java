package punt3;

public class Cofactor {

	public void determinante(int datos[][]) {
		int a=0;
		int r2 = 2;
		
		for (int r = 0; r < 3; r++) {//numero de cofactores
			
			System.out.print("cofactor " + (r+1));
			int datos2[][];
			datos2 = new int[3][3];
			
			int i=0;
			for (int f = 1; f < 3; f++) { // f!=0 fila que se quita
				int j=0;
				for (int c = 2; c + 1 > 0; c--) { // c!=2 c!=1 c!=0 columna que se quita
					if (r2 != c) {
						datos2[i][j] = datos[f][c];
						j++;
					}
				}
				i++;
			}
			r2--;
			Det2x2 hacer= new Det2x2();
			if(r==1){//se le cambia el signo al determinante antes de multiplicarlo
				a=a+hacer.Mult(datos2,(datos[0][r]*-1));
			}
			else{
				a=a+hacer.Mult(datos2,datos[0][r]);
			}
		}
		System.out.println("el determinante es: "+a);
	}
}

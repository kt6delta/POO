package punt4;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Multiplica operar= new Multiplica();
		
		
		
		boolean a = false;
		do{
		System.out.println("ingrese filas x columnas el tamaño de la matriz A");
		int i=sc.nextInt();
		i++;
		int j=sc.nextInt();
		j++;

		
		System.out.println("ingrese filas x columnas el tamaño de la matriz B");
		int m=sc.nextInt();
		m++;
		int n=sc.nextInt();
		n++;
		
		if(j==m){
			int A[][];
			A = new int[i+1][j+1];
			
			System.out.println("filas de matriz A");
			for(int f=0; f<i-1 ; f++){
				System.out.println("fila "+ (f+1));
				for(int c=0; c<j-1 ; c++){
					A[f][c]=sc.nextInt();
				}
			}
			
			int B[][];
			B = new int[m+1][n+1];
			
			System.out.println("columna matriz B");
			for(int c=0; c<n-1; c++){
				System.out.println("columna "+ (c+1));
				for(int f=0; f<m-1 ; f++){
					B[f][c]=sc.nextInt();
				}
			}
			operar.mostrar(A, B, i, j, n, m);
		}
		else{
			System.out.println(" no se puede hacer la multiplicacion, reingrese datos");
			a=true;
		}
		}while(a);
	}
}

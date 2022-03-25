package EJEMPLO_6;

//CLASE ASOCIADA.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Matriz {

	private int matriz[][];

	public Matriz(){
		matriz=new int [3][3];
	}
	
	public int[][] retornarMatriz(){
		return(matriz);
	}
	
	public void llenar(){
		
		try {
			
			BufferedReader linea=new BufferedReader(new InputStreamReader(System.in));
			String lin=new String();
			
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					System.out.println("Digite el numero en el orden "+i+","+j);
				lin=linea.readLine();
				matriz[i][j]=Integer.parseInt(lin);
				}
			}
			
		} catch (Exception nfe) {
			System.out.println("Se han introducido caracteres no numéricos");
			System.exit(0);
			 
		}
	}
	
	public void sumar(int matrizB[][])
	{
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			{
				matriz[i][j]=matriz[i][j]+matrizB[i][j];
			}
		}
	}
	
	
	public void restar(int matrizB[][])
	{
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			{
				matriz[i][j]=matriz[i][j]-matrizB[i][j];
			}
		}
	}
	public int[][] multiplicacion(int matrizB[][]){
		int maResultado[][] =new int [3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				maResultado[i][j]=GenerarMultiplicacion(matriz,matrizB,i,j);
			}
		}
	return(maResultado);
	}
	
	public int GenerarMultiplicacion(int A[][],int B[][] ,int fila,int columna)
	{
		int resultado=0;
		for(int j=0; j<3; j++)
		{
			resultado=resultado+(A[fila][j]*B[j][columna]);
		}
		return(resultado);
	}
	public void copiar(int matrizB[][])
	{
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			{
				matriz[i][j]=matrizB[i][j];
			}
		}
	}
	
	
	public void mostrar()
	{	
			for(int i=0;i<3;i++){
				mostrar_filas(i);
			}
		}
	
	public void mostrar_filas(int num)
	{
		String saux=new String();
		saux=String.valueOf(matriz[num][0]);
			for(int j=1;j<3;j++)
			{		
			saux=(saux+"   "+String.valueOf(matriz[num][j]));		
			}
		System.out.println(saux);
	}
}
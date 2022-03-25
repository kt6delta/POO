package EJEMPLO_0_BASE_ARREGLOS_A;
import java.util.Scanner;

class Vector
{
    int miVector[];
	private Scanner lector;
	
	//
	void llenarVector(int x)
	{
		miVector = new int[x];
		for (int i=0; i <= x-1; i++)
		{
			lector = new Scanner(System.in);
			System.out.println("Intro. numero de posicion " + i + " ");
			miVector[i] = lector.nextInt();
		}
	}	
	
	void mostrarVector(int x)
	{
		System.out.print("El vector es: ");
		for (int i=0; i <= x-1; i++)
			System.out.print(miVector[i] + " ");
	}
	
	
	void mostrarTam (int x)
	{
		System.out.println("\nEl tamaño de mi vector es "+miVector.length);
	}
}
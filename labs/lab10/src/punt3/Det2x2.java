package punt3;

public class Det2x2 {
	
	public int Mult(int datos[][], int n){ //halla el determinante de una matriz 2x2
		int p=n*(datos[0][1]*datos[1][0]-datos[0][0]*datos[1][1]);
		System.out.println(", vale: " + p);
		return p;
	}

}

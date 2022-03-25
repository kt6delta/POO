package punt4;

public class Multiplica {
	private int A[][];
	private int B[][];

	public void mostrar(int[][] A, int[][] B, int i, int j, int n, int m) { // A ixj , B nxm
		int result[][];
		result = new int[i][m];// C ixm

		int mini[];
		mini = new int[j];

		int mini2[];
		mini2 = new int[j];

		for (int f = 0; f < i - 1; f++) {
			for (int c = 0; c < j - 1; c++) {
				mini[c] = A[f][c];
			}
			for (int c2 = 0; c2 < m - 1; c2++) {
				for (int f2 = 0; f2 < m - 1; f2++) {
					mini2[f2] = B[f2][c2];
				}
				Vectores per = new Vectores();
				result[f][c2]=per.a_b(mini, mini2, j);
			}
		}
		System.out.println();
		System.out.print("Matriz C");
		for(int f=0; f<i-1; f++){
			System.out.println("");
			for(int c=0; c<m-1; c++){
			System.out.print(" "+result[f][c]);
			}
		}
	}

}

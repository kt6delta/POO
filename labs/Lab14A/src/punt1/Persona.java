package punt1;

public class Persona {
	private String profe[][];
	private String estudia[][];
	
	Grafics1 prof = new Grafics1();
	public Persona() { //profe
		int n=prof.getNP();
		profe = new String [n][4];
		for(int i=0; i<n; i++){
			for(int j=0; j<4; j++){
				profe[i][j]=prof.getDatos(i,j);
			}
		}
	}

	public Persona(int NE) { //estudiante
		int m=NE;
		estudia = new String [m][5];
		for(int i=0; i<m; i++){
			for(int j=0; j<5; j++){
				profe[i][j]=prof.getDatos(i,j);
			}
		}		
	}
}
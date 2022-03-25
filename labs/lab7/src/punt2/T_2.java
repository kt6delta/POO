package punt2;

public class T_2 {

	
	public void numeros(int n){
		
		int tabla[][];
		tabla= new int [n+1][n+1];	
		for(int i=0; i<n+1; i++){
			tabla[i][0]=i;
		}
		System.out.println("");
		for(int j=1; j<n+1; j++){
			tabla[0][j]=j;
		}
		System.out.println("");
		
		for(int i=1; i<n+1; i++){
			int reini= n-1;
			for(int j=1; j<n+1; j++){
				tabla[i][j]=tabla[0][j]*tabla[i][0];
				if(reini==n-1 ){
				System.out.println("tabla del "+i+" hasta "+ n);	
				}
				System.out.println(tabla[i][j]);
				reini++;
			}
	}
}
}

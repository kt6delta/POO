package punt5;

public class Magic {
	private int a;
	private int b;

	Magic(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public void cuadro(){
		int cuadro[][];
		cuadro= new int [3][3];
		
		cuadro[0][0]=a+3;
		cuadro[0][1]=a+8;
		cuadro[0][2]=a+1;
		
		cuadro[1][0]=a+2;
		cuadro[1][1]=a+4;
		cuadro[1][2]=a+6;
		
		cuadro[2][0]=a+7;
		cuadro[2][1]=a; //3 fila 2 columna muestra el valor de a
		cuadro[2][2]=a+5;
		
		System.out.println("cuadro 3x3");
		for(int f=0; f<3; f++){
			System.out.println("");
			for(int c=0; c<3; c++){
				System.out.print("  "+cuadro[f][c]);
			}
		}
	}
	
	public void cuadro2(){
		int cuadro[][];
		cuadro= new int [4][4];
		
		cuadro[0][0]=b; //muestra el valor aleatorio generado
		cuadro[0][1]=b+14;
		cuadro[0][2]=b+13;
		cuadro[0][3]=b+3;
		
		cuadro[1][0]=b+11;
		cuadro[1][1]=b+5;
		cuadro[1][2]=b+6;
		cuadro[1][3]=b+8;
		
		cuadro[2][0]=b+7;
		cuadro[2][1]=b+9;
		cuadro[2][2]=b+10;
		cuadro[2][3]=b+4;
		
		cuadro[3][0]=b+12;
		cuadro[3][1]=b+2;
		cuadro[3][2]=b+1;
		cuadro[3][3]=b+15;
		
		System.out.println("cuadro 4x4");
		for(int f=0; f<4; f++){
			System.out.println("");
			for(int c=0; c<4; c++){
				System.out.print("  "+cuadro[f][c]);
			}
		}
	}
}

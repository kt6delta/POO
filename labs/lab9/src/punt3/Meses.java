package punt3;

public class Meses {

	private short mes;

	public Meses(short mes) {
		this.mes=mes;
	}
	public void mes(){
		switch(mes){
		case 1:
			System.out.print("Enero");
			break;
		case 2: 
			System.out.println("Febrero");
			break;
		case 3: 
			System.out.print("Marzo");
			break;
		case 4:
			System.out.print("Abril");
			break;
		case 5: 
			System.out.print("Mayo");
			break;
		case 6: 
			System.out.print("Junio");
			break;
		case 7:
			System.out.print("Julio");
			break;
		case 8: 
			System.out.print("Agosto");
			break;
		case 9: 
			System.out.print("Septiembre");
			break;
		case 10:
			System.out.print("Octubre");
			break;
		case 11: 
			System.out.print("Noviembre");
			break;
		case 12: 
			System.out.print("Diciembre");
			break;
		}
	}
	
	public void dias(int a�o){
		if(1==mes || 3==mes || 5==mes ||7==mes || 8==mes || 10==mes || 12==mes){
			System.out.print(" y tiene 31 d�as");
		}
		else{
			if(mes!=2){
			System.out.print(" y tiene 30 d�as");
			}
			else{
				if((a�o % 400==0 || a�o %  100!=0)& a�o % 4==0){
					System.out.println("tine 29 d�as");
				}
				else{
					System.out.println("tiene 28 d�as");
				}
			}
		}
	}
}

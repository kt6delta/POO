package punt3;

public class Multiplica {

	private int num2;
	
	public void setNum(int num){
		this.num2=num;
	}
	public void getTabla(){
		System.out.println("la tabla es: ");
		for(int i=1; 11>i; i++){
			System.out.println(num2 +"x"+ i+"=" +num2*i);
		}
	}
	
}

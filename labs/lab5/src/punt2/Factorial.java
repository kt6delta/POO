package punt2;

public class Factorial {
	
	private int num;
	private int a=1;
	
	public void setNum(int num){
		this.num= num; 
		} //asignar el valor
	
	void getNum(){
		for(int i=2; num>=i; i++){
		int b=a;
		a=i*b;
		}
	System.out.println("el factorial es:"+ a);
	}
}
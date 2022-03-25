package punt2;

public class Logaritmo {

	private double num2;
	private int num;
	
	public void setLogarit(int num){
		this.num= num; 
		} //asignar el valor
	
	public void getLogarit(){
		num2=Math.log1p(num);
		System.out.println("el logarimo natural es: "+num2);
	}
}

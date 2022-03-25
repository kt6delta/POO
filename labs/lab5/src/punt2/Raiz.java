package punt2;
 
public class Raiz {

	private int num;
	
	public void setRaiz(int num){
		this.num= num; 
		} //asignar el valor
	
	public void getRaiz(){
		double raiz=Math.pow(num, 0.5);
		System.out.println("la raiz es: "+ raiz);
	}// leer, operar, encadenar
}

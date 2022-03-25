package punt1;

public class Recurrencia {
	public int factorial(int n) {
		if (n < 0) {
			return 0;
		}
		if (n > 1) {
			return  n * factorial(n - 1);
		}
		if (n == 1) {
			return 1;
		}
		
		return 1; //ya que los demas estan dentro de if este es por default
	}

}

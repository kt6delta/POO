package punt2;

public class Recurrencia2 {
	public int fibonacci(int n) {
		if (n > 1)
			return fibonacci(n - 1) + fibonacci(n - 2);
		if (n == 1)
			return 1;
		return 0;//por default
	}
}

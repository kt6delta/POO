package EJEMPLO_6_CLASE3;

public class IsFact {
	public static void main(String args[]) {
		Factor x = new Factor();

		if (x.isFactor(2, 20))
			System.out.println("2 is factor");
		if (x.isFactor(3, 20))
			System.out.println("this won't be displayed");

	}
}

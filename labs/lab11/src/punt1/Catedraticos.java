package punt1;

public class Catedraticos extends Father {

	protected Catedraticos(short[] contrat, short[] estudios, double[] horas) {
		super(contrat, estudios, horas, profesor);
	}

	protected static void pago(int n) { // doc
		System.out.println("el pago es: " + (70000 * horas[n]));
	}

	public static void sueldo(int n) { // maes
		System.out.println("el pago es: " + (50000 * horas[n]));
	}

	protected static void pobres(int n) {// espe
		System.out.println("el pago es: " + (40000 * horas[n]));
	}

	protected static void miseria(int n) {// pregr
		System.out.println("el pago es: " + (30000 * horas[n]));
	}

}

package punt1;

public class Especial extends Father {

	protected Especial(short[] contrat, short[] estudios, String[][] profesor) {
		super(contrat, estudios, horas, profesor);
	}

	protected static void pago() {// doc
		System.out.println("el pago es: " + (7000000 * 0.85));
	}

	protected static void sueldo() {// maes
		System.out.println("el pago es: " + (5000000 * 0.85));
	}

	protected static void pobres() {// espe
		System.out.println("el pago es: " + (4000000 * 0.85));
	}

	protected static void miseria() {// preg
		System.out.println("el pago es: " + (3000000 * 0.85));
	}

}

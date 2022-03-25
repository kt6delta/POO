package punt1;

public class Plant extends Father {

	protected Plant(short[] contrat, short[] estudios) {
		super(contrat, estudios, horas, profesor);
	}

	protected static void pago() { // doc
		System.out.println("el pago es: 7 000 000");
	}

	protected static void sueldo() {// maes
		System.out.println("el pago es: 5 000 000");
	}

	protected static void pobres() {// espe
		System.out.println("el pago es: 4 000 000");
	}

	protected static void miseria() {// pre
		System.out.println("el pago es: 3 000 000");
	}

}

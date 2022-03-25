package cl2;

class RefDemo {
	public static void main(String args[]) {
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol;

		vol = weightbox.volume();
		System.out.println("El volumen de weightbox es " + vol);
		System.out.println("El peso de weightbox es " + weightbox.weight);
		System.out.println();

		// asigna una referencia de BoxWeight a una referencia de Box
		plainbox = weightbox;
		vol = plainbox.volume(); // OK, volume() definido en Box
		System.out.println("Volumen de plainbox es " + vol);

		/*
		 * La siguiente sentencia no es valida porque plainbox no define un
		 * miembro llamado weight.
		 */
		// System.out.println("El peso de plainbox es " +
		// plainbox.weight);
	}
}

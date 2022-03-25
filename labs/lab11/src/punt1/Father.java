package punt1;

public class Father { //distribuye el trabajo
	protected short contrat[];
	protected short estudios[];
	private int n;
	protected static String[][] profesor;
	protected static double[] horas;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	protected Father(short contrat[], short estudios[], double horas[], String[][] profesor) {
		this.contrat = contrat;
		this.estudios = estudios;
		this.horas = horas;
		this.profesor=profesor;
	}

	public void distribuir(int n) {//evalua el caso y ejecuta el metodo correspondente

		for (int i = 0; i < n; i++) {
			switch (estudios[i]) {
			case 1: // doc
				switch (contrat[i]) {
				case 1:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Plant.pago();
					break;
				case 2:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Especial.pago();
					break;
				case 3:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Catedraticos.pago(i);
					break;
				}
				break;
			case 2: // maes
				switch (contrat[i]) {
				case 1:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Plant.sueldo();
					break;
				case 2:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Especial.sueldo();
					break;
				case 3:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Catedraticos.sueldo(i);
					break;
				}
				break;
			case 3:// espe
				switch (contrat[i]) {
				case 1:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Plant.pobres();
					break;
				case 2:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Especial.pobres();
					break;
				case 3:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Catedraticos.pobres(i);
					break;
				}
				break;
			case 4:// pre
				switch (contrat[i]) {
				case 1:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Plant.miseria();
					break;
				case 2:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Especial.miseria();
					break;
				case 3:
					System.out.println(profesor[i][0]+ " " +profesor[i][1]+ " " +profesor[i][2]+ " " +profesor[i][3]);
					Catedraticos.miseria(i);
					break;
				}
				break;
			}
		}

	}
}

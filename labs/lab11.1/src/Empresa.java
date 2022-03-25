public class Empresa { //clase la cual hereda y contiene todos los datos principales
	private String basic[][];
	protected int n;

	public Empresa(String[][] basic) {
		this.basic = basic;
	}

	public void distribuir(String pais[], String envasado[], String ocontrol[],
			int temp[], short[] organiza, int n, boolean b, boolean c, boolean d) {
		if (b) {
			System.out.println("caduca    lote     pais      envasado");
			for (int f = 0; f < n; f++) {
				if (organiza[f] == 1) {
					ProductoFresco productoF = new ProductoFresco(basic, f);
					productoF.mostrar(pais[f], envasado[f]);
				}
			}
		}
		if (c) {
			System.out.println("caduca    lote    organismo de control");
			for (int f = 0; f < n; f++) {
				if (organiza[f] == 2) {
					ProductoRefrigerado productoR = new ProductoRefrigerado(
							basic, f);
					productoR.mostrar(ocontrol[f]);
				}
			}
		}
		if (d) {
			System.out.println("caduca    lote    temperatura recomendada");
			for (int f = 0; f < n; f++) {
				if (organiza[f] == 3) {
					ProductoCongelado productoC = new ProductoCongelado(basic,
							f);
					productoC.mostrar(temp[f]);
				}
			}
		}
	}

	public String[][] getBasic() {
		return basic;
	}

	public void setBasic(String[][] basic) {
		this.basic = basic;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}

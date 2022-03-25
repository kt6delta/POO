public class ProductoFresco extends Empresa { //solo muestra el mensaje
	protected String basic;
	private String basic1;

	ProductoFresco(String basic[][], int f) {
		super(basic);
		this.basic = basic[f][0];
		this.basic1 = basic[f][1];
	}

	public void mostrar(String pais, String envasado) {
		System.out.println(basic + "  " + basic1 + "  " + pais + "  "
				+ envasado);
	}

	public void setBasic(String basic) {
		this.basic = basic;
	}

	public String getBasic1() {
		return basic1;
	}

	public void setBasic1(String basic1) {
		this.basic1 = basic1;
	}
}

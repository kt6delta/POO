public class ProductoCongelado extends Empresa { //solo muestra el mensaje
	protected String basic;
	private String basic1;

	protected ProductoCongelado(String basic[][], int f) {
		super(basic);
		this.basic = basic[f][0];
		this.basic1 = basic[f][1];
	}

	public void mostrar(int temp) {
		System.out.println(basic + " " + basic1 + "  " + temp);

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

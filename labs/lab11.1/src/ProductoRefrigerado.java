public class ProductoRefrigerado extends Empresa { //solo muestra el mensaje
	protected String basic;
	private String basic1;

	protected ProductoRefrigerado(String basic[][], int f) {
		super(basic);
		this.basic = basic[f][0];
		this.basic1 = basic[f][1];
	}

	public void mostrar(String ocontrol) {
		System.out.println(basic + "  " + basic1 + "  " + ocontrol);
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

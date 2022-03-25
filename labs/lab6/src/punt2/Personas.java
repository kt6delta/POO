package punt2;

public class Personas {
	private String datos;

	public String getDatos() {
		return datos;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	
	public void datos (String datos, int num, int f, int c){
		String datos2[][];	
		datos2 = new String[num][4];
				datos2[f][c]=datos;
	}
		
	public void decir(String datos){
		System.out.println(datos);
	}
}

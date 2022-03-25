package punt2;

public class Promedio {

	public float promedio(String nombre ,String apellido,float nota1, float nota2, float nota3) {
		float nota_t= (float) (nota1*0.3+nota2*0.3+nota3*0.4);
		System.out.println("nombre    | apellido     |nota final");
		System.out.println(nombre+"  "+apellido+"  "+ nota_t );
		return nota_t;
	}
	
	public void salon(float nota_t, float nota_t2, float  nota_t3) {
		nota_t=(nota_t+nota_t2+ nota_t3)/3;
		System.out.println("promedio del salon\n"+ nota_t);
	}

}

package get_set;

public class Prueba_get_set {
	
	public static void main(String[] args){
		
		Alumno alum_1= new Alumno();
		
		alum_1.nota=20;
		System.out.println(alum_1.nota);
		
		alum_1.setNombre("catalina");// devido a que el set es publico
		
		System.out.println(alum_1.getNombre());
	}
}

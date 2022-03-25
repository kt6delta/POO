package cl3;

//AHORA LA CLASE QUE CONTINE EL METODO PRINCIPAL Y DONDE INSTANCIAMOS
import metodosGetSet.Figura;
//Este es el paquete donde hemos desarrollado---EL MAIN--

//SE IMPORTAN LAS LIBRERIAS



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Esta clase contine el metodo principal mail y estar  ASOCIADA a la Clase
* FIGURA
* 
* @author Fernando Martinez R
* @version 2.0
*/
public class Geometria {
	// METODO PRINCIPAL
	public static void main(String arg[]) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// DECLARAMOS DOS VARIABLES LOCALES
		int largo, ancho;
		int areaNueva = 0, perimetroNuevo = 0;

		System.out.print("EJEMPLO POR TECLADO : ");
		System.out.print("\nIngrese el largo : ");
		largo = Integer.parseInt(in.readLine());

		System.out.print("Ingrese el ancho : ");
		ancho = Integer.parseInt(in.readLine());

		// SE DECLARA UN OBJETO DE TIPO FIGURA LLAMADO fig
		Figura fig = new Figura(largo, ancho);
		Figura pajarito = new Figura();

		// LIMPIAMOS PANTALLA

		// IMPRIMIMOS ANCHO Y LARGO MANDADO POR CONSTRUCTOR
		System.out.println("El largo en el constructor es " + fig.getLargo());
		System.out.println("El ancho en el constructor es " + fig.getAncho());

		// CALCULAMOS AREA Y PERIMETRO POR CONSTRUCTOR
		perimetroNuevo = fig.perimetro(fig.getAncho(), fig.getLargo());
		areaNueva = fig.area(fig.getAncho(), fig.getLargo());

		// IMPRIMIMOS AREA Y PERIMETRO POR CONSTRUCTOR
		System.out.println("El pero metro del rectangulo POR CONSTRUCTOR es: "
				+ perimetroNuevo);
		System.out.println("El area del rectangulo POR CONSTRUCTOR es: "
				+ areaNueva);

		// LE ENVIO PARaMETROS A fig PARA CALCULAR EL PERIMETRO Y EL AREA
		perimetroNuevo = fig.perimetro(3, 7);
		areaNueva = fig.area(1, 4);

		// SALIDA POR PANTALLA DE FIG.
		System.out.println("\nAhora observemos y analicemos CON fig: ");
		System.out.println("El perimetro del rectangulo es: " + perimetroNuevo);
		System.out.println("El area del rectangulo es: " + areaNueva);

		// PARA PAJARITO
		perimetroNuevo = pajarito.perimetro(1, 2);
		areaNueva = pajarito.area(1, 2);

		// SALIDA POR PANTALLA DE PAJARITO.
		System.out
				.println("\nCON pajarito observe que hace lo mismo con los argumentos que estan en el codiogo "
						+ "y no ingresan por teclado: ");
		System.out.println("El perimetro del rectangulo es: " + perimetroNuevo);
		System.out.println("El area del rectangulo es: " + areaNueva);

		// USO DEL SET. OBSERVE COMO SE PUEDE MODIFICAR EL VALOR DE LA VARIABLE
		System.out.println("\nAhora un pequeo ejemplo del como asignar valores a un atributo ");
		System.out.println("\nEl ancho esta en: " + fig.getAncho());
		System.out.println("El ancho ahora le pasamos 7 con: fig.setAncho(7) ");
		fig.setAncho(7);
		System.out.println("El nuevo ancho ahora es: " + fig.getAncho());

	}
}
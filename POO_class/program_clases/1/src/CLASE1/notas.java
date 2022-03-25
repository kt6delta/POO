package CLASE1;
//EJEMPLO 5
import java.io.*;
class notas 
{
	public static void main(String Arg[ ]) throws IOException
	{
		BufferedReader in = new BufferedReader(new 
			InputStreamReader(System.in));

		double c1,c2,c3;
		double s1,s2;
		double nota_present;
		double prom_controles;

		System.out.print("\n\tIngrese nota control 1 : ");
		c1 = Double.parseDouble(in.readLine( ));

		System.out.print("\n\tIngrese nota control 2 : ");
		c2 = Double.parseDouble(in.readLine( ));
		
		System.out.print("\n\tIngrese nota control 3 : ");
		c3 = Double.parseDouble(in.readLine( ));

		prom_controles = (c1 + c2 + c3) / 3;

		/* Redondeo a un decimal */

		prom_controles = Math.round(prom_controles * 10) / 10.0;
		
		System.out.println("\n\tPromedio controles : " + prom_controles);

		System.out.print("\n\tIngrese nota solemne 1 : ");
		s1 = Double.parseDouble(in.readLine());
		
		System.out.print("\n\tIngrese nota solemne 2 : ");
		s2 = Double.parseDouble(in.readLine());

		nota_present = (s1 + s2 + prom_controles) / 3;
		
		nota_present = Math.round(nota_present * 10) / 10.0;
		
		System.out.println("\n\tNota de presentacion : " + nota_present);
		
		//SOLO SE PERMITE EL EXAMEN SI LA NOTA DE PRESENTACIÓN ES MAYOR O IGUAL A 3.5
		if(nota_present >= 3.5)
		{
			double nota_examen;
			//se aprueba el ramo con una FINAL MAYOR O IGUAL A 3.95
			nota_examen = (3.95 - 0.70 * nota_present) / 0.30;	
			
			nota_examen = Math.round(nota_examen * 10) / 10.0;
			
			System.out.println("\n\tNota minima de examen para aprobar el ramo...  : " 
			+ nota_examen);
		}
		else
			System.out.println("\n\tNo tiene derecho a dar examen");

		System.out.println( );
	}
} 




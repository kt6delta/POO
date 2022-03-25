package punt1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Estudiante extends Persona {
	private int NE;
	private int m;
	private static String students[][]; 
	
	public Estudiante(int NE){
		super(NE);// el grupo que va hasta m
		int m=this.NE;
	}
	public void guardar() {
		try {
			DataOutputStream archivo = null; // crear un objeto de tipo archivo
			// creando e inicializando los campos del registro
			archivo = new DataOutputStream(new FileOutputStream("c:\\Temp\\archivo2.txt", true));	
			for (int i = 0; i < m; i++) {
				for(int j=0; j<5; j++){
					archivo.writeUTF(students[i][j]);
				}
			}
			archivo.close();// Cierra el Archivo
		} catch (FileNotFoundException fnfe) { /* Archivo no encontrado */
		} catch (IOException ioe) { /* Error al escribir */
		}	
	}	
	
}
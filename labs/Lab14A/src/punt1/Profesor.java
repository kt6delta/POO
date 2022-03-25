package punt1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Profesor extends Persona {

	private static String profe[][]; 
	private int n;
	
	public Profesor(){
		super();// no se si le pasa bien los datos el super
	}
	public void guardar(){
		try {
			DataOutputStream archivo = null; // crear un objeto de tipo archivo
			// creando e inicializando los campos del registro
			archivo = new DataOutputStream(new FileOutputStream("c:\\Temp\\archivo2.txt", true));	
			for (int i = 0; i < n; i++) {
				for(int j=0; j<4; j++){
					archivo.writeUTF(profe[i][j]);
				}
			}
			archivo.close();// Cierra el Archivo
		} catch (FileNotFoundException fnfe) { /* Archivo no encontrado */
		} catch (IOException ioe) { /* Error al escribir */
		}	
	}	
}
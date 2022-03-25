package punt1;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class C_archivos {
	String nombres[]={"Maritza Zambrano", "Javier Martinez R.", "Mario Felipe Lozano", "Maria Fernanda Martinez", "Dario Fernando Lozano"};

	public void guardar(){
		Grafica make = new Grafica();
		make.getNotas(0,0,true);
		
		try {
			DataOutputStream archivo = null; // crear un objeto de tipo archivo
			// creando e inicializando los campos del registro
			archivo = new DataOutputStream(new FileOutputStream("c:\\Temp\\archivo1.txt", true));	
			
			for (int i = 0; i < 5; i++) {
				archivo.writeUTF(nombres[i]);
				for (int j = 0; j < 4; j++) {
					archivo.writeFloat(make.getNotas(i,j,false));
				}
			}
			archivo.close();// Cierra el Archivo
		} catch (FileNotFoundException fnfe) { /* Archivo no encontrado */
		} catch (IOException ioe) { /* Error al escribir */
		}	
	}
	
	public void borrar() {
		BufferedWriter archivo;
		try {
			archivo = new BufferedWriter(new FileWriter("c:\\Temp\\archivo1.txt"));
			archivo.write("");
			archivo.close();
		} catch (FileNotFoundException fnfe) { /* Archivo no encontrado */
		} catch (IOException ioe) { /* Error al escribir */
		}
	}

}

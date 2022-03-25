package CuatroEnLinea.Logica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Archivos4EnLinea {							//clase que creara y grabara los archivos del juego
	
	public Archivos4EnLinea() {							//contructor por defecto
		
	}
	
	public void grabarArchivo(int tiempoj1, String nj1) {
		DataOutputStream score=null;					//creacion de un objeto tipo archivo
		
		String nombreJugador1= nj1;						//creando e inicializando los campos de registro
		
		int tempo=tiempoj1;
		
		try {
			score=new DataOutputStream(new FileOutputStream("src/finalArchivo/score.txt", true));			//se creara un archivo en el que se puede volver a guardar datos
			
			score.writeUTF(nombreJugador1);				//se graban los datos en un archivo score, guardando ambos jugadores de la partida
			score.writeInt(tempo);						
			score.close();								//se cierra la grabacion en el archivo para que sea sastisfactorio el cargue
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void grabarArchivo(int num) {
		DataOutputStream numArc=null;					//creacion de un objeto tipo archivo
		try {
			numArc=new DataOutputStream(new FileOutputStream("src/finalArchivo/num.txt"));
			numArc.writeInt(num);						//se graba en un archivo num un valor entero que indicara cuantas veces se ejecuto el archivo
			numArc.close();								//cerramos la grabacion en el archivo
		} catch (Exception e) {
		}
	}
}

package punut1;

import java.awt.EventQueue;

public class Ajolote {

	public String getCa() {
		return "El Zoologico cuenta con 1 especie de Anfibio y 7 individuos de la misma especie";
	}

	public String getNo() {
		return "Nombre Ajolote";
	}
	public void Graficos(){
		Anfibio mostrar = new Anfibio();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafics2 frame = new Grafics2("/image/alojote.jpg",mostrar.clase(),mostrar.nombre(1),mostrar.cantidad(1));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

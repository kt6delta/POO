package punut1;

import java.awt.EventQueue;

public class Iguana extends Reptiles{

	public String getCa() {
		return "El Zoologico cuenta con 40 especies de Reptiles y 306 individuos";
	}

	public String getNo() {
		return "Nombre: Iguana verde";
	}
	public void Graficos(){
		Reptiles mostrar = new Reptiles();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafics2 frame = new Grafics2("/image/iguana.jpg",mostrar.clase(),mostrar.nombre(1),mostrar.cantidad(1));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

package punut1;

import java.awt.EventQueue;

public class Tortuga extends Reptiles {

	public String getCa() {
		return "El Zoologico cuenta con 40 especies de Reptiles y 306 individuos";
	}

	public String getNo() {
		return "Nombre: Tortugas de las Galápagos";
	}
	public void Graficos(){
		Reptiles mostrar = new Reptiles();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafics2 frame = new Grafics2("/image/tortuga.jpg",mostrar.clase(),mostrar.nombre(2),mostrar.cantidad(2));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

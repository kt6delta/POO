package punut1;

import java.awt.EventQueue;

public class Chimpance {

	public String getCa() {
		return "El Zoologico cuenta con 93 especies de Mamiferos y 632 individuos";
	}

	public String getNo() {
		return "Nombre: Chimpance";
	}
	
	public void Graficos(){
		Mamifero mostrar = new Mamifero();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafics2 frame = new Grafics2("/image/chimpance.jpg",mostrar.clase(),mostrar.nombre(2),mostrar.cantidad(2));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

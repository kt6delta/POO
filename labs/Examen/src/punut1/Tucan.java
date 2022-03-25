package punut1;

import java.awt.EventQueue;

public class Tucan extends Ave {

	public String getNo() {
		return "Nombre: Tucán toco.";
	}
	public String getCa() {
		return "El Zoologico cuenta con 116 especies de Aves y 985 individuos de la misma especie";
	}
	public void Graficos(){
		Ave mostrar = new Ave();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafics2 frame = new Grafics2("/image/tucan.jpg",mostrar.clase(),mostrar.nombre(1),mostrar.cantidad(1));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

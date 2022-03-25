package punut1;

import java.awt.EventQueue;

public class Aguila extends Ave{

	public String getNo() {
		return "Nombre: AGUILA CAUDAL";
	}
	public String getCa() {
		return "El Zoologico cuenta con 116 especies de Aves y 985 individuos";
	}
	public void Graficos(){
		Ave mostrar = new Ave();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafics2 frame = new Grafics2("/image/aguila.jpg",mostrar.clase(),mostrar.nombre(2),mostrar.cantidad(2));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}

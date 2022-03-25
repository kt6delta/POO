package punt1;

import java.awt.EventQueue;

public class Curso_de_POO {
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //profes
			public void run() {
				try {
					Grafics1 frame = new Grafics1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Grafics1 ll= new Grafics1();
		int n=ll.getNP();// numero de profes
		
		for(int i=0; i<n; i++){
			EventQueue.invokeLater(new Runnable() { //estudiante
				public void run() {
					try {
						Grafics2 frame = new Grafics2();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
	}
}

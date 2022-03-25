package pvpc;

import java.awt.EventQueue;

import p1vp2.Fondo;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Play2 frame = new Play2();
					frame.setVisible(true);
					frame.setSize(800,600);
					Fondo p= new Fondo("/imagen/Captura.PNG");
					frame.add(p);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

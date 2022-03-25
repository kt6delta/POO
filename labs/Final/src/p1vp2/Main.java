package p1vp2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pvpc.Play2;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Play frame = new Play();
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

	
	

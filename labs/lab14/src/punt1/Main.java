package punt1;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args){	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafica frame = new Grafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 		
}

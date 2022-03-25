package punt1;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class Ecua_d {
		public static void main(String[] args) {
//			try {
//				Mensajes dialog = new Mensajes();
//				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//				dialog.setVisible(true);
//				dialog.cero();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Grafic frame = new Grafic();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
			
		}
}

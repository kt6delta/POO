/*Laura catalina preciado
 * 3/7/2019
 * version 1
 * mostrar botones, luego a los animales y finalmente la informacion del animl
 */
package punut1;

import java.awt.EventQueue;

public class Zoologico {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafics1 frame = new Grafics1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

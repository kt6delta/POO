package grafica;

import javax.swing.JOptionPane;

public class example {
	public static void main(String[] args) {

		int prueba = JOptionPane.showOptionDialog(null, "seleccione una opcion ", "selector de opciones Prueba",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Opc. 1", "Opc. 2", "Opc. 3" }, "Opc. 1");
	}
}
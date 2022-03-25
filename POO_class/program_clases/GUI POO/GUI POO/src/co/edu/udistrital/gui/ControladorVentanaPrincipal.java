package co.edu.udistrital.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControladorVentanaPrincipal implements ActionListener {

	private VentanaPrincipal ventana;

	public ControladorVentanaPrincipal(VentanaPrincipal ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object accion = e.getSource();

		if (accion == ventana.getBtnMostrarInformacion()) {
			// Se obtiene la información ingresada por el Usuario
			String nombre = ventana.getTxtNombre().getText();

			if (!nombre.equalsIgnoreCase("")) {
				String carrera = ventana.getComboBoxCarrera().getSelectedItem().toString();
				String universidad = ventana.getComboBoxUniversidad().getSelectedItem().toString();

				// Se despliega en un dialogo la información capturada
				JOptionPane.showMessageDialog(null,
						"Tú eres: " + nombre + ", estudias: " + carrera + " en la " + universidad, "Ejemplo GUI",
						JOptionPane.PLAIN_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "No has ingresado el nombre", "Ejemplo GUI",
						JOptionPane.INFORMATION_MESSAGE);
			}

		}
	}

}

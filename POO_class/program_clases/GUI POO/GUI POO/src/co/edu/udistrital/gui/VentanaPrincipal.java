package co.edu.udistrital.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JComboBox comboBoxUniversidad;
	private JComboBox comboBoxCarrera;
	private JButton btnMostrarInformacion;

	private ControladorVentanaPrincipal control;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Ejemplo GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNombre = new JLabel("Nombre:");

		JLabel lblUniversidad = new JLabel("Universidad:");

		comboBoxUniversidad = new JComboBox();
		comboBoxUniversidad
				.setModel(new DefaultComboBoxModel(new String[] { "Universidad Distrital Francisco Jos\u00E9 de Caldas",
						"Universidad Nacional", "Universiad de Los Andes" }));

		JLabel lblProyectoCurricular = new JLabel("Proyecto Curricular");

		comboBoxCarrera = new JComboBox();
		comboBoxCarrera.setModel(
				new DefaultComboBoxModel(new String[] { "Ing Sistemas", "Ing Industrial", "Ing Electr\u00F3nica" }));

		btnMostrarInformacion = new JButton("Mostrar Informaci\u00F3n");
		btnMostrarInformacion.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/mss.png")));

		btnMostrarInformacion.addActionListener(getControlador());

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGroup(
						gl_contentPane
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(lblUniversidad).addComponent(lblNombre))
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addGroup(gl_contentPane
																.createParallelGroup(Alignment.LEADING, false)
																.addComponent(txtNombre).addComponent(
																		comboBoxUniversidad, 0, 349, Short.MAX_VALUE)))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(lblProyectoCurricular).addGap(10).addComponent(
																comboBoxCarrera, 0, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(184)
										.addComponent(btnMostrarInformacion)))
						.addContainerGap(63, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNombre).addComponent(
						txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblUniversidad)
						.addComponent(comboBoxUniversidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblProyectoCurricular)
						.addComponent(comboBoxCarrera, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(btnMostrarInformacion).addContainerGap(270, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
	}

	private ControladorVentanaPrincipal getControlador() {

		if (control == null) {
			control = new ControladorVentanaPrincipal(this);
		}
		return control;
	}

	public JComboBox getComboBoxUniversidad() {
		return comboBoxUniversidad;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JComboBox getComboBoxCarrera() {
		return comboBoxCarrera;
	}

	public JButton getBtnMostrarInformacion() {
		return btnMostrarInformacion;
	}

}

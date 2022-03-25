package punut1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Grafics2 extends JFrame { //es la segunda pantalla que se abre al hacer clic en el animal

	private JPanel contentPane;

	public Grafics2(String dir, String clase, String cantidad,String nombre) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image dibujo = new ImageIcon(this.getClass().getResource(dir)).getImage();
		
		JLabel lbImagen = new JLabel("");
		lbImagen.setBounds(108, 11, 250, 349);
		contentPane.add(lbImagen);
		lbImagen.setIcon(new ImageIcon(dibujo)); //pedir dato
		
		JLabel lbClase = new JLabel("clase:");
		lbClase.setBounds(34, 371, 292, 14);
		contentPane.add(lbClase);
		lbClase.setText(clase); //pedir dato
		
		JLabel lbNombre = new JLabel("Nombre Actual:");
		lbNombre.setBounds(34, 403, 412, 14);
		contentPane.add(lbNombre);
		lbNombre.setText(cantidad);//pedir dato
		
		JLabel lbCantidad = new JLabel("...");
		lbCantidad.setBounds(32, 428, 432, 32);
		contentPane.add(lbCantidad);
		lbCantidad.setText(nombre);//pedir dato
	}
}

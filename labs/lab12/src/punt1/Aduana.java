/*laura catalina preciado ballen
 * junio 6 de 2019
 * version 1
 * máquina que sortea las personas cuyo equipaje serán
 *	revisados.
 */
package punt1;

import java.util.Random;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Toolkit;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.Label;

public class Aduana extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aduana frame = new Aduana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Aduana() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Aduana.class.getResource("/icon/icono.png")));//la funcion grafica
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox proced = new JComboBox();
		proced.setModel(new DefaultComboBoxModel(new String[] {"Interior", "Exterior"}));
		proced.setBounds(36, 73, 144, 33);
		contentPane.add(proced);
		
		JLabel cabecera3 = new JLabel("CANTIDAD TOTAL");
		cabecera3.setBounds(256, 132, 112, 14);
		contentPane.add(cabecera3);
		
		JLabel cabecera2 = new JLabel("PROCEDENCIA");
		cabecera2.setBounds(52, 34, 89, 14);
		contentPane.add(cabecera2);
		
		JLabel cabecera1 = new JLabel("CANTIDAD DE BULTOS");
		cabecera1.setBounds(256, 34, 137, 14);
		contentPane.add(cabecera1);
		
		Label nbultos = new Label("");
		nbultos.setBounds(281, 166, 86, 22);
		contentPane.add(nbultos);
		
		JSpinner sbulto = new JSpinner();
		sbulto.setModel(new SpinnerNumberModel(new Short((short) 1), new Short((short) 0), new Short((short) 10), new Short((short) 1)));
		sbulto.setBounds(256, 79, 111, 20);
		contentPane.add(sbulto);

		JButton btnSortear = new JButton("SORTEAR");
		btnSortear.addActionListener(new ActionListener() {
			short a=0;
			public void actionPerformed(ActionEvent arg0) {
				 short bulto = (short)sbulto.getValue();
				a=(short) (a+bulto); 
					Circulo dibujar=new Circulo ();
					if(bulto<5){
						int i= proced.getSelectedIndex();
						Random r = new Random();//genera numeros
						if(i==0) {
							int interior = r.nextInt(2)+1;
							if(interior==1) {
								dibujar.rojo(getGraphics());
							}
							else {
								dibujar.verde(getGraphics());
							}
						}
						else {
							int exterior = r.nextInt(5)+1; 
							if(exterior==2 || exterior==4) {
								dibujar.rojo(getGraphics());
							}
							else {
								dibujar.verde(getGraphics());
							}
						}
					}
					else{
						dibujar.rojo(getGraphics());
					}
					nbultos.setText(Integer.toString(a));
					sbulto.setValue(0);
				}
		});
		btnSortear.setBounds(149, 143, 89, 23);
		contentPane.add(btnSortear);
	}	
}


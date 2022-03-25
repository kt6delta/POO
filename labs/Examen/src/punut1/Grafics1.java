package punut1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grafics1 extends JFrame {

	private JPanel contentPane;

	public Grafics1() { //muestra el frame principal
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String di="/imagen/txttucan.jpg";
		String di2="/imagen/txtaguila.jpg";
		
		JButton btnTucan = new JButton("");
		btnTucan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tucan mostrar = new Tucan();
				mostrar.Graficos();
			}
		});
		btnTucan.setSize(new Dimension(2, 2)); //para que los botones sean invisibles
		btnTucan.setContentAreaFilled(false);
		btnTucan.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnTucan.setBorderPainted(false);
		btnTucan.setBorder(null);
		btnTucan.setBackground(new Color(255, 255, 153));
		btnTucan.setBounds(10, 45, 95, 70);
		contentPane.add(btnTucan);
		
		JButton btnAguila = new JButton("");
		btnAguila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aguila mostrar = new Aguila();
				mostrar.Graficos();			
			}
		});
		btnAguila.setSize(new Dimension(2, 2));
		btnAguila.setContentAreaFilled(false);
		btnAguila.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnAguila.setBorderPainted(false);
		btnAguila.setBorder(null);
		btnAguila.setBackground(new Color(255, 255, 153));
		btnAguila.setBounds(10, 120, 95, 70);
		contentPane.add(btnAguila);
		
		JButton btnAves = new JButton("Aves");
		btnAves.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTucan.setIcon(new ImageIcon(Grafics1.class.getResource(di)));
				btnAguila.setIcon(new ImageIcon(Grafics1.class.getResource(di2)));
			}
		});
		btnAves.setBounds(10, 11, 95, 23);
		contentPane.add(btnAves);
		
		String di3="/imagen/txtleon.jpg";
		String di4="/imagen/txtchimpance.jpg";
		
		JButton btnleon = new JButton("");
		btnleon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Leon mostrar = new Leon();
				mostrar.Graficos();	
			}
		});
		btnleon.setSize(new Dimension(2, 2));
		btnleon.setContentAreaFilled(false);
		btnleon.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnleon.setBorderPainted(false);
		btnleon.setBackground(new Color(255, 255, 153));
		btnleon.setBounds(115, 45, 95, 70);
		contentPane.add(btnleon);
		
		
		JButton btnChimpance = new JButton("");
		btnChimpance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Chimpance mostrar = new Chimpance();
				mostrar.Graficos();	
			}
		});
		btnChimpance.setSize(new Dimension(2, 2));
		btnChimpance.setContentAreaFilled(false);
		btnChimpance.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnChimpance.setBorderPainted(false);
		btnChimpance.setBorder(null);
		btnChimpance.setBackground(new Color(255, 255, 153));
		btnChimpance.setBounds(124, 120, 95, 70);
		contentPane.add(btnChimpance);

		JButton btnMamiferos = new JButton("Mamiferos");
		btnMamiferos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnleon.setIcon(new ImageIcon(Grafics1.class.getResource(di3)));
				btnChimpance.setIcon(new ImageIcon(Grafics1.class.getResource(di4)));
			}
		});
		btnMamiferos.setBounds(115, 11, 95, 23);
		contentPane.add(btnMamiferos);
		
		String di5="/imagen/txtalojote.jpg";
		
		JButton btnAlojote = new JButton("");
		btnAlojote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ajolote mostrar = new Ajolote();
				mostrar.Graficos();	
			}
		});
		btnAlojote.setSize(new Dimension(2, 2));
		btnAlojote.setContentAreaFilled(false);
		btnAlojote.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnAlojote.setBorderPainted(false);
		btnAlojote.setBorder(null);
		btnAlojote.setBackground(new Color(255, 255, 153));
		btnAlojote.setBounds(217, 45, 95, 70);
		contentPane.add(btnAlojote);
		
		JButton btnAnfibios = new JButton("Anfibios");
		btnAnfibios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAlojote.setIcon(new ImageIcon(Grafics1.class.getResource(di5)));
			}
		});
		btnAnfibios.setBounds(217, 11, 95, 23);
		contentPane.add(btnAnfibios);
		
		String di6="/imagen/txtiguana.jpg";
		String di7="/imagen/txttortuga.png";
		
		JButton btnIguana = new JButton("");
		btnIguana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iguana mostrar = new Iguana();
				mostrar.Graficos();	
			}
		});
		btnIguana.setSize(new Dimension(2, 2));
		btnIguana.setContentAreaFilled(false);
		btnIguana.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnIguana.setBorderPainted(false);
		btnIguana.setBorder(null);
		btnIguana.setBackground(new Color(255, 255, 153));
		btnIguana.setBounds(322, 45, 95, 70);
		contentPane.add(btnIguana);
		
		JButton btnTortuga = new JButton("");
		btnTortuga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tortuga mostrar = new Tortuga();
				mostrar.Graficos();	
			}
		});
		btnTortuga.setSize(new Dimension(2, 2));
		btnTortuga.setContentAreaFilled(false);
		btnTortuga.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnTortuga.setBorderPainted(false);
		btnTortuga.setBorder(null);
		btnTortuga.setBackground(new Color(255, 255, 153));
		btnTortuga.setBounds(322, 120, 95, 70);
		contentPane.add(btnTortuga);
		
		JButton btnReptiles = new JButton("Reptiles");
		btnReptiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIguana.setIcon(new ImageIcon(Grafics1.class.getResource(di6)));
				btnTortuga.setIcon(new ImageIcon(Grafics1.class.getResource(di7)));
			}
		});
		btnReptiles.setBounds(322, 11, 95, 23);
		contentPane.add(btnReptiles);			
	}
}

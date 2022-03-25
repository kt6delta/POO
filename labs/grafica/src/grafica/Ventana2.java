package grafica;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JLabel titulo_principal;
	private JLabel imagen_principal;
	private JTextField nombre_principal;
	private JButton btnIngresar;
	
	public Ventana2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana2.class.getResource("/imagen/usuario.png")));
		setTitle("inicio secion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		 titulo_principal=new JLabel("Bienvenido Usuario, Ingrese su Nick");
		 titulo_principal.setHorizontalAlignment(SwingConstants.CENTER);
		 titulo_principal.setBounds(114, 136, 210, 30);
		
		 imagen_principal=new JLabel();
		 imagen_principal.setBounds(171,25,100,100);
		 
		 ImageIcon i_label= new ImageIcon(getClass().getResource("/imagen/usuario.png"));
		 Icon icono1= new ImageIcon(i_label.getImage().getScaledInstance( imagen_principal.getWidth(), imagen_principal.getHeight(), Image.SCALE_DEFAULT));
		 
		 imagen_principal.setIcon(icono1);
		 nombre_principal = new JTextField();
		 nombre_principal.setBounds(143,177,154, 23);
		 
		 contentPane.add(titulo_principal);
		 contentPane.add( imagen_principal);
		 contentPane.add(nombre_principal);
//		 contentPane.add(btnIngresar);
		 
		 JButton   btnIngresar= new   JButton("ingresar datos");
		 btnIngresar.addActionListener(new ActionListener() {
			 public void actionPerformed (ActionEvent arg0) {
				 JOptionPane.showMessageDialog(btnIngresar, "Exito has entrado"+  nombre_principal.getText(),"verificacion",1);
			 }
		 });
		 btnIngresar.setBounds(143,227,154,23);
		
		 
		 
	}
}


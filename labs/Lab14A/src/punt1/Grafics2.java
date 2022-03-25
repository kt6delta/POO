package punt1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grafics2 extends JFrame {

	private JPanel contentPane;
	private JTextField textNo;
	private JTextField textAp;
	private JTextField textAp2;
	private JSpinner spNE;
	private JSpinner spGr;
	private JSpinner spEd;
	private String estudiante[][];

	public Grafics2() {
		setTitle("Estudiantes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbT1 = new JLabel("Numero de Estudiantes");
		lbT1.setBounds(30, 11, 111, 14);
		contentPane.add(lbT1);
		
		JSpinner spNE = new JSpinner();
		spNE.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spNE.setBounds(40, 36, 42, 20);
		contentPane.add(spNE);
		
		JLabel lbT2 = new JLabel("Grupo");
		lbT2.setBounds(201, 11, 46, 14);
		contentPane.add(lbT2);
		
		JSpinner spGr = new JSpinner();
		spGr.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spGr.setBounds(201, 36, 29, 20);
		contentPane.add(spGr);
		
		JLabel lbT3 = new JLabel("Edad");
		lbT3.setBounds(285, 11, 46, 14);
		contentPane.add(lbT3);
		
		JSpinner spEd = new JSpinner();
		spEd.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spEd.setBounds(285, 36, 29, 20);
		contentPane.add(spEd);
		
		JLabel lbT4 = new JLabel("Nombre");
		lbT4.setBounds(10, 70, 46, 14);
		contentPane.add(lbT4);
		
		textNo = new JTextField();
		textNo.setBounds(10, 95, 85, 20);
		contentPane.add(textNo);
		textNo.setColumns(10);
		
		JLabel lbT5 = new JLabel("Primer Apellido");
		lbT5.setBounds(115, 70, 89, 14);
		contentPane.add(lbT5);
		
		textAp = new JTextField();
		textAp.setBounds(115, 95, 150, 20);
		contentPane.add(textAp);
		textAp.setColumns(10);
		
		JLabel lbT6 = new JLabel("Segundo Apellido");
		lbT6.setBounds(285, 70, 100, 14);
		contentPane.add(lbT6);
		
		textAp2 = new JTextField();
		textAp2.setBounds(285, 95, 150, 20);
		contentPane.add(textAp2);
		textAp2.setColumns(10);
		
		JLabel lbT7 = new JLabel("guarde cada uno de los estudiantes");
		lbT7.setBounds(128, 126, 186, 24);
		contentPane.add(lbT7);
				
		JButton btn = new JButton("Guardar");
		btn.addActionListener(new ActionListener() {
			int nestudi= (int) spNE.getValue();
			int b=0;
			public void actionPerformed(ActionEvent arg0) {
				if(b<nestudi){
					Datos(b);
					Persona student = new Persona ((int) spNE.getValue());
					Estudiante archivo = new Estudiante((int) spNE.getValue());
					archivo.guardar();
					b++;
				}
				else{
					JOptionPane.showMessageDialog(null,"Ya ingreso los datos de todos los estudiantes");
				}
			}
		});
		btn.setBounds(167, 158, 89, 23);
		contentPane.add(btn);
	}
	
	public void Datos(int b){
		int ne= (int) spNE.getValue();
		estudiante = new String [ne][5];
		
		estudiante [b][0]=textNo.getText();
		estudiante [b][1]=textAp.getText();
		estudiante [b][2]=textAp2.getText();
		estudiante [b][3]=Integer.toString((int)spEd.getValue());
		estudiante [b][4]=Integer.toString((int)spGr.getValue());
	}
	public String getDatos(int i, int j){
		return estudiante [i][j];
	}
}

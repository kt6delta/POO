package punt1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grafics1 extends JFrame { //profes

	private JPanel contentPane;
	private JTextField textNo;
	private JTextField textAp;
	private JTextField textAp2;
	private JSpinner spNP;
	private JSpinner spEd;
	private String profesor[][];

	public Grafics1() {
		setTitle("Profesores\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbT1 = new JLabel("Numero de Profesores");
		lbT1.setBounds(83, 21, 111, 14);
		contentPane.add(lbT1);
		
		JSpinner spNP = new JSpinner();
		spNP.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spNP.setBounds(115, 46, 29, 20);
		contentPane.add(spNP);
		
		JLabel lbT2 = new JLabel("Edad");
		lbT2.setBounds(239, 21, 31, 14);
		contentPane.add(lbT2);
		
		JSpinner spEd = new JSpinner();
		spEd.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spEd.setBounds(239, 46, 29, 20);
		contentPane.add(spEd);
		
		JLabel lbT3 = new JLabel("Nombre");
		lbT3.setBounds(10, 85, 70, 14);
		contentPane.add(lbT3);
		
		textNo = new JTextField();
		textNo.setBounds(10, 110, 85, 20);
		contentPane.add(textNo);
		textNo.setColumns(10);
		
		JLabel lbT4 = new JLabel("Primer Apellido");
		lbT4.setBounds(115, 85, 111, 14);
		contentPane.add(lbT4);
		
		textAp = new JTextField();
		textAp.setBounds(115, 110, 115, 20);
		contentPane.add(textAp);
		textAp.setColumns(10);
		
		JLabel lbT5 = new JLabel("Segundo Apellido");
		lbT5.setBounds(252, 85, 102, 14);
		contentPane.add(lbT5);
		
		textAp2 = new JTextField();
		textAp2.setBounds(252, 110, 115, 20);
		contentPane.add(textAp2);
		textAp2.setColumns(10);
				
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			int nprofes =(int) spNP.getValue();
			int b=0;
			public void actionPerformed(ActionEvent arg0) {
				if(b<nprofes){
					Datos(b);
					Profesor archivo = new Profesor();
					archivo.guardar();
					JOptionPane.showMessageDialog(null,"Dirige el grupo"+ b);
					b++;
				}
				else{
					JOptionPane.showMessageDialog(null,"Ya ingreso los datos de todos los profesores");
				}
			}
		});
		btnGuardar.setBounds(144, 142, 89, 23);
		contentPane.add(btnGuardar);
	}
	public void Datos(int b){
		int n= (int) spNP.getValue();
		profesor = new String [n][4];
		profesor[b][0]=textNo.getText();
		profesor[b][1]=textAp.getText();
		profesor[b][2]=textAp2.getText();
		profesor[b][3]=Integer.toString((int)spEd.getValue());
	}
	public String getDatos(int i, int j){
		return profesor[i][j];
	}
	public int getNP(){
		return (int) spNP.getValue();
	}
	
}

package punt1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Grafica extends JFrame {

	public JPanel contentPane;
	public JTextField textF1C1;
	public JTextField textF1C2;
	public JTextField textF1C3;
	public JTextField textF2C1;
	public JTextField textF3C1;
	public JTextField textF4C1;
	public JTextField textF5C1;
	public JTextField textF2C2;
	public JTextField textF2C3;
	public JTextField textF3C2;
	public JTextField textF4C2;
	public JTextField textF5C2;
	public JTextField textF3C3;
	public JTextField textF4C3;
	public JTextField textF5C3;
	public JLabel lbNF1;
	public JLabel lbNF2;
	public JLabel lbNF3;
	public JLabel lbNF4;
	public JLabel lbNF5;
	public JLabel lbN1;
	public JLabel lbN2;
	public JLabel lbN3;
	public JLabel lbN4;
	public JLabel lbN5;
	
	public float notas[][];
	
	public Grafica() {
		setTitle("notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbT1 = new JLabel("ESTUDIANTES");
		lbT1.setFont(new Font("Arial", Font.BOLD, 15));
		lbT1.setBounds(10, 25, 117, 14);
		contentPane.add(lbT1);
		
		JLabel lbT2 = new JLabel("NOTA1");
		lbT2.setBounds(140, 26, 46, 14);
		contentPane.add(lbT2);
		
		JLabel lbT3 = new JLabel("NOTA2");
		lbT3.setBounds(210, 25, 46, 14);
		contentPane.add(lbT3);
		
		JLabel lbT4 = new JLabel("NOTA3");
		lbT4.setBounds(280, 26, 46, 14);
		contentPane.add(lbT4);
		
		JLabel lbT5 = new JLabel("RESULTADO");
		lbT5.setBounds(350, 25, 75, 14);
		contentPane.add(lbT5);
		
		JLabel lbN1 = new JLabel("Maritza Zambrano");
		lbN1.setBounds(10, 60, 113, 14);
		contentPane.add(lbN1);
		
		JLabel lbN2 = new JLabel("Javier Martinez R.");
		lbN2.setBounds(10, 90, 117, 14);
		contentPane.add(lbN2);
		
		JLabel lbN3 = new JLabel("Mario Felipe Lozano");
		lbN3.setBounds(10, 120, 117, 14);
		contentPane.add(lbN3);
		
		JLabel lbN4 = new JLabel("Maria Fernanda Martinez");
		lbN4.setBounds(10, 150, 123, 14);
		contentPane.add(lbN4);
		
		JLabel lbN5 = new JLabel("Dario Fernando Lozano");
		lbN5.setBounds(10, 180, 123, 14);
		contentPane.add(lbN5);
		
		textF1C1 = new JTextField();
		textF1C1.setBounds(140, 55, 50, 20);
		contentPane.add(textF1C1);
		textF1C1.setColumns(10);		
		textF1C1.setText("4.5");
		
		textF1C2 = new JTextField();
		textF1C2.setBounds(210, 55, 50, 20);
		contentPane.add(textF1C2);
		textF1C2.setColumns(10);
		textF1C2.setText("4.6");
		
		textF1C3 = new JTextField();
		textF1C3.setBounds(280, 55, 50, 20);
		contentPane.add(textF1C3);
		textF1C3.setColumns(10);
		textF1C3.setText("3.3");
		
		JLabel lbNF1 = new JLabel("");
		lbNF1.setBounds(350, 55, 50, 20);
		contentPane.add(lbNF1);	
		
		textF2C1 = new JTextField();
		textF2C1.setBounds(140, 85, 50, 20);
		contentPane.add(textF2C1);
		textF2C1.setColumns(10);
		textF2C1.setText("3.5");
		
		textF2C2 = new JTextField();
		textF2C2.setBounds(210, 85, 50, 20);
		contentPane.add(textF2C2);
		textF2C2.setColumns(10);
		textF2C2.setText("3.3");
		
		textF2C3 = new JTextField();
		textF2C3.setBounds(280, 85, 50, 20);
		contentPane.add(textF2C3);
		textF2C3.setColumns(10);
		textF2C3.setText("4.7");
		
		JLabel lbNF2 = new JLabel("");
		lbNF2.setBounds(350, 85, 50, 20);
		contentPane.add(lbNF2);
		
		textF3C1 = new JTextField();
		textF3C1.setBounds(140, 115, 50, 20);
		contentPane.add(textF3C1);
		textF3C1.setColumns(10);
		textF3C1.setText("3.5");
		
		textF3C2 = new JTextField();
		textF3C2.setBounds(210, 115, 50, 20);
		contentPane.add(textF3C2);
		textF3C2.setColumns(10);
		textF3C2.setText("4.6");
		
		textF3C3 = new JTextField();
		textF3C3.setBounds(280, 115, 50, 20);
		contentPane.add(textF3C3);
		textF3C3.setColumns(10);
		textF3C3.setText("3.1");
		
		JLabel lbNF3 = new JLabel("");
		lbNF3.setBounds(350, 115, 50, 20);
		contentPane.add(lbNF3);
		
		textF4C1 = new JTextField();
		textF4C1.setBounds(140, 145, 50, 20);
		contentPane.add(textF4C1);
		textF4C1.setColumns(10);
		textF4C1.setText("2.5");
		
		textF4C2 = new JTextField();
		textF4C2.setBounds(210, 145, 50, 20);
		contentPane.add(textF4C2);
		textF4C2.setColumns(10);
		textF4C2.setText("4.5");
		
		textF4C3 = new JTextField();
		textF4C3.setBounds(280, 145, 50, 20);
		contentPane.add(textF4C3);
		textF4C3.setColumns(10);
		textF4C3.setText("2.9");
		
		JLabel lbNF4 = new JLabel("");
		lbNF4.setBounds(350, 145, 50, 20);
		contentPane.add(lbNF4);
		
		textF5C1 = new JTextField();
		textF5C1.setBounds(140, 175, 50, 20);
		contentPane.add(textF5C1);
		textF5C1.setColumns(10);
		textF5C1.setText("2.7");
		
		textF5C2 = new JTextField();
		textF5C2.setBounds(210, 175, 50, 20);
		contentPane.add(textF5C2);
		textF5C2.setColumns(10);
		textF5C2.setText("5.0");
		
		textF5C3 = new JTextField();
		textF5C3.setBounds(280, 175, 50, 20);
		contentPane.add(textF5C3);
		textF5C3.setColumns(10);
		textF5C3.setText("2.8");
		
		JLabel lbNF5 = new JLabel("");
		lbNF5.setBounds(350, 175, 50, 20);
		contentPane.add(lbNF5);
		
		C_archivos ar = new C_archivos();
		
		JButton btn = new JButton("Guardar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ar.guardar();
				Datos();
				
				lbNF1.setText(Float.toString(notas[0][3]));
				lbNF2.setText(Float.toString(notas[1][3]));
				lbNF3.setText(Float.toString(notas[2][3]));
				lbNF4.setText(Float.toString(notas[3][3]));
				lbNF5.setText(Float.toString(notas[4][3]));
				
				JOptionPane.showMessageDialog(null,"archivo creado");
			}
		});
		btn.setBounds(167, 227, 89, 23);
		contentPane.add(btn);

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ar.borrar();
				ar.guardar();
				Datos();
				lbNF1.setText(Float.toString(notas[0][3]));
				lbNF2.setText(Float.toString(notas[1][3]));
				lbNF3.setText(Float.toString(notas[2][3]));
				lbNF4.setText(Float.toString(notas[3][3]));
				lbNF5.setText(Float.toString(notas[4][3]));
				JOptionPane.showMessageDialog(null,"archivo editado");
			}
		});
		btnEditar.setBounds(60, 227, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textF1C1.setText("");
				textF1C2.setText("");
				textF1C3.setText("");
				textF2C1.setText("");
				textF2C2.setText("");
				textF2C3.setText("");
				textF3C1.setText("");			
				textF3C2.setText("");
				textF3C3.setText("");
				textF4C1.setText("");
				textF4C2.setText("");
				textF4C3.setText("");
				textF5C1.setText("");
				textF5C2.setText("");
				textF5C3.setText("");
				
				lbNF1.setText("");
				lbNF2.setText("");
				lbNF3.setText("");
				lbNF4.setText("");
				lbNF5.setText("");

				ar.borrar();
				JOptionPane.showMessageDialog(null,"archivo borrado");
			}
		});
		btnBorrar.setBounds(280, 227, 89, 23);
		contentPane.add(btnBorrar);		
	}
	public void Datos(){
		notas = new float[5][4];
		
		notas[0][0]=(float)  Float.parseFloat(textF1C1.getText());
		notas[0][1]=(float) Float.parseFloat(textF1C2.getText());
		notas[0][2]=(float) Float.parseFloat(textF1C3.getText());		
		
		notas[1][0]=(float)  Float.parseFloat(textF2C1.getText());
		notas[1][1]=(float)  Float.parseFloat(textF2C2.getText());
		notas[1][2]=(float)  Float.parseFloat(textF2C3.getText());
		
		notas[2][0]=(float)  Float.parseFloat(textF3C1.getText());
		notas[2][1]=(float) Float.parseFloat(textF3C2.getText());
		notas[2][2]=(float)  Float.parseFloat(textF3C3.getText());
	
		notas[3][0]=(float)  Float.parseFloat(textF4C1.getText());
		notas[3][1]=(float)  Float.parseFloat(textF4C2.getText());
		notas[3][2]=(float)  Float.parseFloat(textF4C3.getText());

		notas[4][0]=(float)  Float.parseFloat(textF5C1.getText());
		notas[4][1]= Float.parseFloat(textF5C2.getText());
		notas[4][2]=(float) Float.parseFloat(textF5C3.getText());
						
		for(int i=0; i<5; i++){
			notas[i][3]=(float) (notas[i][0]*0.3+notas[i][1]*0.3+notas[i][2]*0.4);
		}
	}
	
	public float getNotas(int i, int j, boolean a){ //el a es para que solo se ejecute una vez
		if(a){
			Datos();
		}
		return notas[i][j];
	}

}

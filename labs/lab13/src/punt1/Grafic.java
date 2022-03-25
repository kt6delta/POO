package punt1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grafic extends JFrame {
	private JPanel contentPane;
	private JTextField textA;
	private JTextField textB;
	private JTextField textC;
	private JLabel lbecuacion2;
	private JLabel lbtitle2;
	private JLabel lbX2;

	public Grafic() {
		setFont(new Font("Dialog", Font.BOLD, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Grafic.class.getResource("/imagen/icon.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbtitle = new JLabel("coeficientes:");
		lbtitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbtitle.setBounds(97, 23, 126, 14);
		contentPane.add(lbtitle);

		JLabel lbecuacion = new JLabel("x^2+");
		lbecuacion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbecuacion.setBounds(70, 52, 49, 14);
		contentPane.add(lbecuacion);

		lbecuacion2 = new JLabel("x+");
		lbecuacion2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbecuacion2.setBounds(175, 52, 22, 14);
		contentPane.add(lbecuacion2);

		textA = new JTextField();
		textA.setBounds(20, 51, 46, 20);
		contentPane.add(textA);

		textB = new JTextField();
		textB.setBounds(119, 51, 46, 20);
		contentPane.add(textB);

		textC = new JTextField();
		textC.setBounds(207, 51, 46, 20);
		contentPane.add(textC);

		lbtitle2 = new JLabel("soluciones de x:");
		lbtitle2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbtitle2.setBounds(95, 113, 128, 14);
		contentPane.add(lbtitle2);

		JLabel lbX = new JLabel("x1=");
		lbX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbX.setBounds(19, 149, 258, 14);
		contentPane.add(lbX);

		lbX2 = new JLabel("x2=");
		lbX2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbX2.setBounds(19, 202, 266, 14);
		contentPane.add(lbX2);

		JButton bthallar = new JButton("hallar");
		bthallar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a1 = textA.getText();
				String b1 = textB.getText();
				String c1 = textC.getText();
				textA.setText("");
				textB.setText("");
				textC.setText("");
					int a = Integer.parseInt(a1);
					int b = Integer.parseInt(b1);
					int c = Integer.parseInt(c1);
					if (a == 0 & b!=0 & c!=0) {
					JOptionPane.showMessageDialog(null,"es una ecuacion lineal");
					} else {
						if (a == 0 && b == 0 && c == 0) {
					JOptionPane.showMessageDialog(null,"identidad, es 0");
						} else {
							double x = (b * b - 4 * a * c);
							double x1 = 2*a;
							x1=(-b/x1);
//							textA.setText(Double.toString(x1));
							if (x == 0) { // cero
								lbX.setText("x1= " + (float)x1);
								lbX2.setText("x2= " + (float)x1);
							}
							if (x > 0) { // real
								x = ((-b + Math.pow(x, 0.5)) /a)*0.5;
								lbX.setText("x1= " + (float)x);
								x = ((-b - Math.pow(x, 0.5)) /a)*0.5;
								lbX2.setText("x2= " + (float)x);
							} else { // imaginario
								x = (Math.pow(-1 * x, 0.5) /a)*0.5;
								if (x > 0) {
									lbX.setText("x1= " +(float) x1 + "+" +(float) x + "i");
									lbX2.setText("x2= " + (float)x1 + "-" + (float)x + "i");
								}
								if (x < 0) {//ajustar los signos
									lbX.setText("x1= " + x1 + "-" + (float)(-1 * x)+ "i");
									lbX2.setText("x2= " + x1 + "+" + (float)(-1 * x)+ "i");
								}
								if(x1==0){
									lbX.setText("x1= " +(float)(-1 * x)+ "i");
									lbX2.setText("x2= "+(float) x + "i");
								}
							}
						}
					}
				}
		});
		bthallar.setBounds(95, 227, 89, 23);
		contentPane.add(bthallar);
	}
}

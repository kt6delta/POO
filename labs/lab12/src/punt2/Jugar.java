package punt2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLEditorKit.Parser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

import javax.swing.ImageIcon;

import punt1.Aduana;

import java.awt.Color;

public class Jugar extends JFrame {

	private JPanel contentPane;
	ImageIcon image;
	private JTextField txtfname1;
	private JTextField txtfname2;
	private boolean p1=false;
	boolean a; 
	boolean b1;
	boolean c;
	
	boolean d;
	boolean e1;
	boolean f;
	
	boolean g;
	boolean h;
	boolean i;
	
	private short win1=0;
	private short win2=0;
	
	public Jugar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Aduana.class.getResource("/icon/triki.png")));//la funcion grafica
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image circle = new ImageIcon(this.getClass().getResource("/circulo.png")).getImage();
		Image equis = new ImageIcon(this.getClass().getResource("/equis.png")).getImage();
		Image base = new ImageIcon(this.getClass().getResource("/base.jpg")).getImage();
		
		JLabel lbequis = new JLabel("");
		lbequis.setBounds(762, 137, 95, 90);
		contentPane.add(lbequis);
		lbequis.setIcon(new ImageIcon(equis));
		
		JLabel lbcirculo = new JLabel("");
		lbcirculo.setBounds(762, 311, 95, 90);
		contentPane.add(lbcirculo);
		lbcirculo.setIcon(new ImageIcon(circle));
		
		JLabel lbplayer1 = new JLabel("PLAYER1:");
		lbplayer1.setBounds(520, 137, 186, 23);
		contentPane.add(lbplayer1);
		
		JLabel lbwin1 = new JLabel("WIN:");
		lbwin1.setBounds(520, 215, 46, 14);
		contentPane.add(lbwin1);
		
		txtfname1 = new JTextField();
		txtfname1.setBounds(520, 171, 151, 33);
		contentPane.add(txtfname1);
		txtfname1.setColumns(10);
					
		JLabel lbplayer2 = new JLabel("PLAYER2:");
		lbplayer2.setBounds(520, 306, 220, 23);
		contentPane.add(lbplayer2);

		JLabel lbwin2 = new JLabel("WIN:");
		lbwin2.setBounds(520, 384, 46, 14);
		contentPane.add(lbwin2);
		
		txtfname2 = new JTextField();
		txtfname2.setBounds(520, 340, 151, 33);
		contentPane.add(txtfname2);
		txtfname2.setColumns(10);
		
		JButton btf1c1 = new JButton("");
		JButton btf1c2 = new JButton("");
		JButton btf1c3 = new JButton("");
		JButton btf2c1 = new JButton("");
		JButton btf2c2 = new JButton("");
		JButton btf2c3 = new JButton("");
		JButton btf3c1 = new JButton("");
		JButton btf3c2 = new JButton("");
		JButton btf3c3 = new JButton("");
		
				JButton btnNewPlay = new JButton("New Play");
				btnNewPlay.addActionListener(new ActionListener() {					
					short b=0;
					public void actionPerformed(ActionEvent e) {
						p1=false;
						
						if(b==0){
							String player=txtfname2.getText();
							lbplayer2.setText("Player 1:"+player);
							player=txtfname1.getText();
							lbplayer1.setText("Player 2:"+player);
							txtfname2.setText("");
							txtfname1.setText("");	
						}						
						btf1c1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(p1){
									btf1c1.setIcon(new ImageIcon(Jugar.class.getResource("/image/circulo.png")));
									p1=false;
									a=true; //circulo
								}
								else{
									btf1c1.setIcon(new ImageIcon(Jugar.class.getResource("/image/equis.png")));
									p1=true;
									a=false;//equis
								}	
							}
						});
						btf1c1.setBackground(Color.WHITE);
						btf1c1.setBounds(37, 39, 142, 133);
						contentPane.add(btf1c1);
						
						btf1c2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(p1){
									btf1c2.setIcon(new ImageIcon(Jugar.class.getResource("/image/circulo.png")));
									p1=false;
									b1=true;
								}
								else{
									btf1c2.setIcon(new ImageIcon(Jugar.class.getResource("/image/equis.png")));
									p1=true;
									b1=false;
								}
							}
						});
						btf1c2.setBackground(Color.WHITE);
						btf1c2.setBounds(198, 42, 120, 133);
						contentPane.add(btf1c2);
											
						btf1c3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(p1){
									btf1c3.setIcon(new ImageIcon(Jugar.class.getResource("/image/circulo.png")));
									p1=false;
									c=true;
								}
								else{
									btf1c3.setIcon(new ImageIcon(Jugar.class.getResource("/image/equis.png")));
									p1=true;
									c=false;
								}
							}
						});
						btf1c3.setBackground(Color.WHITE);
						btf1c3.setBounds(339, 39, 142, 133);
						contentPane.add(btf1c3);
						
						btf2c1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(p1){
									btf2c1.setIcon(new ImageIcon(Jugar.class.getResource("/image/circulo.png")));
									p1=false;
									d=true;
								}
								else{
									btf2c1.setIcon(new ImageIcon(Jugar.class.getResource("/image/equis.png")));
									p1=true;
									d=false;
								}
							}
						});
						btf2c1.setBackground(Color.WHITE);
						btf2c1.setBounds(37, 185, 142, 113);
						contentPane.add(btf2c1);
						
						btf2c2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(p1){
									btf2c2.setIcon(new ImageIcon(Jugar.class.getResource("/image/circulo.png")));
									p1=false;
									e1=true;
								}
								else{
									btf2c2.setIcon(new ImageIcon(Jugar.class.getResource("/image/equis.png")));
									p1=true;
									e1=false;
								}
							}
						});
						btf2c2.setBackground(Color.WHITE);
						btf2c2.setBounds(198, 185, 120, 113);
						contentPane.add(btf2c2);
						
						
						btf2c3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(p1){
									btf2c3.setIcon(new ImageIcon(Jugar.class.getResource("/image/circulo.png")));
									p1=false;
									f=true;
								}
								else{
									btf2c3.setIcon(new ImageIcon(Jugar.class.getResource("/image/equis.png")));
									p1=true;
									f=false;
								}
							}
						});
						btf2c3.setBackground(Color.WHITE);
						btf2c3.setBounds(339, 189, 142, 107);
						contentPane.add(btf2c3);
						
						btf3c1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(p1){
									btf3c1.setIcon(new ImageIcon(Jugar.class.getResource("/image/circulo.png")));
									p1=false;
									g=true;
								}
								else{
									btf3c1.setIcon(new ImageIcon(Jugar.class.getResource("/image/equis.png")));
									p1=true;
									g=false;
								}
							}
						});
						btf3c1.setBackground(Color.WHITE);
						btf3c1.setBounds(37, 313, 142, 133);
						contentPane.add(btf3c1);
						
						btf3c2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(p1){
									btf3c2.setIcon(new ImageIcon(Jugar.class.getResource("/image/circulo.png")));
									p1=false;
									h=true;
								}
								else{
									btf3c2.setIcon(new ImageIcon(Jugar.class.getResource("/image/equis.png")));
									p1=true;
									h=false;
								}
							}
						});
						btf3c2.setBackground(Color.WHITE);
						btf3c2.setBounds(198, 311, 123, 125);
						contentPane.add(btf3c2);
						
						btf3c3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(p1){
									btf3c3.setIcon(new ImageIcon(Jugar.class.getResource("/image/circulo.png")));
									p1=false;
									i=true;
								}
								else{
									btf3c3.setIcon(new ImageIcon(Jugar.class.getResource("/image/equis.png")));
									p1=true;
									i=false;
								}
							}
						});
						btf3c3.setBackground(Color.WHITE);
						btf3c3.setBounds(339, 313, 142, 133);
						contentPane.add(btf3c3);
						JLabel lbbase = new JLabel("");
						lbbase.setBounds(37, 39, 447, 407);
						contentPane.add(lbbase);
						lbbase.setIcon(new ImageIcon(base));	

						//win equis
						if((!a&!b1&!c) || ((!d&!e1&!f)) || ((!g&!h&!i)) || ((!a&!d&!g))|| ((!b1&!e1&!h)) || ((!c&!f&!i)) || ((!c&!e1&!g))){
							win1++;
						}
						//win circulo
						if((a&b1&c ||(d&e1&f)|| (g&h&i)||(a&d&g)|| (b1&e1&h) || (c&f&i) || (a&e1&i) || (c&e1&g))){
							win2++;
						}
						if(b==0){
							win2=0;
							win1=0;
						}
						lbwin2.setText("win:"+Integer.toString(win2));
						lbwin1.setText("win:"+Integer.toString(win1));
						
						btf1c1.setIcon(new ImageIcon(Jugar.class.getResource("/image/blanco.png")));
						btf1c2.setIcon(new ImageIcon(Jugar.class.getResource("/image/blanco.png")));
						btf1c3.setIcon(new ImageIcon(Jugar.class.getResource("/image/blanco.png")));
						btf2c1.setIcon(new ImageIcon(Jugar.class.getResource("/image/blanco.png")));
						btf2c2.setIcon(new ImageIcon(Jugar.class.getResource("/image/blanco.png")));
						btf2c3.setIcon(new ImageIcon(Jugar.class.getResource("/image/blanco.png")));
						btf3c1.setIcon(new ImageIcon(Jugar.class.getResource("/image/blanco.png")));
						btf3c2.setIcon(new ImageIcon(Jugar.class.getResource("/image/blanco.png")));
						btf3c3.setIcon(new ImageIcon(Jugar.class.getResource("/image/blanco.png")));
						b++;
					}
				});
				btnNewPlay.setBounds(450, 479, 89, 23);
				contentPane.add(btnNewPlay);
	}
}

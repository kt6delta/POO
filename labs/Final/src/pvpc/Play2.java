package pvpc;

//computadora

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import p1vp2.Play;

public class Play2 extends JFrame {

	private JPanel contentPane;
	JButton btnF0C0 = new JButton("");
	JButton btnF0C1 = new JButton("");
	JButton btnF0C2 = new JButton("");
	JButton btnF0C3 = new JButton("");
	JButton btnF0C4 = new JButton("");
	JButton btnF0C5 = new JButton("");
	JButton btnF0C6 = new JButton("");
		
	JButton btnF1C0 = new JButton("");
	JButton btnF1C1 = new JButton("");
	JButton btnF1C2 = new JButton("");
	JButton btnF1C3 = new JButton("");
	JButton btnF1C4 = new JButton("");
	JButton btnF1C5 = new JButton("");
	JButton btnF1C6 = new JButton("");	
	
	JButton btnF2C0 = new JButton("");
	JButton btnF2C1 = new JButton("");
	JButton btnF2C2 = new JButton("");
	JButton btnF2C3 = new JButton("");
	JButton btnF2C4 = new JButton("");
	JButton btnF2C5 = new JButton("");
	JButton btnF2C6 = new JButton("");
	
	JButton btnF3C0 = new JButton("");
	JButton btnF3C1 = new JButton("");
	JButton btnF3C2 = new JButton("");
	JButton btnF3C3 = new JButton("");
	JButton btnF3C4 = new JButton("");
	JButton btnF3C5 = new JButton("");
	JButton btnF3C6 = new JButton("");
	
	JButton btnF4C0 = new JButton("");
	JButton btnF4C1 = new JButton("");
	JButton btnF4C2 = new JButton("");
	JButton btnF4C3 = new JButton("");
	JButton btnF4C4 = new JButton("");
	JButton btnF4C5 = new JButton("");
	JButton btnF4C6 = new JButton("");
	
	JButton btnF5C0 = new JButton("");
	JButton btnF5C1 = new JButton("");
	JButton btnF5C2 = new JButton("");
	JButton btnF5C3 = new JButton("");
	JButton btnF5C4 = new JButton("");
	JButton btnF5C5 = new JButton("");
	JButton btnF5C6 = new JButton("");

	private boolean ocupado[][]; //evita que le cambien el color
	private boolean bloqueo[][]; //  solo lugares permitidos
	private boolean color[][]; // ganador
	
	public void vaciar(){		  
	ocupado = new boolean[6][7];
	color = new boolean[6][7];
	bloqueo = new boolean[6][7];
	
	for (int i = 0; i < 6; i++) {
		for (int j = 0; j < 7; j++) {
			bloqueo[i][j]=true;
			ocupado[i][j] = false;
			color[i][j]= false;
	
			bloqueo[0][j] = false; //primera fila
		}
	}
	}
	public void again(){
		String btInicio = "/imagen/4linea.PNG";
		vaciar();
		btnF0C0.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF0C0.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF0C1.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF0C2.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF0C3.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF0C4.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF0C5.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF0C6.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
			
		btnF1C0.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF1C1.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF1C2.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF1C3.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF1C4.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF1C5.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF1C6.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		
		btnF2C0.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF2C1.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF2C2.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF2C3.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF2C4.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF2C5.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF2C6.setIcon(new ImageIcon(Play.class.getResource(btInicio))); 
		
		btnF3C0.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF3C1.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF3C2.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF3C3.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF3C4.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF3C5.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF3C6.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		
		btnF4C0.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF4C1.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF4C2.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF4C3.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF4C4.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF4C5.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF4C6.setIcon(new ImageIcon(Play.class.getResource(btInicio))); 
		
		btnF5C0.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF5C1.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF5C2.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF5C3.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF5C4.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF5C5.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
		btnF5C6.setIcon(new ImageIcon(Play.class.getResource(btInicio)));
	}
	
	public int dibujar(int i, int j){	
		if (!(bloqueo[i][j])) {		
			if (!(ocupado[i][j])) {
				if(i!=5){
					bloqueo[i+1][j] = false;
				}
					color[i][j]=true;
					ocupado[i][j] = true;
					logica(i,j);
					ganador();
					return 1;//si es false p2
			}else {
				JOptionPane.showMessageDialog(null, "ya esta ocupado");
				return 0;
			}		
		} else {
			JOptionPane.showMessageDialog(null,"no puede usar esta casilla");
			return 0;
		}
	}
	
public void ganador(){
	for(int i=0; i<6; i++){
		for(int j=0; j<7; j++){
				if(j<4){
					if (ocupado[i][j]& ocupado[i][j+1]& ocupado[i][j+2]&ocupado[i][j+3]){ //winer en lateral izquierda-derecha
						if( (!color[i][j])& (!color[i][j+1])& (!color[i][j+2])& (!color[i][j+3]) ) { //4 falses seguidos
							JOptionPane.showMessageDialog(null,"Punto Rojo gana P2, 1er");
							again();
						}
						if(color[i][j]& color[i][j+1]& color[i][j+2]& color[i][j+3]){ //4 trues seguidos
							JOptionPane.showMessageDialog(null,"Punto Azul gana P1, 1er");	
							again();
						}
					}			
				}		
				if(j>2){
					if (ocupado[i][j]& ocupado[i][j-1]& ocupado[i][j-2]&ocupado[i][j-3]){ //winer en lateral derecha-izquierda
						if( (!color[i][j])& (!color[i][j-1])& (!color[i][j-2])& (!color[i][j-3]) ) { //4 falses seguidos
							JOptionPane.showMessageDialog(null,"Punto Rojo gana P2, 2do");
							again();
						}
						if(color[i][j]& color[i][j-1]& color[i][j-2]& color[i][j-3]){ //4 trues seguidos
							JOptionPane.showMessageDialog(null,"Punto Azul gana P1, 2do");
							again();
						}
					}			
				}
				
				if(i<3){
					if (ocupado[i][j]& ocupado[i+1][j]& ocupado[i+2][j]&ocupado[i+3][j]){ //winner arriba de abajo-arriba
						if( (!color[i][j])& (!color[i+1][j])& (!color[i+2][j])& (!color[i+3][j]) ) { //4 falses seguidos
							JOptionPane.showMessageDialog(null,"Punto Rojo gana P2, 3er");
							again();
						}
						if(color[i][j]& color[i+1][j]& color[i+2][j]& color[i+3][j]){ //4 trues seguidos
							JOptionPane.showMessageDialog(null,"Punto Azul gana P1, 3er");
							again();
						}
					}
				}
				
				if(i>3){
					if (ocupado[i][j]& ocupado[i-1][j]& ocupado[i-2][j]&ocupado[i-3][j]){ //winner arriba de arriba-abajo
						if( (!color[i][j])& (!color[i-1][j])& (!color[i-2][j])& (!color[i-3][j]) ) { //4 falses seguidos
							JOptionPane.showMessageDialog(null,"Punto Rojo gana P2, 4to");
							again();
						}
						if(color[i][j]& color[i-1][j]& color[i-2][j]& color[i-3][j]){ //4 trues seguidos
							JOptionPane.showMessageDialog(null,"Punto Azul gana P1, 4to");	
							again();
						}
					}
				}
				if(i<3 & j<4){ 
					if(ocupado[i][j]& ocupado[i+1][j+1]& ocupado[i+2][j+2]&ocupado[i+3][j+3]){ //diagonal winner
						if( (!color[i][j])& (!color[i+1][j+1])& (!color[i+2][j+2])& (!color[i+3][j+3]) ) { //4 falses seguidos
							JOptionPane.showMessageDialog(null,"Punto Rojo gana P2, 5to");
							again();
						}
						if(color[i][j]& color[i+1][j+1]& color[i+2][j+2]& color[i+3][j+3]){ //4 trues seguidos
							JOptionPane.showMessageDialog(null,"Punto Azul gana P1, 5to");	
							again();
						}
					}
				}
				if(i<3 & j>2){
					if(ocupado[i][j]& ocupado[i+1][j-1]& ocupado[i+2][j-2]&ocupado[i+3][j-3]){ //diagonal winner
						if(color[i][j]& color[i+1][j-1]& color[i+2][j-2]& color[i+3][j-3]){ //4 trues seguidos
							JOptionPane.showMessageDialog(null,"Punto Azul gana P1, 6to");	
							again();
						}
						if( (!color[i][j])& (!color[i+1][j-1])& (!color[i+2][j-2])& (!color[i+3][j-3]) ) { //4 falses seguidos
							JOptionPane.showMessageDialog(null,"Punto Rojo gana P2, 6to");
							again();
						}
					}
				}
				if(i>2 & j>2){ 
					if(ocupado[i][j]& ocupado[i-1][j-1]& ocupado[i-2][j-2]&ocupado[i-3][j-3]){ //diagonal winner
						if( (!color[i][j])& (!color[i-1][j-1])& (!color[i-2][j-2])& (!color[i-3][j-3]) ) { //4 falses seguidos
							JOptionPane.showMessageDialog(null,"Punto Rojo gana P2, 7to");
							again();
						}
						if(color[i][j]& color[i-1][j-1]& color[i-2][j-2]& color[i-3][j-3]){ //4 trues seguidos
							JOptionPane.showMessageDialog(null,"Punto Azul gana P1, 7to");	
							again();
						}
					}
				}
				if(i>2 & j<4){
					if(ocupado[i][j]& ocupado[i-1][j+1]& ocupado[i-2][j+2]&ocupado[i-3][j+3]){ //diagonal winner
						if( (!color[i][j])& (!color[i-1][j+1])& (!color[i-2][j+2])& (!color[i-3][j+3]) ) { //4 falses seguidos
							JOptionPane.showMessageDialog(null,"Punto Rojo gana P2, 8vo");
							again();
						}
						if(color[i][j]& color[i-1][j+1]& color[i-2][j+2]& color[i-3][j+3]){ //4 trues seguidos
							JOptionPane.showMessageDialog(null,"Punto Azul gana P1,8vo");	
							again();
						}
					}
				}
			}
		}
	}
	
	public boolean pc(int i, int j) {
		color[i][j] = false;
		ocupado[i][j] = true;
		if(i!=5){
			bloqueo[i+1][j] = false;
		}
		String btP2 = "/imagen/p2.PNG";

		if(i==0 & j==0) {
			btnF0C0.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==0 & j==1) {
			btnF0C1.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==0 & j==2) {
			btnF0C2.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==0 & j==3) {
			btnF0C3.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==0 & j==4) {
			btnF0C4.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==0 & j==5) {
			btnF0C5.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==0 & j==6) {
			btnF0C6.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==1 & j==0) {
			btnF1C0.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==1 & j==1) {
			btnF1C1.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==1 & j==2) {
			btnF1C2.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==1 & j==3) {
			btnF1C3.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==1 & j==4) {
			btnF1C4.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==1 & j==5) {
			btnF1C5.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==1 & j==6) {
			btnF1C6.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==2 & j==0) {
			btnF2C0.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==2 & j==1) {
			btnF2C1.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==2 & j==2) {
			btnF2C2.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==2 & j==3) {
			btnF2C3.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==2 & j==4) {
			btnF2C4.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==2 & j==5) {
			btnF2C5.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==2 & j==6) {
			btnF2C6.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==3 & j==0) {
			btnF3C0.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==3 & j==1) {
			btnF3C1.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==3 & j==2) {
			btnF3C2.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==3 & j==3) {
			btnF3C3.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==3 & j==4) {
			btnF3C4.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==3 & j==5) {
			btnF3C5.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==3 & j==6) {
			btnF3C6.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==4 & j==0) {
			btnF4C0.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==4 & j==1) {
			btnF4C1.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==4 & j==2) {
			btnF4C2.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==4 & j==3) {
			btnF4C3.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==4 & j==4) {
			btnF4C4.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==4 & j==5) {
			btnF4C5.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==4 & j==6) {
			btnF4C6.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==5 & j==0) {
			btnF5C0.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==5 & j==1) {
			btnF5C1.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==5 & j==2) {
			btnF5C2.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==5 & j==3) {
			btnF5C3.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==5 & j==4) {
			btnF5C4.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==5 & j==5) {
			btnF5C5.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		if(i==5 & j==6) {
			btnF5C6.setIcon(new ImageIcon(Play.class.getResource(btP2)));
		}
		return true;
	}
	
	public boolean pensar() {
		boolean a=false;
		
		for(int i=0; i<6; i++ ) {
			for(int j=0; j<7; j++) {
				if(!a) {
					if(j<4) { //lado derecha-izquierda
						if(ocupado[i][j]& ocupado[i][j+1]& ocupado[i][j+2]){
							if(!color[i][j] & !color[i][j+1] & !color[i][j+2]) {
								if(!ocupado[i][j+3] & !bloqueo[i][j+3]){				
									a=pc(i,j+3);
									System.out.println("DERECHA_P");
								}
							}
						}
					}
					
					if(j>2) {//lado izquierda-derecha
						if(ocupado[i][j]& ocupado[i][j-1]& ocupado[i][j-2]){
							if( (!color[i][j])& (!color[i][j-1])& (!color[i][j-2]) ) { //3 falses seguidos
								if(!ocupado[i][j-3] & !bloqueo[i][j-3]){
								a=pc(i,j-3);
								System.out.println("IZQUIERDA_P");
								}
							}
						}
					}
					
					if(i>=2){ //arriba
						if(ocupado[i][j]& ocupado[i-1][j]& ocupado[i-2][j]){
							if( (!color[i][j])& (!color[i-1][j])& (!color[i-2][j]) ) { //3 falses seguidos
								if(!ocupado[i+1][j] & !bloqueo[i+1][j]){
									a=pc(i+1, j);
									System.out.println("ARRIBA_P");
								}
							}
						}
					}
					
					if(i<5 & i>1 & j<6 & j>1){ 
						if(ocupado[i][j]& ocupado[i-1][j-1]& ocupado[i-2][j-2]){ //diagonal winner
							if( (!color[i][j])& (!color[i-1][j-1])& (!color[i-2][j-2]) ) { //3 falses seguidos
								if(!ocupado[i+1][j+1] & !bloqueo[i+1][j+1]){
									a=pc(i+1, j+1);
									System.out.println("DIAGOD_P");
								}
							}
						}
					}
					
					if(i<5 & i>1 & j>0 & j<5){
						if(ocupado[i][j]& ocupado[i-1][j+1]& ocupado[i-2][j+2]){ //diagonal winner
								if( (!color[i][j])& (!color[i-1][j+1])& (!color[i-2][j+2]) ) { //3 falses seguidos
									if(!ocupado[i+1][j-1] & !bloqueo[i+1][j-1]){
										a=pc(i+1, j-1);
										System.out.println("DIAGOI_P");
									}
								}
							}
						}
				}
			}
		}
		return a;	
	}
	
	
	public boolean pensar(int i, int j){
		boolean a=false;

		a=pensar();
		
		if(!a) {
			if(j<=5 & j>=2 & !a){
				if (ocupado[i][j]& ocupado[i][j-1]& ocupado[i][j-2]){ //winer en lateral izquierda-derecha
					if( color[i][j] & color[i][j-1] & color[i][j-2] ) { //3 trues seguidos
						if(!ocupado[i][j+1] & !bloqueo[i][j+1]){
							a=pc(i,j+1);
							System.out.println("DERECHA_PIE");
						}
					}
				}			
			}		
			if(j>=1 & j<=4  & !a){
				if (ocupado[i][j]& ocupado[i][j+1]& ocupado[i][j+2]){ //winer en lateral derecha-izquierda
					if( (color[i][j])& (color[i][j+1])& (color[i][j+2]) ) { //3 trues seguidos
						if(!ocupado[i][j-1] & !bloqueo[i][j-1]){
						a=pc(i,j-1);
						System.out.println("IZQUIERDA_PIE");
						}
					}
				}			
			}
			
			if(i>=2  & !a){
				if (ocupado[i][j]& ocupado[i-1][j]& ocupado[i-2][j]){ //winner  abajo-arriba
					if( (color[i][j])& (color[i-1][j])& (color[i-2][j]) ) { //3 trues seguidos
						if(!ocupado[i+1][j] & !bloqueo[i+1][j]){
							a=pc(i+1, j);
							System.out.println("ARRIBA_PIE");
						}
					}
				}
			}
	
			if(i<5 & i>1 & j<6 & j>1  & !a){ 
				if(ocupado[i][j]& ocupado[i-1][j-1]& ocupado[i-2][j-2]){ //diagonal winner
					if( (color[i][j])& (color[i-1][j-1])& (color[i-2][j-2]) ) { //3 trues seguidos
						if(!ocupado[i+1][j+1] & !bloqueo[i+1][j+1]){
							a=pc(i+1, j+1);
							System.out.println("DIAGOD_PIE");
						}
					}
				}
			}
			if(i<5 & i>1 & j>0 & j<5  & !a){
				if(ocupado[i][j]& ocupado[i-1][j+1]& ocupado[i-2][j+2]){ //diagonal winner
						if( (color[i][j])& (color[i-1][j+1])& (color[i-2][j+2]) ) { //3 trues seguidos
							if(!ocupado[i+1][j-1] & !bloqueo[i+1][j-1]){
								a=pc(i+1, j-1);
								System.out.println("DIAGOI_PIE");
							}
						}
					}
				}
		}
		return a;
	}
	
	public void logica (int i, int j) {
		boolean a=false;
		int fila= i;
		int columna=j;
		a=pensar(i,j);
		
		while(!a){
			i=fila;
			j=columna;
			int random;
			if(i%2==0 & j%3==0){
				random = (int)(Math.random()*5);
			}else{
				random =(int)(Math.random()*5+1);
			}	
				
			if(random==0) {
				if(i!=5){
					if(!bloqueo[i+1][j] & !ocupado[i+1][j]) {
						a=pc(i+1,j);
						System.out.println("arriba");
					}
				}		
			}
			
			if(random==1){
				int temp[], temp2[];
				temp = new int[8]; //filas
				temp2 = new int[8]; //columnas
				int posi=0;
				
				for(int f=0; f<6; f++){
					for(int c=0; c<7; c++){
						if(!bloqueo[f][c] & !ocupado[f][c]){//guarda el i y el j
							temp[posi]=f;
							temp2[posi]=c;
							posi++;
						}
					}
				}
				int	randomi =(int)(Math.random()*posi);
				a=pc(temp[randomi],temp2[randomi]);
				System.out.println("lugar libre");
			}
			
			if(random==2) {
				if(j<6 & j>0){ 
					if(!bloqueo[i][j-1] & !ocupado[i][j-1]){
						System.out.println("izquierda");
						a=pc(i,j-1);//actualiza dato y dibuja 
					}else{
						random=3;
					}
				}
				if(j==6){
					if (!bloqueo[i][j-1] & !ocupado[i][j-1]) { 
						a=pc(i,j-1);
						System.out.println("izquierda j=6");
					}else{
						random=3;
					}
				}
			}
			
			if(random==3) {
				if(j<6 & j>0){
					if(!bloqueo[i][j+1] & !ocupado[i][j+1]) {
						a=pc(i,j+1);
						System.out.println("derecha");	
					}else{
						random=4;
					}
				}
				if(j==0){
					if(!bloqueo[i][j+1] & !ocupado[i][j+1]){
						a=pc(i,j+1);
						System.out.println("derecha j=0");
						}
					}else{
						random=4;
					}
				}
			
			if(random==4) {
				if(i!=5 & j!=0){
					if(ocupado[i][j-1]) { 
							if(!bloqueo[i+1][j-1] & !ocupado[i+1][j-1]) {
								a=pc(i+1,j-1);
								System.out.print("diagonal izquierda");
							}else{
								random=5;
							}
						}
					}else{
						random=5;
					}
				}
			
			if(random==5) {
				if(i!=5 & j!=6){
					if(ocupado[i][j+1]) {
						if(!bloqueo[i+1][j+1] & !ocupado[i+1][j+1]) {
							a=pc(i+1,j+1);
							System.out.println("diagonal derecha");
						}
					}
				}
			}		
		}	
	}
	

	public Play2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnF0C0.setBounds(43, 345, 53, 53);
		btnF0C1.setBounds(93, 345, 53, 53);
		btnF0C2.setBounds(143, 345, 53, 53);
		btnF0C3.setBounds(193, 345, 53, 53);
		btnF0C4.setBounds(243, 345, 53, 53);
		btnF0C5.setBounds(293, 345, 53, 53);
		btnF0C6.setBounds(342, 345, 53, 53);
		
		btnF1C0.setBounds(43, 294, 53, 53);
		btnF1C1.setBounds(93, 294, 53, 53);
		btnF1C2.setBounds(143, 294, 53, 53);
		btnF1C3.setBounds(193, 294, 53, 53);
		btnF1C4.setBounds(243, 294, 53, 53);
		btnF1C5.setBounds(293, 294, 53, 53);
		btnF1C6.setBounds(342, 294, 53, 53);

		btnF2C0.setBounds(43, 243, 53, 53);
		btnF2C1.setBounds(93, 243, 53, 53);
		btnF2C2.setBounds(143, 243, 53, 53);
		btnF2C3.setBounds(193, 243, 53, 53);
		btnF2C4.setBounds(243, 243, 53, 53);
		btnF2C5.setBounds(293, 243, 53, 53);
		btnF2C6.setBounds(342, 243, 53, 53);
		
		btnF3C0.setBounds(43, 192, 53, 53);
		btnF3C1.setBounds(93, 192, 53, 53);
		btnF3C2.setBounds(143, 192, 53, 53);
		btnF3C3.setBounds(193, 192, 53, 53);
		btnF3C4.setBounds(243, 192, 53, 53);
		btnF3C5.setBounds(293, 192, 53, 53);
		btnF3C6.setBounds(342, 192, 53, 53);
		
		btnF4C0.setBounds(43, 141, 53, 53);
		btnF4C1.setBounds(93, 141, 53, 53);
		btnF4C2.setBounds(143, 141, 53, 53);
		btnF4C3.setBounds(193, 141, 53, 53);
		btnF4C4.setBounds(243, 141, 53, 53);
		btnF4C5.setBounds(293, 141, 53, 53);
		btnF4C6.setBounds(342, 141, 53, 53);

		btnF5C0.setBounds(43, 90, 53, 53);
		btnF5C1.setBounds(93, 90, 53, 53);
		btnF5C2.setBounds(143, 90, 53, 53);
		btnF5C3.setBounds(193, 90, 53, 53);
		btnF5C4.setBounds(243, 90, 53, 53);
		btnF5C5.setBounds(293, 90, 53, 53);
		btnF5C6.setBounds(342, 90, 53, 53);

		again();
		String btP1 = "/imagen/p1.PNG";
		
		btnF0C0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(0,0);
				if(1==temp){
				btnF0C0.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		contentPane.setLayout(null);
		btnF0C0.setContentAreaFilled(false);
		btnF0C0.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF0C0.setBorderPainted(false);
		btnF0C0.setBorder(null);
		btnF0C0.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF0C0);

		btnF0C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(0,1);
				if(1==temp){
				btnF0C1.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF0C1.setContentAreaFilled(false);
		btnF0C1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF0C1.setBorderPainted(false);
		btnF0C1.setBorder(null);
		btnF0C1.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF0C1);

		btnF0C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(0,2);
				if(1==temp){
				btnF0C2.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF0C2.setContentAreaFilled(false);
		btnF0C2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF0C2.setBorderPainted(false);
		btnF0C2.setBorder(null);
		btnF0C2.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF0C2);

		btnF0C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(0,3);
				if(1==temp){
				btnF0C3.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF0C3.setContentAreaFilled(false);
		btnF0C3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF0C3.setBorderPainted(false);
		btnF0C3.setBorder(null);
		btnF0C3.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF0C3);

		btnF0C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(0,4);
				if(1==temp){
				btnF0C4.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF0C4.setContentAreaFilled(false);
		btnF0C4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF0C4.setBorderPainted(false);
		btnF0C4.setBorder(null);
		btnF0C4.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF0C4);

		btnF0C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(0,5);
				if(1==temp){
				btnF0C5.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF0C5.setContentAreaFilled(false);
		btnF0C5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF0C5.setBorderPainted(false);
		btnF0C5.setBorder(null);
		btnF0C5.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF0C5);

		btnF0C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(0,6);
				if(1==temp){
				btnF0C6.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF0C6.setContentAreaFilled(false);
		btnF0C6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF0C6.setBorderPainted(false);
		btnF0C6.setBorder(null);
		btnF0C6.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF0C6);

		btnF1C0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(1,0);
				if(1==temp){
				btnF1C0.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		
		btnF1C0.setContentAreaFilled(false);
		btnF1C0.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF1C0.setBorderPainted(false);
		btnF1C0.setBorder(null);
		btnF1C0.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF1C0);

		btnF1C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(1,1);
				if(1==temp){
				btnF1C1.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF1C1.setContentAreaFilled(false);
		btnF1C1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF1C1.setBorderPainted(false);
		btnF1C1.setBorder(null);
		btnF1C1.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF1C1);

		btnF1C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(1,2);
				if(1==temp){
					btnF1C2.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF1C2.setContentAreaFilled(false);
		btnF1C2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF1C2.setBorderPainted(false);
		btnF1C2.setBorder(null);
		btnF1C2.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF1C2);

		btnF1C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(1,3);
				if(1==temp){
				btnF1C3.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF1C3.setContentAreaFilled(false);
		btnF1C3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF1C3.setBorderPainted(false);
		btnF1C3.setBorder(null);
		btnF1C3.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF1C3);

		btnF1C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(1,4);
				if(1==temp){
				btnF1C4.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF1C4.setContentAreaFilled(false);
		btnF1C4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF1C4.setBorderPainted(false);
		btnF1C4.setBorder(null);
		btnF1C4.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF1C4);

		btnF1C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(1,5);
				if(1==temp){
				btnF1C5.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF1C5.setContentAreaFilled(false);
		btnF1C5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF1C5.setBorderPainted(false);
		btnF1C5.setBorder(null);
		btnF1C5.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF1C5);
		
		btnF1C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(1,6);
				if(1==temp){
				btnF1C6.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF1C6.setContentAreaFilled(false);
		btnF1C6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF1C6.setBorderPainted(false);
		btnF1C6.setBorder(null);
		btnF1C6.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF1C6);

		btnF2C0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(2,0);
				if(1==temp){
				btnF2C0.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF2C0.setContentAreaFilled(false);
		btnF2C0.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF2C0.setBorderPainted(false);
		btnF2C0.setBorder(null);
		btnF2C0.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF2C0);

		btnF2C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(2,1);
				if(1==temp){
				btnF2C1.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF2C1.setContentAreaFilled(false);
		btnF2C1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF2C1.setBorderPainted(false);
		btnF2C1.setBorder(null);
		btnF2C1.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF2C1);

		btnF2C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(2,2);
				if(1==temp){
				btnF2C2.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF2C2.setContentAreaFilled(false);
		btnF2C2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF2C2.setBorderPainted(false);
		btnF2C2.setBorder(null);
		btnF2C2.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF2C2);

		btnF2C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(2,3);
				if(1==temp){
				btnF2C3.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF2C3.setContentAreaFilled(false);
		btnF2C3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF2C3.setBorderPainted(false);
		btnF2C3.setBorder(null);
		btnF2C3.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF2C3);

		btnF2C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(2,4);
				if(1==temp){
				btnF2C4.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF2C4.setContentAreaFilled(false);
		btnF2C4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF2C4.setBorderPainted(false);
		btnF2C4.setBorder(null);
		btnF2C4.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF2C4);

		btnF2C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(2,5);
				if(1==temp){
				btnF2C5.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF2C5.setContentAreaFilled(false);
		btnF2C5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF2C5.setBorderPainted(false);
		btnF2C5.setBorder(null);
		btnF2C5.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF2C5);
		
		btnF2C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(2,6);
				if(1==temp){
				btnF2C6.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF2C6.setContentAreaFilled(false);
		btnF2C6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF2C6.setBorderPainted(false);
		btnF2C6.setBorder(null);
		btnF2C6.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF2C6);

		btnF3C0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(3,0);
				if(1==temp){
				btnF3C0.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		;		
		btnF3C0.setContentAreaFilled(false);
		btnF3C0.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF3C0.setBorderPainted(false);
		btnF3C0.setBorder(null);
		btnF3C0.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF3C0);

		btnF3C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(3,1);
				if(1==temp){
				btnF3C1.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF3C1.setContentAreaFilled(false);
		btnF3C1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF3C1.setBorderPainted(false);
		btnF3C1.setBorder(null);
		btnF3C1.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF3C1);

		btnF3C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(3,2);
				if(1==temp){
				btnF3C2.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF3C2.setContentAreaFilled(false);
		btnF3C2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF3C2.setBorderPainted(false);
		btnF3C2.setBorder(null);
		btnF3C2.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF3C2);

		btnF3C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(3,3);
				if(1==temp){
				btnF3C3.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF3C3.setContentAreaFilled(false);
		btnF3C3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF3C3.setBorderPainted(false);
		btnF3C3.setBorder(null);
		btnF3C3.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF3C3);

		btnF3C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(3,4);
				if(1==temp){
				btnF3C4.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF3C4.setContentAreaFilled(false);
		btnF3C4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF3C4.setBorderPainted(false);
		btnF3C4.setBorder(null);
		btnF3C4.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF3C4);

		btnF3C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(3,5);
				if(1==temp){
				btnF3C5.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF3C5.setContentAreaFilled(false);
		btnF3C5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF3C5.setBorderPainted(false);
		btnF3C5.setBorder(null);
		btnF3C5.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF3C5);
		
				btnF3C6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int temp=dibujar(3,6);
						if(1==temp){
						btnF3C6.setIcon(new ImageIcon(Play.class.getResource(btP1)));
						}
						
					}
				});
				btnF3C6.setContentAreaFilled(false);
				btnF3C6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
				btnF3C6.setBorderPainted(false);
				btnF3C6.setBorder(null);
				btnF3C6.setBackground(new Color(255, 255, 153));
				contentPane.add(btnF3C6);
		
		btnF4C0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(4,0);
				if(1==temp){
				btnF4C0.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});		
		btnF4C0.setContentAreaFilled(false);
		btnF4C0.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF4C0.setBorderPainted(false);
		btnF4C0.setBorder(null);
		btnF4C0.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF4C0);

		btnF4C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(4,1);
				if(1==temp){
				btnF4C1.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF4C1.setContentAreaFilled(false);
		btnF4C1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF4C1.setBorderPainted(false);
		btnF4C1.setBorder(null);
		btnF4C1.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF4C1);

		btnF4C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(4,2);
				if(1==temp){
				btnF4C2.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF4C2.setContentAreaFilled(false);
		btnF4C2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF4C2.setBorderPainted(false);
		btnF4C2.setBorder(null);
		btnF4C2.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF4C2);

		btnF4C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(4,3);
				if(1==temp){
				btnF4C3.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF4C3.setContentAreaFilled(false);
		btnF4C3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF4C3.setBorderPainted(false);
		btnF4C3.setBorder(null);
		btnF4C3.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF4C3);

		btnF4C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(4,4);
				if(1==temp){
				btnF4C4.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF4C4.setContentAreaFilled(false);
		btnF4C4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF4C4.setBorderPainted(false);
		btnF4C4.setBorder(null);
		btnF4C4.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF4C4);

		btnF4C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(4,5);
				if(1==temp){
				btnF4C5.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF4C5.setContentAreaFilled(false);
		btnF4C5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF4C5.setBorderPainted(false);
		btnF4C5.setBorder(null);
		btnF4C5.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF4C5);

		btnF4C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(4,6);
				if(1==temp){
				btnF4C6.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF4C6.setContentAreaFilled(false);
		btnF4C6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF4C6.setBorderPainted(false);
		btnF4C6.setBorder(null);
		btnF4C6.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF4C6);

		btnF5C0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(5,0);
				if(1==temp){
				btnF5C0.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});	
		btnF5C0.setContentAreaFilled(false);
		btnF5C0.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF5C0.setBorderPainted(false);
		btnF5C0.setBorder(null);
		btnF5C0.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF5C0);

		btnF5C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(5,1);
				if(1==temp){
				btnF5C1.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF5C1.setContentAreaFilled(false);
		btnF5C1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF5C1.setBorderPainted(false);
		btnF5C1.setBorder(null);
		btnF5C1.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF5C1);

		btnF5C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(5,2);
				if(1==temp){
				btnF5C2.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF5C2.setContentAreaFilled(false);
		btnF5C2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF5C2.setBorderPainted(false);
		btnF5C2.setBorder(null);
		btnF5C2.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF5C2);

		btnF5C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(5,3);
				if(1==temp){
				btnF5C3.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF5C3.setContentAreaFilled(false);
		btnF5C3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF5C3.setBorderPainted(false);
		btnF5C3.setBorder(null);
		btnF5C3.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF5C3);

		btnF5C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(5,4);
				if(1==temp){
				btnF5C4.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF5C4.setContentAreaFilled(false);
		btnF5C4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF5C4.setBorderPainted(false);
		btnF5C4.setBorder(null);
		btnF5C4.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF5C4);

		btnF5C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(5,5);
				if(1==temp){
				btnF5C5.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF5C5.setContentAreaFilled(false);
		btnF5C5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF5C5.setBorderPainted(false);
		btnF5C5.setBorder(null);
		btnF5C5.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF5C5);

		btnF5C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp=dibujar(5,6);
				if(1==temp){
				btnF5C6.setIcon(new ImageIcon(Play.class.getResource(btP1)));
				}
				
			}
		});
		btnF5C6.setContentAreaFilled(false);
		btnF5C6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnF5C6.setBorderPainted(false);
		btnF5C6.setBorder(null);
		btnF5C6.setBackground(new Color(255, 255, 153));
		contentPane.add(btnF5C6);
	}
	}

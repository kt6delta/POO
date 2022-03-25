package CuatroEnLinea.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JButton;

import CuatroEnLinea.Logica.Archivos4EnLinea;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Resultados extends JFrame {
	//ATRIBUTOS
	private String NombreJ;
	private int score;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultados frame = new Resultados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Resultados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("4 En Linea");
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(600, 0, 800, 740);
		Panel contentPane = new Panel("/images/FondoResultados.jpg");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		//CREA LOS COMPONENTES Y LOS COLOCA EN EL FRAME
		JLabel Img = new JLabel("");
		Img.setBounds(177, 233, 437, 343);
		contentPane.add(Img);
		
		JLabel Score = new JLabel("");
		Score.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		Score.setBounds(415, 143, 220, 51);
		contentPane.add(Score);
		
		JLabel lblGanaste = new JLabel();
		lblGanaste.setFont(new Font("Colonna MT", Font.BOLD, 70));
		lblGanaste.setBounds(227, 61, 331, 50);
		contentPane.add(lblGanaste);
		
		JLabel Nombre = new JLabel("");
		Nombre.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		Nombre.setBounds(177, 143, 220, 51);
		contentPane.add(Nombre);
		//BOTON QUE PERMITE INICIAR OTRO JUEGO
		JButton JugarOtra = new JButton("");
		JugarOtra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaJugador V2 = new VentanaJugador();
				V2.setVisible(true);
				V2.setAlwaysOnTop(true);
				setVisible(false);
			}
		});
		JugarOtra.setIcon(new ImageIcon(Resultados.class.getResource("/images/resultadoJugar.jpg")));
		JugarOtra.setBounds(107, 642, 160, 30);
		contentPane.add(JugarOtra);
		//BOTON QUE PERMITE REGRESAR AL INICIO
		JButton VentanaInicio = new JButton("");
		VentanaInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaInicio V1 = new VentanaInicio();
				V1.setVisible(true);
				V1.setAlwaysOnTop(true);
				setVisible(false);
			}
		});
		VentanaInicio.setIcon(new ImageIcon(Resultados.class.getResource("/images/resultadoSalir.jpg")));
		VentanaInicio.setBounds(312, 642, 160, 30);
		contentPane.add(VentanaInicio);
		//BOTON QUE ME MUESTRA AL GANADOR Y SU PUNTAJE
		JButton Mostrar = new JButton("");
		Mostrar.setIcon(new ImageIcon(Resultados.class.getResource("/images/botonMostrar.jpg")));
		Mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(NombreJ.equals("Destructor")){
					Nombre.setText(NombreJ);
					lblGanaste.setText("Perdiste!!!");
					Score.setText("WINNER");
					ImageIcon imageIcon = new ImageIcon(Resultados.class.getResource("/images/pierde.gif"));
					Img.setIcon(imageIcon);
					imageIcon.setImageObserver(Img);
				}else{
					score=score*100;
					Nombre.setText(NombreJ);
					lblGanaste.setText("Ganaste!!!");
					ImageIcon imageIcon = new ImageIcon(Resultados.class.getResource("/images/Gana.gif"));
					Img.setIcon(imageIcon);
					imageIcon.setImageObserver(Img);  
					Img.setEnabled(true);
					Score.setText(String.valueOf(score));
					Archivos4EnLinea l=new Archivos4EnLinea();
					l.grabarArchivo(score, NombreJ);
				}
			}
		});
		Mostrar.setBounds(53, 157, 89, 23);
		contentPane.add(Mostrar);
		//BOTON QUE NOS ENVIA AL FRAME DE RESULTADOS
		JButton Puntuaciones = new JButton("");
		Puntuaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfasScore score=new InterfasScore();
				score.setVisible(true);
				setVisible(false);
			}
		});
		Puntuaciones.setIcon(new ImageIcon(Resultados.class.getResource("/images/Botonpuntuaciones.jpg")));
		Puntuaciones.setBounds(509, 642, 160, 30);
		contentPane.add(Puntuaciones);
	}
	//METODOS SETTERS AND GETTERS
	public String getNombreJ() {
		return NombreJ;
	}

	public void setNombreJ(String nombre) {
		NombreJ = nombre;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

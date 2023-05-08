package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Clase vista llamada Panel_Inicio:
 * este es el panel principal en el cual se pueden elegir entre el registro de los dos txt.
 * La primera condicion es que debera extender de un JPanel
 * se crean los JLabel, JButton, su constructor y sus #Getter and Setter
 * 
 * 
 * @author 
 *
 */
public class Panel_Inicio extends JPanel{
	
	private JLabel titulo;
	private JLabel textElection;
	
	private JButton botInquilino;
	private JButton botPropiedad;
	
	public Panel_Inicio() {
		setLayout(null);
		
		funcionar();
	}
	
	public void funcionar() {
		
		titulo = new JLabel("REGI-HOGAR");
		titulo.setBounds(230, 80, 430, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.LIGHT_GRAY);
		titulo.setFont(new Font("arial", Font.BOLD, 65));
		add(titulo);
		
		textElection = new JLabel("¿Que te gustaria registrar?");
		textElection.setBounds(340, 310, 200, 50);
		textElection.setOpaque(true);
		textElection.setBackground(Color.LIGHT_GRAY);
		textElection.setFont(new Font("arial", Font.BOLD, 15));
		add(textElection);
		
		botInquilino = new JButton("INQUILINO");
		botInquilino.setBounds(200, 250, 200, 50);
		botInquilino.setOpaque(true);
		botInquilino.setBackground(Color.WHITE);
		botInquilino.setFont(new Font("arial", Font.BOLD, 10));
		add(botInquilino);
		
		botPropiedad = new JButton("PROPIEDAD");
		botPropiedad.setBounds(480, 250, 200, 50);
		botPropiedad.setOpaque(true);
		botPropiedad.setBackground(Color.WHITE);
		botPropiedad.setFont(new Font("arial", Font.BOLD, 10));
		add(botPropiedad);
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getTextElection() {
		return textElection;
	}

	public void setTextElection(JLabel textElection) {
		this.textElection = textElection;
	}

	public JButton getBotInquilino() {
		return botInquilino;
	}

	public void setBotInquilino(JButton botInquilino) {
		this.botInquilino = botInquilino;
	}

	public JButton getBotPropiedad() {
		return botPropiedad;
	}

	public void setBotPropiedad(JButton botPropiedad) {
		this.botPropiedad = botPropiedad;
	}
	
}

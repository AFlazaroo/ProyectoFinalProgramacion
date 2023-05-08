package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Window;

import javax.swing.JFrame;
/**
 * Clase vista llamada Ventana:
 * es la clase principal de vista ya que dara acceso a todos los paneles.
 * se conforma de la instanciacion de los otros paaneles
 * su constructores e el cual se encuestran algunos componentes graficos
 * y un metodo IngresoDePaneles que desprendera los componentes graficos principales del programa, con sus #Getter and setter
 *
 */
public class Ventana extends JFrame {
	
	private Panel_Inicio panelHome;
	private Panel_Inquilino panelInquilino;
	private Panel_Propiedad panelPropiedad;
	
	
	public Ventana() {
		setTitle("REGI-HOGAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(950, 500);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		IngresoDePaneles();
		
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void IngresoDePaneles() {
		panelHome = new Panel_Inicio();
		panelHome.setBounds(1, 0, 950, 500); 
		getContentPane().add(panelHome);
		panelHome.setBackground(Color.LIGHT_GRAY);
		
		panelInquilino = new Panel_Inquilino();
		panelInquilino.setBounds(1, 0, 950, 500);
		getContentPane().add(panelInquilino);
		panelInquilino.setBackground(Color.LIGHT_GRAY);
		
		panelPropiedad = new Panel_Propiedad();
		panelPropiedad.setBounds(1, 0, 950, 500);
		getContentPane().add(panelPropiedad);
		panelPropiedad.setBackground(Color.LIGHT_GRAY);
	}
	
	
	public Panel_Inicio getPanelHome() {
		return panelHome;
	}
	public void setPanelHome(Panel_Inicio panelHome) {
		this.panelHome = panelHome;
	}
	public Panel_Inquilino getPanelInquilino() {
		return panelInquilino;
	}
	public void setPanelInquilino(Panel_Inquilino panelInquilino) {
		this.panelInquilino = panelInquilino;
	}
	public Panel_Propiedad getPanelPropiedad() {
		return panelPropiedad;
	}
	public void setPanelPropiedad(Panel_Propiedad panelPropiedad) {
		this.panelPropiedad = panelPropiedad;
	}
	
	
	

	
}

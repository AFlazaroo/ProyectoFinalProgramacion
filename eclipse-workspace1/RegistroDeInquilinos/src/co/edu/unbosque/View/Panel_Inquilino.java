package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *  Clase vista llamada Panel_Inquilino:
 * este es el panel secundario que desprende del boton de inqulino en el cual se hace la vista para el panel del registro de un Inquilino.
 * Se crean los JLabel corrrespondientes, los JTextField, JButton y su JTextArea (cuando se registre alguien se mostrara en el panel)
 * se crea su constructor donde estara funcionar, un setLayout (Componentes graficos) y un setVisible  (visualizar el panel) 
 * en el metodo funcionar estaran todos los componentes graficos para el panel y por ulitmo estaran los #Getter and Setter
 * @author 
 *
 */
public class Panel_Inquilino extends JPanel{
	
	private JLabel jlaInqNombre;
	private JLabel jlaInqDocumento;
	private JLabel jlaInqFechaPago;
	private JLabel jlaInqCuotaMensual;
	
	private JTextField jtNombre;
	private JTextField jtDocumento;
	private JTextField jtFechaPago;
	private JTextField jtCuotaMensual;
	
	private JButton btRegistrar;
	private JButton btRegresar;
	
	private JTextArea JtaResultados;
	public Panel_Inquilino() {
		setLayout(null);
		
		funcionar();
		
		setVisible(false);
	}
	public void funcionar() {
		
		//ETIQUETAS
		jlaInqNombre = new JLabel("Nombre: ");
		jlaInqNombre.setBounds(10, 10, 200, 100);
		jlaInqNombre.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		add(jlaInqNombre);
		
		jlaInqDocumento = new JLabel("Documento: ");
		jlaInqDocumento.setBounds(10, 50, 250, 200);
		jlaInqDocumento.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		add(jlaInqDocumento);
		
		jlaInqFechaPago = new JLabel("Fecha de pago: ");
		jlaInqFechaPago.setBounds(10, 150, 250, 200);
		jlaInqFechaPago.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		add(jlaInqFechaPago);
		
		jlaInqCuotaMensual = new JLabel("Cuota Mensual: ");
		jlaInqCuotaMensual.setBounds(10, 250, 250, 200);
		jlaInqCuotaMensual.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		add(jlaInqCuotaMensual);
		
		
		//ESPACIOS DE TEXTO
		jtNombre = new JTextField("");
		jtNombre.setBounds(225, 45, 125, 30);
		jtNombre.setFont(new Font("arial", Font.PLAIN, 15));
		add(jtNombre);
		
		
		jtDocumento = new JTextField();
		jtDocumento.setBounds(225, 135, 125, 30);
		jtDocumento.setFont(new Font("arial", Font.PLAIN, 15));
		add(jtDocumento);
		
		jtFechaPago = new JTextField();
		jtFechaPago.setBounds(225, 240, 125, 30);
		jtFechaPago.setFont(new Font("arial", Font.PLAIN, 15));
		add(jtFechaPago);
		
		jtCuotaMensual = new JTextField();
		jtCuotaMensual.setBounds(225, 340, 125, 30);
		jtCuotaMensual.setFont(new Font("arial", Font.PLAIN, 15));
		add(jtCuotaMensual);
		
		
		//BOTON Registrar
		btRegistrar = new JButton("Registrar");
		btRegistrar.setActionCommand("BtRegistrar");
			
		btRegistrar.setBounds(300, 410, 200, 30);
		btRegistrar.setFont(new Font("arial", Font.PLAIN, 30));
		add(btRegistrar);
		
		//Regresar
		btRegresar = new JButton("Regresar");
		btRegresar.setBounds(520, 410, 200, 30);
		btRegresar.setFont(new Font("arial", Font.PLAIN, 30));
		add(btRegresar);
		
		JtaResultados = new JTextArea("Usuarios registrados" );
		JtaResultados.setBounds(400, 10, 320, 360);
		btRegresar.setFont(new Font("arial", Font.PLAIN, 30));
		add(JtaResultados);
		
	}
	public JLabel getJlaInqNombre() {
		return jlaInqNombre;
	}
	public void setJlaInqNombre(JLabel jlaInqNombre) {
		this.jlaInqNombre = jlaInqNombre;
	}
	public JLabel getJlaInqDocumento() {
		return jlaInqDocumento;
	}
	public void setJlaInqDocumento(JLabel jlaInqDocumento) {
		this.jlaInqDocumento = jlaInqDocumento;
	}
	public JLabel getJlaInqFechaPago() {
		return jlaInqFechaPago;
	}
	public void setJlaInqFechaPago(JLabel jlaInqFechaPago) {
		this.jlaInqFechaPago = jlaInqFechaPago;
	}
	public JLabel getJlaInqCuotaMensual() {
		return jlaInqCuotaMensual;
	}
	public void setJlaInqCuotaMensual(JLabel jlaInqCuotaMensual) {
		this.jlaInqCuotaMensual = jlaInqCuotaMensual;
	}
	public JTextField getJtNombre() {
		return jtNombre;
	}
	public void setJtNombre(JTextField jtNombre) {
		this.jtNombre = jtNombre;
	}
	public JTextField getJtDocumento() {
		return jtDocumento;
	}
	public void setJtDocumento(JTextField jtDocumento) {
		this.jtDocumento = jtDocumento;
	}
	public JTextField getJtFechaPago() {
		return jtFechaPago;
	}
	public void setJtFechaPago(JTextField jtFechaPago) {
		this.jtFechaPago = jtFechaPago;
	}
	public JTextField getJtCuotaMensual() {
		return jtCuotaMensual;
	}
	public void setJtCuotaMensual(JTextField jtCuotaMensual) {
		this.jtCuotaMensual = jtCuotaMensual;
	}
	public JButton getBtRegistrar() {
		return btRegistrar;
	}
	public void setBtRegistrar(JButton btRegistrar) {
		this.btRegistrar = btRegistrar;
	}
	public JButton getBtRegresar() {
		return btRegresar;
	}
	public void setBtRegresar(JButton btRegresar) {
		this.btRegresar = btRegresar;
	
	}
	public JTextArea getJtaResultados() {
		return JtaResultados;
	}
	public void setJtaResultados(JTextArea jtaResultados) {
		JtaResultados = jtaResultados;
	}
	
	
}

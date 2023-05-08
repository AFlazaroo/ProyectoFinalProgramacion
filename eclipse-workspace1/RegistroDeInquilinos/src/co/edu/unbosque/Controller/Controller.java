package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import co.edu.unbosque.Model.Archivo;
import co.edu.unbosque.Model.Inquilino;
import co.edu.unbosque.View.Panel_Inicio;
import co.edu.unbosque.View.Panel_Inquilino;
import co.edu.unbosque.View.Panel_Propiedad;
import co.edu.unbosque.View.Ventana;
/**Clase en el controlador llamada controller encargada de ser el puente.
 * se llaman los paneles, la ventana principal y la clase de archivos (lectura y escritua).
 * se crea el constructor de la clase y se instancian las clases llamadas.
 * se crea un metodo funcionar en cual se agrega el metodo setLIstener para la escucha de eventos.
 * en el metodo setListeners: establece los "listeners" para un botón en particular en la interfaz de usuario: como hacer clic en un botón, y luego realiza una acción específica en respuesta a ese evento.
 * en el metodo actionPerformed se crea un switch para cada accion de los botones que proviene de setlistener
 * @author 
 *
 */
public class Controller implements ActionListener{
	
	private Panel_Inquilino panelInquilino;
	private Panel_Propiedad panelPropiedad;
	private Panel_Inicio panelInicio;
	
	
	private Ventana ven;
	private Archivo arc;
	
	public Controller() {
		arc = new Archivo();
		ven = new Ventana();
		panelInquilino = new Panel_Inquilino();
		panelInicio = new Panel_Inicio();
		panelPropiedad = new Panel_Propiedad();
		
		
		funcionar();
	}
	
	public void funcionar() {
		
		setListeners();
		
	}
	
	public void setListeners() {
		ven.getPanelHome().getBotInquilino().addActionListener(this);
		ven.getPanelHome().getBotInquilino().setActionCommand("BtnInquilino");
		
		ven.getPanelHome().getBotPropiedad().addActionListener(this);
		ven.getPanelHome().getBotPropiedad().setActionCommand("BtnPropiedad");
		
		//Inquilino
		ven.getPanelInquilino().getBtRegistrar().addActionListener(this);
		ven.getPanelInquilino().getBtRegistrar().setActionCommand("btRegistrar");
		
		//propiedad
		ven.getPanelPropiedad().getBtRegistrar2().addActionListener(this);
		ven.getPanelPropiedad().getBtRegistrar2().setActionCommand("btRegistrar2");
		
	//BtRegresar: inquilino
		ven.getPanelInquilino().getBtRegresar().addActionListener(this);
		ven.getPanelInquilino().getBtRegresar().setActionCommand("btRegresar");
		//BtRegresar2: propiedad
		ven.getPanelPropiedad().getBtRegresar2().addActionListener(this);
		ven.getPanelPropiedad().getBtRegresar2().setActionCommand("btRegresar2");
		
		
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "BtnInquilino":
			//Cambiar de interfaz a la del inquilino
			ven.getPanelHome().setVisible(false);
			ven.getPanelInquilino().setVisible(true);
			//System.out.println("Funciona");
			break;
			
		case "BtnPropiedad":
			//Cambiar interfaz a la interfaz de registro de propiedad
			ven.getPanelHome().setVisible(false);
			ven.getPanelPropiedad().setVisible(true);
			break;
			
		case "btRegistrar":
			String nombre = ven.getPanelInquilino().getJtNombre().getText();
			String documento = ven.getPanelInquilino().getJtDocumento().getText();
			String fechaPago= ven.getPanelInquilino().getJtFechaPago().getText(); 
			String cuotaMensual= ven.getPanelInquilino().getJtCuotaMensual().getText();
			arc.escribirArchivoArrendatarios(nombre, documento, fechaPago, cuotaMensual);
			
			
			
			//metodo para el JTextArea:
			ven.getPanelInquilino().getJtaResultados().append("NOMBRE: "+nombre + "\n ");
			ven.getPanelInquilino().getJtaResultados().append("DOCUMENTO: "+documento + "\n");
			ven.getPanelInquilino().getJtaResultados().append("FECHA DE PAGO: "+fechaPago + "\n");
			ven.getPanelInquilino().getJtaResultados().append("CUOTA MENUAL: "+cuotaMensual + "\n");
			
			

		    panelInquilino.getJtNombre().setText("");
		    panelInquilino.getJtDocumento().setText("");
		    panelInquilino.getJtFechaPago().setText("");
		    panelInquilino.getJtCuotaMensual().setText("");
		    break;
		    
		case "btRegistrar2":
			
			
			String direccion = ven.getPanelPropiedad().getJtDireccion().getText();
			String tamaño = ven.getPanelPropiedad().getJtTamaño().getText();
			String nHabitaciones= ven.getPanelPropiedad().getJtNHabitaciones().getText(); 
			String propietario= ven.getPanelPropiedad().getJtPropietario().getText();
		    arc.escribirArchivoViviendas(direccion, tamaño, nHabitaciones, propietario);
		    
		    //JTextArea:
		    ven.getPanelPropiedad().getJtaResultados2().append("DIRECCION: "+direccion + "\n ");
			ven.getPanelPropiedad().getJtaResultados2().append("TAMAÑO: "+tamaño + "\n");
			ven.getPanelPropiedad().getJtaResultados2().append("NUMERO DE HABITACIONES: "+nHabitaciones + "\n");
			ven.getPanelPropiedad().getJtaResultados2().append("PROPIETARIO: "+propietario + "\n");
			
		   
			
		
		    panelPropiedad.getJtDireccion().setText("");
		    panelPropiedad.getJtTamaño().setText("");
		    panelPropiedad.getJtNHabitaciones().setText("");
		    panelPropiedad.getJtPropietario().setText("");
		    
		    
		    break;
		    
		case "btRegresar":
			ven.getPanelInquilino().setVisible(false);
			ven.getPanelHome().setVisible(true);
			break;
			
		case "btRegresar2":
			ven.getPanelPropiedad().setVisible(false);
			ven.getPanelHome().setVisible(true);
			break;
		}
		
		
			
		}
		
	}
	
	
	



package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Clase vista llamada Panel_Propiedad:
 * este es el panel secundario que desprende del boton de propiedad en el cual se hace la vista para el panel del registro de una vivienda.
 * Se crean los JLabel corrrespondientes, los JTextField, JButton y su JTextArea (cuando se registre alguien se mostrara en el panel)
 * se crea su constructor donde estara funcionar, un setLayout (Componentes graficos) y un setVisible  (visualizar el panel) 
 * en el metodo funcionar estaran todos los componentes graficos para el panel y por ulitmo estaran los #Getter and Setter
 * a comparacion del panel de inquilino en este sus botones iran con un "2" para diferenciarlos.
 * @author Sistemas
 *
 */
public class Panel_Propiedad extends JPanel{
	                                              
    	private JLabel jlaInqDireccion;                                          
    	private JLabel jlaInqTamaño;                                          
    	private JLabel jlaInqNHabitaciones;                                       
    	private JLabel jlaInqPropietario;
    	
    	private JTextField jtDireccion;                                             
    	private JTextField jtTamaño;                                          
    	private JTextField jtNHabitaciones;                                          
    	private JTextField jtPropietario;                                       
    	                                                                         
    	private JButton btRegistrar2;  
    	private JButton btRegresar2;
    	
    	private JTextArea JtaResultados2;
    	                                                                         
    	public Panel_Propiedad() {                                               
    		setLayout(null);                                                        
    		                                                                        
    		funcionar(); 
    		
    		setVisible(false);
    	}                                                                        
    	public void funcionar() {                                                
    		                                                                        
    		//ETIQUETAS                                                             
    		jlaInqDireccion = new JLabel("Direccion: ");                                  
    		jlaInqDireccion.setBounds(10, 10, 200, 100);                               
      		jlaInqDireccion.setFont(new Font("Times New Roman", Font.PLAIN, 30));      
    		add(jlaInqDireccion);                                                      
    		                                                                        
    		jlaInqTamaño = new JLabel("Tamaño: ");                            
    		jlaInqTamaño.setBounds(10, 50, 250, 200);                            
            jlaInqTamaño.setFont(new Font("Times New Roman", Font.PLAIN, 30));   
    		add(jlaInqTamaño);                                                   
    		                                                                        
    		jlaInqNHabitaciones = new JLabel("Numero de Habitaciones: ");                        
    		jlaInqNHabitaciones.setBounds(10, 150, 250, 200);                                  
    		jlaInqNHabitaciones.setFont(new Font("Times New Roman", Font.PLAIN, 21));  
    		add(jlaInqNHabitaciones);                                                   
    		                                                                        
    		jlaInqPropietario = new JLabel("Propietario: ");                     
    		jlaInqPropietario.setBounds(10, 250, 250, 200);                        
    		jlaInqPropietario.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    		add(jlaInqPropietario);                                                
    		                                                                        
    		                                                                        
    		//ESPACIOS DE TEXTO                                                     
    		jtDireccion = new JTextField("");                                          
    		jtDireccion.setBounds(225, 45, 125, 30);
    		jtDireccion.setFont(new Font("arial", Font.PLAIN, 15)); 
    		add(jtDireccion);
    		                              
    		                                                          
    		                                                                        
    		jtTamaño = new JTextField();                                         
    		jtTamaño.setBounds(225, 135, 125, 30);                                             
    		jtTamaño.setFont(new Font("arial", Font.PLAIN, 15));                  
    		add(jtTamaño);                                                       
    		                                                                        
    		jtNHabitaciones = new JTextField();                                         
    		jtNHabitaciones.setBounds(225, 240, 125, 30);                                                      
    		jtNHabitaciones.setFont(new Font("arial", Font.PLAIN, 15));                 
    		add(jtNHabitaciones);                                                       
    		                                                                        
    		jtPropietario = new JTextField();                                      
    		jtPropietario.setBounds(225, 340, 125, 30);                            
    		jtPropietario.setFont(new Font("arial", Font.PLAIN, 15));               
    		add(jtPropietario);                                                    
    		                                                                        
    		                                                                        
    		//BOTON                                                                 
    		btRegistrar2 = new JButton("Registrar");                                 
    		btRegistrar2.setBounds(300, 410, 200, 30);                                                            
    		btRegistrar2.setFont(new Font("arial", Font.BOLD, 15));                  
    		add(btRegistrar2);     
    		
    		//Regresar
    		btRegresar2 = new JButton("Regresar");
    		btRegresar2.setBounds(520, 410, 200, 30);
    		btRegresar2.setFont(new Font("arial", Font.PLAIN, 30));
    		add(btRegresar2);
    		
    		//JTextArea
    		JtaResultados2 = new JTextArea("Usuarios registrados" );
    		JtaResultados2.setBounds(400, 10, 320, 360);
    		btRegresar2.setFont(new Font("arial", Font.PLAIN, 30));
    		add(JtaResultados2);
    	}
		public JLabel getJlaInqDireccion() {
			return jlaInqDireccion;
		}
		public void setJlaInqDireccion(JLabel jlaInqDireccion) {
			this.jlaInqDireccion = jlaInqDireccion;
		}
		public JLabel getJlaInqTamaño() {
			return jlaInqTamaño;
		}
		public void setJlaInqTamaño(JLabel jlaInqTamaño) {
			this.jlaInqTamaño = jlaInqTamaño;
		}
		public JLabel getJlaInqNHabitaciones() {
			return jlaInqNHabitaciones;
		}
		public void setJlaInqNHabitaciones(JLabel jlaInqNHabitaciones) {
			this.jlaInqNHabitaciones = jlaInqNHabitaciones;
		}
		public JLabel getJlaInqPropietario() {
			return jlaInqPropietario;
		}
		public void setJlaInqPropietario(JLabel jlaInqPropietario) {
			this.jlaInqPropietario = jlaInqPropietario;
		}
		public JTextField getJtDireccion() {
			return jtDireccion;
		}
		public void setJtDireccion(JTextField jtDireccion) {
			this.jtDireccion = jtDireccion;
		}
		public JTextField getJtTamaño() {
			return jtTamaño;
		}
		public void setJtTamaño(JTextField jtTamaño) {
			this.jtTamaño = jtTamaño;
		}
		public JTextField getJtNHabitaciones() {
			return jtNHabitaciones;
		}
		public void setJtNHabitaciones(JTextField jtNHabitaciones) {
			this.jtNHabitaciones = jtNHabitaciones;
		}
		public JTextField getJtPropietario() {
			return jtPropietario;
		}
		public void setJtPropietario(JTextField jtPropietario) {
			this.jtPropietario = jtPropietario;
		}
		
		public JButton getBtRegresar2() {
			return btRegresar2;
		}
		public void setBtRegresar2(JButton btRegresar2) {
			this.btRegresar2 = btRegresar2;
		}
		public JButton getBtRegistrar2() {
			return btRegistrar2;
		}
		public void setBtRegistrar2(JButton btRegistrar2) {
			this.btRegistrar2 = btRegistrar2;
		}
		public JTextArea getJtaResultados2() {
			return JtaResultados2;
		}
		public void setJtaResultados2(JTextArea jtaResultados2) {
			JtaResultados2 = jtaResultados2;
		}    
		
    	    
		
		
    
    }    
                                                                              
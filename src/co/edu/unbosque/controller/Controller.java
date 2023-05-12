package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Crud;
import co.edu.unbosque.model.Estudiantes;
import co.edu.unbosque.view.PanelRegistrarse;
import co.edu.unbosque.view.VentanaMain;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal ven;
	private PanelRegistrarse reg;
	private VentanaMain main;
	
	
	private Crud crud;
	private Estudiantes estudiante;
	
	
	public Controller() {
		ven = new VentanaPrincipal();
		reg = new PanelRegistrarse();
		main = new VentanaMain();
		crud = new Crud();
		estudiante = new Estudiantes(null, null, null, null, null, null, null);
		
		
		initialize();
	}
	public void initialize() {
		
		setListeners();
		
	}

	public void setListeners() {
	main.getVen().getBtnRegistrarse().addActionListener(this);
	main.getVen().getBtnRegistrarse().setActionCommand("BtnRegistrarse");
	
	main.getVen().getBtnIniciarSesion().addActionListener(this);
	main.getVen().getBtnIniciarSesion().setActionCommand("BtnIniciarSesion");
	
	main.getReg().getBtnRegistrarsePanel().addActionListener(this);
	main.getReg().getBtnRegistrarsePanel().setActionCommand("BtnRegistrarsePanel");
	
	main.getReg().getBtnAtrasPanel().addActionListener(this);
	main.getReg().getBtnAtrasPanel().setActionCommand("BtnAtrasPanel");
	
	
	
	
	
	
	
		
		
	
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "BtnRegistrarse":
			
			main.getVen().setVisible(false);
			main.getReg().setVisible(true);
			
			break;
			
		case "BtnPropiedad":
			
			main.getVen().setVisible(false);
			//ven.get().setVisible(true);
			break;
			
		case "BtnRegistrarsePanel":
			 // Obtener los valores de los campos de texto
            String usuario = main.getReg().getUsuario().getText();
            String documento = main.getReg().getDocumento().getText();
            String correo = main.getReg().getCorreo().getText();
            String genero = (String) main.getReg().getGenero().getSelectedItem();
            String programa = (String) main.getReg().getPrograma().getSelectedItem();
            String jornada = (String) main.getReg().getJornada().getSelectedItem();
            String lugarNacimiento = (String) main.getReg().getLugarNacimiento().getSelectedItem();
           
            
            
            
            // Crear un objeto Estudiantes con los valores obtenidos
            Estudiantes estudiante = new Estudiantes(usuario, documento, correo, genero, programa, jornada, lugarNacimiento);

            
            // Registrar el estudiante utilizando el método registrarEstudiante de Crud
            crud.registrarEstudiante(estudiante);
            
            // Ocultar el panel de registro
            main.getReg().setVisible(false);
			
			break;
			
		case "BtnAtrasPanel":
			main.getReg().setVisible(false);
			main.getVen().setVisible(true);
			break;
		
		
	}
	}
}

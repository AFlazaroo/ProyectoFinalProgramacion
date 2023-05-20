package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CrudBinario;
import co.edu.unbosque.model.Estudiantes;
import co.edu.unbosque.model.EstudiantesDTO1;
import co.edu.unbosque.model.MandarCorreo;
import co.edu.unbosque.model.Archivos.ArchivoBinario;
import co.edu.unbosque.view.PanelRegistrarse;
import co.edu.unbosque.view.VentanaMain;
import co.edu.unbosque.view.VentanaPrincipal;
/*
public class ControllerBinario implements ActionListener {

	private VentanaPrincipal ven;
	private PanelRegistrarse reg;
	private VentanaMain main;
	private MandarCorreo mandar;
	
	
	private CrudBinario crud;
	private Estudiantes estudiante;
	private ArchivoBinario archivo;
	private EstudiantesDTO1 dto;
	
	public ControllerBinario() {
		ven = new VentanaPrincipal();
		reg = new PanelRegistrarse();
		main = new VentanaMain();
		crud = new CrudBinario(archivo);
		estudiante = new Estudiantes(null, null, null, null, null, null, null);
		mandar = new MandarCorreo();
		dto = new EstudiantesDTO1();
		
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
			
			
			
			String codigo = Integer.toString(mandar.codigoAleatoreo());
			String correo = main.getReg().getCorreo().getText();
			
			mandar.crearCorreo(codigo, correo);
			mandar.enviarCorreo();
			String str = JOptionPane.showInputDialog(null, "Inresa tu codigo mandado al correo.");
			
			if(str.equals(codigo)) {
			String usuario = main.getReg().getUsuario().getText();
			String documento = main.getReg().getDocumento().getText();
			String correoAlternativo =main.getReg().getCorreo().getText();
			String genero = (String) main.getReg().getGenero().getSelectedItem();
			String programaAcademico = (String) main.getReg().getPrograma().getSelectedItem();
			String jornadaAcademica = (String) main.getReg().getJornada().getSelectedItem();
			String lugarNacimiento = (String) main.getReg().getLugarNacimiento().getSelectedItem();
		    

		    if (dto.getCrud().agregarEstudiante(usuario, documento, correoAlternativo, genero, programaAcademico, jornadaAcademica, lugarNacimiento, dto.getEstudiantes(), dto.getFile())) {
		    	JOptionPane.showMessageDialog(null, "Se agregó el estudiante");
		    } else {
		    	JOptionPane.showMessageDialog(null, "NO fue posible agregar el estudiante");
		    }
		    JOptionPane.showMessageDialog(null, "Usuario creado :)");
			}else {
				JOptionPane.showMessageDialog(null, "Codigo incorrecto :(");
			}
			
		    break;
			
		case "BtnAtrasPanel":
			main.getReg().setVisible(false);
			break;
		
		
	}
	}
}
*/
	

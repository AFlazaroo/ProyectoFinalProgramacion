package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


import co.edu.unbosque.model.CrudBinario;
import co.edu.unbosque.model.Estudiantes;

import co.edu.unbosque.model.EstudiantesDTO1;
import co.edu.unbosque.model.MandarCorreo;
import co.edu.unbosque.model.Archivos.Archivo;
import co.edu.unbosque.model.Archivos.ArchivoBinario;
import co.edu.unbosque.view.EstadisticasPanel;
import co.edu.unbosque.view.PanelRegistrarse;
import co.edu.unbosque.view.VentanaMain;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal ven;
	private PanelRegistrarse reg;
	private EstadisticasPanel estadisticas;
	private VentanaMain main;
	private MandarCorreo mandar;
	
	
	private CrudBinario crud1;
	private Estudiantes estudiante;
	private Archivo archivo;
	private ArchivoBinario archivo1;
	
	private EstudiantesDTO1 dto1;
	 private ArrayList<Estudiantes> estudiantes;
	
	public Controller() {
		
		
		
		ven = new VentanaPrincipal();
	    reg = new PanelRegistrarse();
	    estadisticas = new EstadisticasPanel();
	    main = new VentanaMain();
	    archivo1 = new ArchivoBinario(); // Inicializa archivo1 antes de crud1
	    estudiantes = archivo1.leerArchivo(); // Lee los estudiantes del archivo
	    crud1 = new CrudBinario(archivo1, estudiantes); // Ahora puedes pasar el ArrayList estudiantes al constructor de CrudBinario
	    estudiante = new Estudiantes(null, null, null, null, null, null, null);
	    mandar = new MandarCorreo();
	    dto1 = new EstudiantesDTO1();
		
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
	
	main.getEstadisticas().getOpciones().addActionListener(this);
	main.getEstadisticas().getOpciones().setActionCommand("opciones");
	
	estadisticas.getOpciones().addActionListener(this);
    estadisticas.getOpciones().setActionCommand("opciones");
    
    main.getEstadisticas().getbVerEsta().addActionListener(this);
    main.getEstadisticas().getbVerEsta().setActionCommand("bVerEsta");
	
	
	
	
	
	
	
	
		
		
	
	
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
			
			String codigo1 = Integer.toString(mandar.codigoAleatoreo());
			String correo1 = main.getReg().getCorreo().getText();
			
			mandar.crearCorreo(codigo1, correo1);
			mandar.enviarCorreo();
			String str1 = JOptionPane.showInputDialog(null, "Inresa tu codigo mandado al correo.");
			
			if(str1.equals(codigo1)) {
			String usuario = main.getReg().getUsuario().getText();
			String documento = main.getReg().getDocumento().getText();
			String correoAlternativo =main.getReg().getCorreo().getText();
			String genero = (String) main.getReg().getGenero().getSelectedItem();
			String programaAcademico = (String) main.getReg().getPrograma().getSelectedItem();
			String jornadaAcademica = (String) main.getReg().getJornada().getSelectedItem();
			String lugarNacimiento = (String) main.getReg().getLugarNacimiento().getSelectedItem();
		    

		    if (dto1.getCrud().agregarEstudiante(usuario, documento, correoAlternativo, genero, programaAcademico, jornadaAcademica, lugarNacimiento, dto1.getEstudiantes(), dto1.getFile())) {
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
			main.getVen().setVisible(true);
			break;
			
			
		case "BtnIniciarSesion":
			String usuario1 = main.getVen().getbtnUsuario().getText();
		    @SuppressWarnings("deprecation") String contraseña = main.getVen().getPasswordField().getText();

		    String usuarioPredeterminado = "admi";
		    String contraseñaPredeterminada = "123";

		    if (usuario1.equals(usuarioPredeterminado) && contraseña.equals(contraseñaPredeterminada)) {
		    	JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. ¡Bienvenido!");
		    	main.getVen().setVisible(false);
		    	main.getEstadisticas().setVisible(true);

		    } else {
		    	JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
		    }

			
			break;
		
		case "bVerEsta":
		    String selectedOption = (String) main.getEstadisticas().getOpciones().getSelectedItem();

		    // Realiza acciones basadas en la opción seleccionada
		    if (selectedOption.equals("Informacion completa facultad de ingenieria")) {
		        // Acción para la opción 1
		    	
		    } else if (selectedOption.equals("Generara informes con estadisticas Pdf")) {
		        // Acción para la opción 2
		    	
		    } else if (selectedOption.equals("Inactivar a estudiante registrado")) {
		        // Acción para la opción 3
		    	
		    } else if (selectedOption.equals("Dar de baja a estudiante del sistemas")) {
		    	   String usuario11 = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario del estudiante a dar de baja:");

		    	    if (usuario11 != null) { // Verificar si se ingresó un nombre de usuario válido
		    	        boolean eliminado = crud1.eliminarEstudiante(usuario11, estudiantes);

		    	        if (eliminado) {
		    	            // Realizar acciones adicionales si el estudiante fue eliminado exitosamente
		    	            JOptionPane.showMessageDialog(null, "El estudiante ha sido eliminado correctamente.");
		    	        } else {
		    	            // Realizar acciones adicionales si no se encontró al estudiante o no se pudo eliminar
		    	            JOptionPane.showMessageDialog(null, "No se pudo eliminar al estudiante. Verifique el nombre de usuario.");
		    	        }
		    	    } else {
		    	        // Realizar acciones adicionales si se canceló el ingreso del nombre de usuario
		    	        JOptionPane.showMessageDialog(null, "Se canceló la operación.");
		    	    }
		    } else if (selectedOption.equals("Mostrar informacion ascendentemente o desendentemente")) {
		        // Acción para la opción 5
		    }
		    
		    break;

	}
	}}
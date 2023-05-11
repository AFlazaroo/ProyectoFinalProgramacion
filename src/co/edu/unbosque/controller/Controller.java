package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.PanelRegistrarse;
import co.edu.unbosque.view.VentanaMain;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal ven;
	private PanelRegistrarse reg;
	private VentanaMain main;
	
	
	
	public Controller() {
		ven = new VentanaPrincipal();
		reg = new PanelRegistrarse();
		main = new VentanaMain();
		
		
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
			
			break;
			
		case "BtnAtrasPanel":
			main.getReg().setVisible(false);
			main.getVen().setVisible(true);
			break;
		
	}
	}
}

package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.PanelRegistrarse;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal ven;
	private PanelRegistrarse reg;
	
	
	
	public Controller() {
		ven = new VentanaPrincipal();
		reg = new PanelRegistrarse();
		
		
		initialize();
	}
public void initialize() {
		
		setListeners();
		
	}

public void setListeners() {
	
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}

package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaMain extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VentanaPrincipal ven;
	private PanelRegistrarse reg;
	
	
	
	
 public VentanaMain() {
	 IngresoDePaneles();
	 
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(460, 400);
		
	 setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
}


public void IngresoDePaneles() {
	ven = new VentanaPrincipal();
	ven.setBounds(1, 0, 950, 500); 
	getContentPane().add(ven);
	ven.setBackground(Color.LIGHT_GRAY);
	
	reg = new PanelRegistrarse();
	reg.setBounds(1, 0, 950, 500); 
	getContentPane().add(reg);
	reg.setBackground(Color.LIGHT_GRAY);
	
	
	
}


public VentanaPrincipal getVen() {
	return ven;
}


public void setVen(VentanaPrincipal ven) {
	this.ven = ven;
}


public PanelRegistrarse getReg() {
	return reg;
}


public void setReg(PanelRegistrarse reg) {
	this.reg = reg;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}


	

}

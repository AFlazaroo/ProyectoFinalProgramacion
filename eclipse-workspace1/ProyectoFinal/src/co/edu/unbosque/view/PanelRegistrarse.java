package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistrarse extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField usuario;
	private JTextField documento;
	private JTextField correo;
	private JComboBox  genero;
	private JComboBox  programa;
	private JComboBox  jornada;
	private JComboBox  lugarNacimiento;
	
	private JLabel registrate;
	private JLabel usuario1;
	private JLabel documento1;
	private JLabel correo1;
	private JLabel genero1;
	private JLabel programa1;
	private JLabel jornada1;
	private JLabel lugar1;
	
	
	
	
	
	
	private JButton btnRegistrarsePanel;
	private JButton btnAtrasPanel;
	

	public PanelRegistrarse() {
		setLayout(null);
		
		initialize();
		
		setVisible(false);
	}
	
	private void initialize() {
		
		setFont(new Font("Wide Latin", Font.PLAIN, 11));
		setBounds(100, 100, 450, 344);
		
		
		
		registrate = new JLabel("Registrate");
		registrate.setFont(new Font("Century", Font.BOLD, 40));
		registrate.setBounds(116, 11, 217, 49);
		add(registrate);
		
		usuario1 = new JLabel("Usuario:");
		usuario1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		usuario1.setBounds(10, 76, 97, 15);
		add(usuario1);
		
		documento1 = new JLabel("Documento de identidad:");
		documento1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		documento1.setBounds(10, 102, 185, 14);
		add(documento1);
		
		correo1 = new JLabel("Correo alternativo:");
		correo1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		correo1.setBounds(10, 127, 185, 14);
		add(correo1);
		
		genero1 = new JLabel("Genero:");
		genero1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		genero1.setBounds(10, 155, 136, 14);
		add(genero1);
		
		programa1 = new JLabel("Programa academico:");
		programa1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		programa1.setBounds(10, 185, 185, 14);
		add(programa1);
		
		jornada1 = new JLabel("Jornada academica:");
		jornada1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		jornada1.setBounds(10, 210, 164, 14);
		add(jornada1);
		
		lugar1 = new JLabel("Lugar de nacimiento:");
		lugar1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lugar1.setBounds(10, 235, 152, 14);
		add(lugar1);
		
		usuario = new JTextField();
		usuario.setBounds(275, 78, 117, 14);
		add(usuario);
		usuario.setColumns(10);
		
		documento = new JTextField();
		documento.setColumns(10);
		documento.setBounds(275, 103, 117, 14);
		add(documento);
		
		correo = new JTextField();
		correo.setColumns(10);
		correo.setBounds(275, 128, 117, 14);
		add(correo);
		
		genero = new JComboBox();
		genero.setBounds(275, 150, 117, 18);
		genero.addItem("Masculino");
		genero.addItem("Femenino");
		
		add(genero);
		
		programa = new JComboBox();
		programa.setBounds(275, 179, 117, 18);
		programa.addItem("Sistemas");
		programa.addItem("Ambiental");
		programa.addItem("Bioingenieria");
		programa.addItem("Electronica");
		programa.addItem("Industrial");
		add(programa);
		
		jornada = new JComboBox();
		jornada.setBounds(275, 209, 117, 18);
		jornada.addItem("Diurno");
		jornada.addItem("Nocturno");
		add(jornada);
		
		lugarNacimiento = new JComboBox();
		lugarNacimiento.setBounds(275, 238, 117, 18);
		lugarNacimiento.addItem("Nacional");
		lugarNacimiento.addItem("Internacional");
		add(lugarNacimiento);
		
		btnRegistrarsePanel = new JButton("Registrarse");
		btnRegistrarsePanel.setBounds(145, 276, 164, 23);
		add(btnRegistrarsePanel);
		
		btnAtrasPanel = new JButton("Atras");
		btnAtrasPanel.setBackground(new Color(0, 255, 255));
		btnAtrasPanel.setForeground(new Color(0, 0, 0));
		btnAtrasPanel.setBounds(345, 0, 89, 23);
		add(btnAtrasPanel);
		
		JLabel registrate_8 = new JLabel("");
		registrate_8.setIcon(new ImageIcon(PanelRegistrarse.class.getResource("/co/edu/unbosque/view/istockphoto-1131561170-612x612.jpg")));
		registrate_8.setBounds(0, 0, 460, 400);
		add(registrate_8);
	}

	public JTextField getUsuario() {
		return usuario;
	}

	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}

	public JTextField getDocumento() {
		return documento;
	}

	public void setDocumento(JTextField documento) {
		this.documento = documento;
	}

	public JTextField getCorreo() {
		return correo;
	}

	public void setCorreo(JTextField correo) {
		this.correo = correo;
	}

	public JComboBox getGenero() {
		return genero;
	}

	public void setGenero(JComboBox genero) {
		this.genero = genero;
	}

	public JComboBox getPrograma() {
		return programa;
	}

	public void setPrograma(JComboBox programa) {
		this.programa = programa;
	}

	public JComboBox getJornada() {
		return jornada;
	}

	public void setJornada(JComboBox jornada) {
		this.jornada = jornada;
	}

	public JComboBox getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(JComboBox lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public JButton getBtnRegistrarsePanel() {
		return btnRegistrarsePanel;
	}

	public void setBtnRegistrarsePanel(JButton btnRegistrarsePanel) {
		this.btnRegistrarsePanel = btnRegistrarsePanel;
	}

	public JButton getBtnAtrasPanel() {
		return btnAtrasPanel;
	}

	public void setBtnAtrasPanel(JButton btnAtrasPanel) {
		this.btnAtrasPanel = btnAtrasPanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
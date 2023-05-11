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
		
		
		
		JLabel lblNewLabel = new JLabel("Registrate");
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 40));
		lblNewLabel.setBounds(116, 11, 217, 49);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 76, 97, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Documento de identidad:");
		lblNewLabel_2.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 102, 185, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo alternativo:");
		lblNewLabel_3.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 127, 185, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Genero:");
		lblNewLabel_4.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 155, 136, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Programa academico:");
		lblNewLabel_5.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 185, 185, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Jornada academica:");
		lblNewLabel_6.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 210, 164, 14);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Lugar de nacimiento:");
		lblNewLabel_7.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 235, 152, 14);
		add(lblNewLabel_7);
		
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
		add(genero);
		
		programa = new JComboBox();
		programa.setBounds(275, 179, 117, 18);
		add(programa);
		
		jornada = new JComboBox();
		jornada.setBounds(275, 209, 117, 18);
		add(jornada);
		
		lugarNacimiento = new JComboBox();
		lugarNacimiento.setBounds(275, 238, 117, 18);
		add(lugarNacimiento);
		
		btnRegistrarsePanel = new JButton("Registrarse");
		btnRegistrarsePanel.setBounds(145, 276, 164, 23);
		add(btnRegistrarsePanel);
		
		btnAtrasPanel = new JButton("Atras");
		btnAtrasPanel.setBackground(new Color(0, 255, 255));
		btnAtrasPanel.setForeground(new Color(0, 0, 0));
		btnAtrasPanel.setBounds(345, 0, 89, 23);
		add(btnAtrasPanel);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(PanelRegistrarse.class.getResource("/co/edu/unbosque/view/istockphoto-1131561170-612x612.jpg")));
		lblNewLabel_8.setBounds(0, 0, 460, 400);
		add(lblNewLabel_8);
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
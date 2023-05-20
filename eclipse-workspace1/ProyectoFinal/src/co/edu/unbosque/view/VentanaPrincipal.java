package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaPrincipal extends JPanel {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



		
		private JButton btnSalir;
		private JButton btnRegistrarse;
		private JButton btnIniciarSesion;
		//private JTextField textField;
		private JTextField btnUsuario;
		private JPasswordField passwordField;

		
		public VentanaPrincipal() {
			setLayout(null);
			
			
			initialize();
			
			
		}

		
		
		private void initialize() {
			
			
			
			setBounds(100, 100, 450, 393);
			
			btnSalir = new JButton("Salir");
			btnSalir.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnSalir.setBackground(new Color(210, 160, 104));
			btnSalir.setForeground(new Color(210, 204, 123));
			
			
			btnRegistrarse = new JButton("Registrarse");
			btnRegistrarse.setBackground(new Color(192, 192, 192));
			btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnRegistrarse.setBounds(21, 323, 107, 20);
			add(btnRegistrarse);
			
			btnIniciarSesion = new JButton("Iniciar Sesion");
			btnIniciarSesion.setBackground(new Color(192, 192, 192));
			btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnIniciarSesion.setBounds(307, 320, 117, 23);
			add(btnIniciarSesion);
			
			passwordField = new JPasswordField();
			passwordField.setForeground(new Color(255, 255, 255));
			passwordField.setBackground(new Color(5, 1, 54));
			passwordField.setBounds(206, 293, 177, 20);
			add(passwordField);
			
			btnUsuario = new JTextField();
			btnUsuario.setForeground(new Color(255, 255, 255));
			btnUsuario.setBackground(new Color(5, 1, 54));
			btnUsuario.setBounds(206, 266, 177, 20);
			add(btnUsuario);
			btnUsuario.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/co/edu/unbosque/view/User.png")));
			lblNewLabel_3.setBounds(101, 22, 224, 226);
			add(lblNewLabel_3);
			
			JLabel lblNewLabel_2 = new JLabel("Contraseña:");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_2.setBounds(21, 287, 138, 25);
			add(lblNewLabel_2);
			
			JLabel lblNewLabel_1 = new JLabel("Usuario:");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1.setBounds(21, 258, 107, 28);
			add(lblNewLabel_1);
			btnSalir.setBounds(345, 0, 89, 23);
			add(btnSalir);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/co/edu/unbosque/view/FondoAzul.png")));
			lblNewLabel.setBounds(0, 0, 444, 365);
			add(lblNewLabel);
			/*
			textField = new JTextField();
			textField.setBounds(138, 264, 150, 20);
			add(textField);
			textField.setColumns(10);
			*/
		}



		public JButton getbtnSalir() {
			return btnSalir;
		}



		public void setbtnSalir(JButton btnSalir) {
			this.btnSalir = btnSalir;
		}


/*
		public JTextField getTextField() {
			return textField;
		}



		public void setTextField(JTextField textField) {
			this.textField = textField;
		}
*/


		public JTextField getbtnUsuario() {
			return btnUsuario;
		}



		public void setbtnUsuario(JTextField btnUsuario) {
			this.btnUsuario = btnUsuario;
		}



		public JPasswordField getPasswordField() {
			return passwordField;
		}



		public void setPasswordField(JPasswordField passwordField) {
			this.passwordField = passwordField;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}



		public JButton getBtnSalir() {
			return btnSalir;
		}



		public void setBtnSalir(JButton btnSalir) {
			this.btnSalir = btnSalir;
		}



		public JButton getBtnRegistrarse() {
			return btnRegistrarse;
		}



		public void setBtnRegistrarse(JButton btnRegistrarse) {
			this.btnRegistrarse = btnRegistrarse;
		}



		public JButton getBtnIniciarSesion() {
			return btnIniciarSesion;
		}



		public void setBtnIniciarSesion(JButton btnIniciarSesion) {
			this.btnIniciarSesion = btnIniciarSesion;
		}
		
		
		
	}




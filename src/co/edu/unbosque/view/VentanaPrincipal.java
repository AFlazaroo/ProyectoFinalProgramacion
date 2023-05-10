package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public class PrincipalVentana {

		
		private JButton btnNewButton;
		private JTextField textField;
		private JTextField textField_1;
		private JPasswordField passwordField;

		
		public PrincipalVentana() {
			
			initialize();
			
			
		}

		
		
		private void initialize() {
			
			new JFrame();
			
			setBounds(100, 100, 450, 393);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			
			btnNewButton = new JButton("Salir");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton.setBackground(new Color(210, 160, 104));
			btnNewButton.setForeground(new Color(210, 204, 123));
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			JButton btnNewButton_2 = new JButton("Registrarse");
			btnNewButton_2.setBackground(new Color(192, 192, 192));
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton_2.setBounds(21, 323, 107, 20);
			getContentPane().add(btnNewButton_2);
			
			JButton btnNewButton_1 = new JButton("Iniciar Sesion");
			btnNewButton_1.setBackground(new Color(192, 192, 192));
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton_1.setBounds(307, 320, 117, 23);
			getContentPane().add(btnNewButton_1);
			
			passwordField = new JPasswordField();
			passwordField.setForeground(new Color(255, 255, 255));
			passwordField.setBackground(new Color(5, 1, 54));
			passwordField.setBounds(206, 293, 177, 20);
			getContentPane().add(passwordField);
			
			textField_1 = new JTextField();
			textField_1.setForeground(new Color(255, 255, 255));
			textField_1.setBackground(new Color(5, 1, 54));
			textField_1.setBounds(206, 266, 177, 20);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(PrincipalVentana.class.getResource("/co/edu/unbosque/view/User.png")));
			lblNewLabel_3.setBounds(101, 22, 224, 226);
			getContentPane().add(lblNewLabel_3);
			
			JLabel lblNewLabel_2 = new JLabel("Contraseña:");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_2.setBounds(21, 287, 138, 25);
			getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_1 = new JLabel("Usuario:");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1.setBounds(21, 258, 107, 28);
			getContentPane().add(lblNewLabel_1);
			btnNewButton.setBounds(345, 0, 89, 23);
			getContentPane().add(btnNewButton);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(PrincipalVentana.class.getResource("/co/edu/unbosque/view/FondoAzul.png")));
			lblNewLabel.setBounds(0, 0, 444, 365);
			getContentPane().add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(138, 264, 150, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
	}


}

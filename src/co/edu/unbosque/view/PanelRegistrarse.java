package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class PanelRegistrarse extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public PanelRegistrarse() {
		initialize();
	}
	
	private void initialize() {
		new JFrame();
		setFont(new Font("Wide Latin", Font.PLAIN, 11));
		setBounds(100, 100, 450, 344);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrate");
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 40));
		lblNewLabel.setBounds(116, 11, 217, 49);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 76, 97, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Documento de identidad:");
		lblNewLabel_2.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 102, 185, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo alternativo:");
		lblNewLabel_3.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 127, 185, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Genero:");
		lblNewLabel_4.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 155, 136, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Programa academico:");
		lblNewLabel_5.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 185, 185, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Jornada academica:");
		lblNewLabel_6.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 210, 164, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Lugar de nacimiento:");
		lblNewLabel_7.setFont(new Font("Artifakt Element Black", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 235, 152, 14);
		getContentPane().add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(275, 78, 117, 14);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(275, 103, 117, 14);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(275, 128, 117, 14);
		getContentPane().add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(275, 150, 117, 18);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(275, 179, 117, 18);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(275, 209, 117, 18);
		getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(275, 238, 117, 18);
		getContentPane().add(comboBox_3);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBounds(145, 276, 164, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(345, 0, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(PanelRegistrarse.class.getResource("/co/edu/unbosque/view/istockphoto-1131561170-612x612.jpg")));
		lblNewLabel_8.setBounds(0, 0, 434, 299);
		getContentPane().add(lblNewLabel_8);
	}

}



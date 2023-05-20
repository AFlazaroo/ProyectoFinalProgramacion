package co.edu.unbosque.view;

import java.awt.Font;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.opencsv.CSVReader;

import co.edu.unbosque.model.Estudiantes;
import co.edu.unbosque.model.Archivos.Archivo;
import co.edu.unbosque.model.Archivos.ArchivoBinario;



public class EstadisticasPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel filtradoL;
	private JLabel opcionL;
	
	private JComboBox filtrado;
	private JComboBox opciones;
	private JLabel fondoLabel;
	private ImageIcon fondoIcon;
	private Archivo archivo;
	private ArchivoBinario archivoB;
	
	
	private JTextArea datos;
	
	
	
	
	public EstadisticasPanel() {
		
		setLayout(null);
		
		try {
			initialize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setVisible(false);
	}



	private void initialize() throws IOException {
	
	
		setFont(new Font("Tahoma", Font.PLAIN, 11));
		setBounds(100, 100, 450, 300);
		
		
		filtrado = new JComboBox();
		filtrado.setBounds(54, 36, 297, 22);
		filtrado.addItem("Actividad/Inactividad de estudiantes");
		filtrado.addItem("Top 3 programas académicos con más estudiantes registrados");
		filtrado.addItem("Top 3 programas académicos con más estudiantes nacionales");
		add(filtrado);
		
		filtradoL = new JLabel("Filtrado por:");
		filtradoL.setFont(new Font("Arial Black", Font.PLAIN, 14));
		filtradoL.setBounds(140, 0, 211, 25);
		add(filtradoL);
		
		opcionL = new JLabel("Opciones:");
		opcionL.setFont(new Font("Arial Black", Font.PLAIN, 14));
		opcionL.setBounds(140, 105, 97, 22);
		add(opcionL);
		
		opciones = new JComboBox();
		opciones.setBounds(54, 145, 297, 22);
		opciones.addItem("Informacion completa facultad de ingenieria");
		opciones.addItem("Generara informes con estadisticas Pdf");
		opciones.addItem("Inactivar a estudiante registrado");
		opciones.addItem("Dar de baja a estudiante del sistemas");
		opciones.addItem("Mostrar informacion ascendentemente o desendentemente");
		add(opciones);
		
		
		datos = new JTextArea();
		datos.setFont(new Font("Arial Black", Font.PLAIN, 14));
		datos.setBounds(20,250,400,100);
        add(datos);
        
        JScrollPane scrollPane = new JScrollPane(datos);
        scrollPane.setBounds(20, 250, 400, 100);
        add(scrollPane);
        
        try {
            archivo = new Archivo();
            List<Estudiantes> estudiantes = archivo.leerArchivo();
        
            for (Estudiantes estudiante : estudiantes) {
                datos.append(estudiante.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        archivoB = new ArchivoBinario();
		List<Estudiantes> estudiantes = archivoB.leerArchivo();
      
		for (Estudiantes estudiante : estudiantes) {
		    datos.append(estudiante.toString() + "\n");
		}
       
		
        fondoLabel = new JLabel("");
        fondoLabel.setIcon(new ImageIcon(EstadisticasPanel.class.getResource("/co/edu/unbosque/view/Lanita.jpg")));
        fondoLabel.setFont(new Font("Arial Black", Font.PLAIN, 10));
        datos.setFont(getFont());
        
        fondoLabel.setBounds(0, 0, 444, 365);
		add(fondoLabel);
		
		
	
	

		}



	public JLabel getFiltradoL() {
		return filtradoL;
	}



	public void setFiltradoL(JLabel filtradoL) {
		this.filtradoL = filtradoL;
	}



	public JLabel getOpcionL() {
		return opcionL;
	}



	public void setOpcionL(JLabel opcionL) {
		this.opcionL = opcionL;
	}



	public JComboBox getFiltrado() {
		return filtrado;
	}



	public void setFiltrado(JComboBox filtrado) {
		this.filtrado = filtrado;
	}



	public JComboBox getOpciones() {
		return opciones;
	}



	public void setOpciones(JComboBox opciones) {
		this.opciones = opciones;
	}



	public JLabel getFondoLabel() {
		return fondoLabel;
	}



	public void setFondoLabel(JLabel fondoLabel) {
		this.fondoLabel = fondoLabel;
	}



	public ImageIcon getFondoIcon() {
		return fondoIcon;
	}



	public void setFondoIcon(ImageIcon fondoIcon) {
		this.fondoIcon = fondoIcon;
	}



	public Archivo getArchivo() {
		return archivo;
	}



	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}



	public JTextArea getDatos() {
		return datos;
	}



	public void setDatos(JTextArea datos) {
		this.datos = datos;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	}

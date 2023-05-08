package co.edu.unbosque.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

import javax.swing.JOptionPane;
/**
 * En la clase Archivo que proviene de modelo:
 * se crean los metodos de leer y escribir el archivo txt
 * agregando a este ciertas condiciones para los JTextFile
 * 
 * @author 
 *
 */
public class Archivo {
	private int numInquilinos = 5;
	private int numPropiedad = 5;
		public Archivo () {

			leerArchivoArrendatarios();
			leerArchivoViviendas();
			
		}
	
		public void leerArchivoArrendatarios()	{
		FileReader archivo;
		BufferedReader lector;
		try {
			archivo = new FileReader("Archivos/arrendatarios.TXT");
			if(archivo.ready()) {
				lector = new BufferedReader(archivo);
				String cadena;
				while((cadena = lector.readLine()) != null) {
					System.out.println(cadena);
				}
			}
			else {
				System.out.println("!ERROR¡ Archivo no esta listo para ser leido...");
			}
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void leerArchivoViviendas() {
		FileReader archivo;
		BufferedReader lector;
		try {
			archivo = new FileReader("Archivos/viviendas.TXT");
			if(archivo.ready()) {
				lector = new BufferedReader(archivo);
				String cadena;
				while((cadena = lector.readLine()) != null) {
					System.out.println(cadena);
				}
			}
			else {
				System.out.println("!ERROR¡ Archivo no esta listo para ser leido...");
			}
			
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void escribirArchivoArrendatarios(String nombre, String documento, String fechaPago, String cuotaMensual) {
	    
		// Validar nombre
				boolean camposValidos = true;
			    if (nombre.isEmpty() || !nombre.matches("[a-zA-Z\\\\s]+")) {
			        JOptionPane.showMessageDialog(null, "El nombre no es válida");
			        camposValidos = false;
			    }

			    // Validar documento
			    if (documento.isEmpty() || !documento.matches("\\d+")) {
			        JOptionPane.showMessageDialog(null, "El documento no es válido");
			        camposValidos = false;
			    }

			    // Validar fecha de pago
			    if (fechaPago.isEmpty() || !fechaPago.matches("\\d+")) {
			        JOptionPane.showMessageDialog(null, "la fecha de pago no es válido");
			        camposValidos = false;
			    }

			    // Validar cuota mensual
			    if (cuotaMensual.isEmpty() || !cuotaMensual.matches("\\d+")) {
			        JOptionPane.showMessageDialog(null, "la cuota mensual no es válido");
			        camposValidos = false;
			    }

			    if (camposValidos) {
			        try {
			            FileWriter archivo = new FileWriter("Archivos/arrendatarios.txt",true);


	        
	        archivo.write("***************************************\n");
	        
	        archivo.write("inquilino: #" + numInquilinos + " Documento[" + documento + "]\n");

	        archivo.write("Nombre: " + nombre + "\n");
	        archivo.write("Cuota mensual: $" + cuotaMensual);
	        archivo.write("Fecha de pago: " + fechaPago + "Adios\n");
	        archivo.write("***************************************\n");
	        archivo.close();
	        JOptionPane.showMessageDialog(null, "La información ha sido guardada con éxito");
	        numInquilinos ++;
			        } catch (IOException e) {
			            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
			        }
			    } else {
			        JOptionPane.showMessageDialog(null, "No se pudo guardar la información debido a errores en los campos");
			    }
	}
	       
	public void escribirArchivoViviendas(String direccion, String tamaño, String nHabitaciones, String propietario) {
		// Validar numero de habitaciones
		boolean camposValidos = true;
	    if (nHabitaciones.isEmpty() || !nHabitaciones.matches("[a-zA-Z0-9\\s]+")) {
	        JOptionPane.showMessageDialog(null, "La dirección no es válida");
	        camposValidos = false;
	    }

	    // Validar tamaño
	    if (tamaño.isEmpty() || !tamaño.matches("\\d+")) {
	        JOptionPane.showMessageDialog(null, "El tamaño no es válido");
	        camposValidos = false;
	    }

	   
	    

	    // Validar propietario
	    if (propietario.isEmpty() || !propietario.matches("[a-zA-Z\\s]+")) {
	        JOptionPane.showMessageDialog(null, "El propietario no es válido");
	        camposValidos = false;
	    }

	    if (camposValidos) {
	        try {
	            FileWriter archivo = new FileWriter("Archivos/viviendas.txt",true);
	            
	            archivo.write("***************************************\n");
	            archivo.write("Propiedad: #" + numPropiedad + " Direccion[" + direccion + "]\n");
	            archivo.write("Tamaño: " + tamaño + "m2\n");
	            archivo.write("N de habitaciones: (" + nHabitaciones + ")\n");
	            archivo.write("Propietario: " + propietario + "\n");
	            archivo.write("***************************************\n");
	            archivo.close();
	            JOptionPane.showMessageDialog(null, "La información ha sido guardada con éxito");
	            numPropiedad++;
	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
	        }
	    } else {
	        JOptionPane.showMessageDialog(null, "No se pudo guardar la información debido a errores en los campos");
	    }
	    
	}
	}


	

	
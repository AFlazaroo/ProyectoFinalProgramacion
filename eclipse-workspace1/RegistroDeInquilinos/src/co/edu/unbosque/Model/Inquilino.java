package co.edu.unbosque.Model;
import java.util.ArrayList;
/*
 * Esta clase llamada inquilino de modelo:
 * Instancia los atributos, crea su contructor y sus #Getter and setter
 */
public class Inquilino {
	private String nombre;
	private String documento;
	private String fechaPago;
	
	private String cuotaMensual;
	ArrayList<String> numeroPropiedades = new ArrayList<String>();;
	
	public Inquilino(String nombre, String documento, String fechaPago, String cuotaMensual) {
		
		this.nombre = nombre;
		this.documento = documento;
		this.fechaPago = fechaPago;
		this.cuotaMensual = cuotaMensual;
		 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}

	public ArrayList<String> getNumeroPropiedades() {
		return numeroPropiedades;
	}

	public void setNumeroPropiedades(ArrayList<String> numeroPropiedades) {
		this.numeroPropiedades = numeroPropiedades;
	}

	public String getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(String cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	

}

package co.edu.unbosque.Model;
/**
 * Esta clase llamada Propiedad de modelo:
 * Instancia los atributos, crea su contructor y sus #Getter and setter
 * @author 
 *
 */
public class Propiedad {

	private String direccion;
	private String propietario;
	
	private String tamaño;

	private String nHabitaciones;
	
	public Propiedad(String direccion, String propietario, String tamaño, String nHabitaciones) {
	
		this.direccion = direccion = "";
		this.propietario = propietario = "";
		this.tamaño = tamaño;
		this.nHabitaciones = nHabitaciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getnHabitaciones() {
		return nHabitaciones;
	}

	public void setnHabitaciones(String nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}

		
	
	

}

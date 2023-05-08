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
	
	private String tama�o;

	private String nHabitaciones;
	
	public Propiedad(String direccion, String propietario, String tama�o, String nHabitaciones) {
	
		this.direccion = direccion = "";
		this.propietario = propietario = "";
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getnHabitaciones() {
		return nHabitaciones;
	}

	public void setnHabitaciones(String nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}

		
	
	

}

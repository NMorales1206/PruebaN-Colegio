package CDP;

public class Perros {


	private String nombre;
	private String raza;
	private String localidad;
	private String nombredueño;
	private String dia;
	private int cedula;
	private int telefono;
	
	
	   
    public Perros() {
		   
	nombre = "";
	raza = "";
	localidad = "";
    nombredueño = "";
	dia ="";
	cedula = 0;
    telefono = 0;
}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}



	public String getLocalidad() {
		return localidad;
	}



	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}



	public String getNombredueño() {
		return nombredueño;
	}



	public void setNombredueño(String nombredueño) {
		this.nombredueño = nombredueño;
	}



	public String getDia() {
		return dia;
	}



	public void setDia(String dia) {
		this.dia = dia;
	}



	public int getCedula() {
		return cedula;
	}



	public void setCedula(int cedula) {
		this.cedula = cedula;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	   
	   
	   
	
}

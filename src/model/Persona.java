package model;

public class Persona implements Comparable<Object> {
	private String nombre;
	private String apellido;
	private int prioridad;
	
	public Persona(String pNombre, String pApellido, int pPrioridad) {
		super();
		this.nombre    = pNombre;
		this.apellido  = pApellido;
		this.prioridad = pPrioridad;
	}

	public int compareTo(Object o) {
		Persona p = (Persona) o;
		
		int a = this.prioridad;
		int b = p.prioridad;
		
		if(a>b)
			return 1;
		if(a<b)
			return -1;
		return 0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", prioridad=" + prioridad + "]";
	}
}

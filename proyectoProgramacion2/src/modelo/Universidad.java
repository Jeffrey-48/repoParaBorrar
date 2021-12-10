package modelo;

import java.util.ArrayList;

public class Universidad {

	public String nombre;
	public String nit;
	public String direccion;
	public String telefono;
	public Tipo tipo;
	public ArrayList<Facultad> misFacultades;
	public ArrayList<Persona> misPersonas;

	public Universidad() {

	}

	public Universidad(String nombre, String nit, String direccion, String telefono,  Tipo tipo,
			ArrayList<Facultad> misFacultades, ArrayList<Persona> misPersonas) {
		super();
		this.nombre = nombre;
		this.nit = nit;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.misFacultades = misFacultades;
		this.misPersonas = misPersonas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Facultad> getMisFacultades() {
		return misFacultades;
	}

	public void setMisFacultades(ArrayList<Facultad> misFacultades) {
		this.misFacultades = misFacultades;
	}

	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}

	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}

	@Override
	public String toString() {
		return "Universidad [nombre=" + nombre + ", nit=" + nit + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", tipo=" + tipo + ", misFacultades=" + misFacultades + ", misPersonas=" + misPersonas + "]";
	}

}

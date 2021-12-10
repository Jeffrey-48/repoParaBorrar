package modelo;

import java.util.ArrayList;

public class Curso {

	public String nombre;
	public int creditos;
	public String codigo;
	public ArrayList<Estudiante> misEstudiantes;

	public Curso() {
		super();
	}

	/**
	 * @param nombre
	 * @param creditos
	 * @param codigo
	 * @param misSalones
	 * @param misProfesores
	 * @param misEstudiantes
	 */
	public Curso(String nombre, int creditos, String codigo, 
			ArrayList<Estudiante> misEstudiantes) {
		super();
		this.nombre = nombre;
		this.creditos = creditos;
		this.codigo = codigo;
		this.misEstudiantes = misEstudiantes;
	}
	
	public Curso(String nombre, int creditos, String codigo) {
		this.nombre = nombre;
		this.creditos = creditos;
		this.codigo = codigo;
	}

	public ArrayList<Estudiante> getMisEstudiantes() {
		return misEstudiantes;
	}

	public void setMisEstudiantes(ArrayList<Estudiante> misEstudiantes) {
		this.misEstudiantes = misEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", creditos=" + creditos + ", codigo=" + codigo + ", misEstudiantes="
				+ misEstudiantes + "]";
	}
	
}

package modelo;

import java.util.ArrayList;

public class Salon extends Edificacion {

	public String nombre;
	public String ubicacion;
	public int numero;
	public ArrayList<Curso> misCursos;
	public ArrayList<Profesor> misProfesores;
	public ArrayList<Estudiante> misEstudiantes;

	public Salon() {
		super();
	}

	/**
	 * @param nombre
	 * @param ubicacion
	 * @param numero
	 * @param misCursos
	 * @param misProfesores
	 * @param misEstudiantes
	 * @param miFacultad
	 */
	public Salon(String nombre, String ubicacion, int numero, ArrayList<Curso> misCursos,
			ArrayList<Profesor> misProfesores, ArrayList<Estudiante> misEstudiantes) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.numero = numero;
		this.misCursos = misCursos;
		this.misProfesores = misProfesores;
		this.misEstudiantes = misEstudiantes;
	}

	public ArrayList<Curso> getMisCursos() {
		return misCursos;
	}

	public void setMisCursos(ArrayList<Curso> misCursos) {
		this.misCursos = misCursos;
	}

	public ArrayList<Profesor> getMisProfesores() {
		return misProfesores;
	}

	public void setMisProfesores(ArrayList<Profesor> misProfesores) {
		this.misProfesores = misProfesores;
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Salon [nombre=" + nombre + ", ubicacion=" + ubicacion + ", numero=" + numero + ", misCursos="
				+ misCursos + ", misProfesores=" + misProfesores + ", misEstudiantes=" + misEstudiantes + "]";
	}
	
}

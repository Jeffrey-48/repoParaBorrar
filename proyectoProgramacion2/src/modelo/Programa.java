/**
 * 
 */
package modelo;

import java.util.ArrayList;

/**
 * @author braya
 *
 */
public class Programa {
	
	public String nombre;
	public int creditos;
	public int numeroEstudiantesRegistrados;
	public ArrayList<Curso> misCursos;
	
	/**
	 * @param nombre
	 * @param creditos
	 * @param numeroEstudiantesRegistrados
	 */

	public Programa() {
		
	}

	/**
	 * @param nombre
	 * @param creditos
	 * @param numeroEstudiantesRegistrados
	 * @param misCursos
	 */
	public Programa(String nombre, int creditos, int numeroEstudiantesRegistrados, ArrayList<Curso> misCursos) {
		super();
		this.nombre = nombre;
		this.creditos = creditos;
		this.numeroEstudiantesRegistrados = numeroEstudiantesRegistrados;
		this.misCursos = misCursos;
	}
	
	

	public ArrayList<Curso> getMisCursos() {
		return misCursos;
	}

	public void setMisCursos(ArrayList<Curso> misCursos) {
		this.misCursos = misCursos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the creditos
	 */
	public int getCreditos() {
		return creditos;
	}

	/**
	 * @param creditos the creditos to set
	 */
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	/**
	 * @return the numeroEstudiantesRegistrados
	 */
	public int getNumeroEstudiantesRegistrados() {
		return numeroEstudiantesRegistrados;
	}

	/**
	 * @param numeroEstudiantesRegistrados the numeroEstudiantesRegistrados to set
	 */
	public void setNumeroEstudiantesRegistrados(int numeroEstudiantesRegistrados) {
		this.numeroEstudiantesRegistrados = numeroEstudiantesRegistrados;
	}

	@Override
	public String toString() {
		return "Programa [nombre=" + nombre + ", creditos=" + creditos + ", numeroEstudiantesRegistrados="
				+ numeroEstudiantesRegistrados + ", misCursos=" + misCursos + "]";
	}

}

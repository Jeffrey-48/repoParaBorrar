/**
 * 
 */
package Logica;

import java.util.ArrayList;

import modelo.Curso;
import modelo.Programa;

public class CreacionPrograma {

	public ArrayList<Programa> misProgramas;
	public ArrayList<Curso> misCursos;
	
	/**
	 * Constructor de la clase
	 */
	public CreacionPrograma(){
		misProgramas = new ArrayList<Programa>();
		crearPrograma();
	}
	
	/**
	 * Metodo para crear un programa y agregarlo a un ArrayList
	 * 
	 */
	public void crearPrograma() {
		Programa pr1 = new Programa("Ingeniera de sistemas", 3, 20, null);
		Programa pr2 = new Programa("Medicina", 4, 15, null);
		Programa pr3 = new Programa("Zootecnia", 5, 30, null);
		Programa pr4 = new Programa("Artes visuales", 6, 20, null);
		Programa pr5 = new Programa("Biologia", 7, 13, null);
		
		misProgramas.add(pr1);
		misProgramas.add(pr2);
		misProgramas.add(pr3);
		misProgramas.add(pr4);
		misProgramas.add(pr5);
	}

	/**
	 * @return the misProgramas
	 */
	public ArrayList<Programa> getMisProgramas() {
		return misProgramas;
	}

	/**
	 * @param misProgramas the misProgramas to set
	 */
	public void setMisProgramas(ArrayList<Programa> misProgramas) {
		this.misProgramas = misProgramas;
	}
	
	
}
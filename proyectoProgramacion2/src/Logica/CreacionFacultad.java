/**
 * 
 */
package Logica;

import java.util.ArrayList;

import modelo.Facultad;

/**
 * @author braya
 *
 */
public class CreacionFacultad {
	
	public ArrayList<Facultad> misFacultades;
	
	public CreacionFacultad() {
		misFacultades = new ArrayList<Facultad>();
		crearFacultades();
	}
	
	public void crearFacultades() {
		Facultad f1 = new Facultad("Ingenieria", 5, null, null, 100, 4, 400);
		Facultad f2 = new Facultad("Medicina", 6, null, null, 150, 4, 400);
		Facultad f3 = new Facultad("Ciencias Basicas", 7, null, null, 140, 4, 400);
		Facultad f4 = new Facultad("Ciencias de la Educacion", 3, null, null, 150, 4, 300);
		Facultad f5 = new Facultad("Ciencias humanas y bellas artes", 5, null, null, 100, 4, 400);
		
		misFacultades.add(f1);
		misFacultades.add(f2);
		misFacultades.add(f3);
		misFacultades.add(f4);
		misFacultades.add(f5);
	}

	/**
	 * @return the misFacultades
	 */
	public ArrayList<Facultad> getMisFacultades() {
		return misFacultades;
	}

	/**
	 * @param misFacultades the misFacultades to set
	 */
	public void setMisFacultades(ArrayList<Facultad> misFacultades) {
		this.misFacultades = misFacultades;
	}
	
	

}

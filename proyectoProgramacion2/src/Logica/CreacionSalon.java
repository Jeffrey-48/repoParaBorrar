/**
 * 
 */
package Logica;

import java.util.ArrayList;

import modelo.Facultad;
import modelo.Salon;

/**
 * @author braya
 *
 */
public class CreacionSalon {
	
	public ArrayList<Salon> misSalones;
	public Facultad miFacultad;
	
	public CreacionSalon() {
		misSalones = new ArrayList<Salon>();
		crearSalones();
	}
	
	public void crearSalones() {
		Salon s1 = new Salon("Salon01", "Facultad de ingenieria piso1", 1, null, null,null);
		Salon s2 = new Salon("Salon100", "Facultad de medicina piso1", 100, null, null,null);
		Salon s3 = new Salon("Salon200", "Facultad de ciencias basicas piso2",200 , null, null,null);
		Salon s4 = new Salon("Salon300", "Facultad de educacion piso3", 300, null, null,null);
		Salon s5 = new Salon("Salon400", "Facultad de ciencias humnas piso4", 400, null, null,null);
		
		misSalones.add(s1);
		misSalones.add(s2);
		misSalones.add(s3);
		misSalones.add(s4);
		misSalones.add(s5);
	}

	/**
	 * @return the misSalones
	 */
	public ArrayList<Salon> getMisSalones() {
		return misSalones;
	}

	/**
	 * @param misSalones the misSalones to set
	 */
	public void setMisSalones(ArrayList<Salon> misSalones) {
		this.misSalones = misSalones;
	}
	
	
	

}

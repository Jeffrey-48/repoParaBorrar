/**
 * 
 */
package Logica;

import java.util.ArrayList;

import modelo.Estudiante;

/**
 * @author braya
 *
 */
public class CreacionEstudiante {

	public ArrayList<Estudiante> estudiantesInscritos;

	public CreacionEstudiante() {
		estudiantesInscritos = new ArrayList<>();
		crearEstudiantes();
	}

	private void crearEstudiantes() {
		Estudiante e1 = new Estudiante("Carlos","Arturo", "ca@gmail.com", "carrera 12 numero 12",
				"1", "3135467895", "o", "+", "01/01/2000", "masculino", "Estudiante",
				3, 1, null);
		Estudiante e2 = new Estudiante("Adrian","Jesus", "eg@gmail.com", "carrera 14 numero 2",
				"2", "3155466825", "o", "+", "02/02/2001", "masculino", "Estudiante",
				4, 2,null);
		Estudiante e3 = new Estudiante("Cristian","Garcia", "cg@gmail.com", "carrera 1 numero 2",
				"3", "3124862578", "o", "-", "10/12/2006", "masculino", "Estudiante",
				2, 3,null);
		Estudiante e4 = new Estudiante("Camila","Sanchez", "cz@gmail.com", "carrera 9 numero 5",
				"4", "3225694582", "a", "+", "10/11/1998", "femenino", "Estudiante",
				6, 4, null);
		Estudiante e5 = new Estudiante("Maria","Castro", "mc@gmail.com", "carrera 41 numero 3",
				"5", "3215961245", "o", "+", "15/03/2003", "femenino", "Estudiante",
				1, 5, null);
		estudiantesInscritos.add(e1);
		estudiantesInscritos.add(e2);
		estudiantesInscritos.add(e3);
		estudiantesInscritos.add(e4);
		estudiantesInscritos.add(e5);
	}

	public ArrayList<Estudiante> getEstudiantesInscritos() {
		return estudiantesInscritos;
	}

	public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
		this.estudiantesInscritos = estudiantesInscritos;
	}
	
	
}

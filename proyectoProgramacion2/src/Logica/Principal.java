package Logica;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import modelo.Curso;
import modelo.Estudiante;
import modelo.Facultad;
import modelo.Persona;
import modelo.Profesor;
import modelo.Programa;
import modelo.Salon;
import modelo.Tipo;
import modelo.Universidad;

public class Principal {

	public ArrayList<Estudiante> estudiantes;
	public ArrayList<Profesor> profesor;
	public ArrayList<Facultad> facultad;
	public ArrayList<Salon> salon;
	public ArrayList<Persona> personas;
	public ArrayList<Curso> cursos;
	public ArrayList<Programa> programas;
	public Universidad universidad;
	public static Scanner scanner = new Scanner(System.in); // Sirve para recoger texto por consola
	public static int select = -1; // opción elegida del usuario

	public Principal() {
		iniciar();

	}

	private void iniciar() {
		CreacionEstudiante estudiantes = new CreacionEstudiante();
		this.estudiantes = estudiantes.getEstudiantesInscritos();
		CreacionProfesor profesor = new CreacionProfesor();
		this.profesor = profesor.getMisProfesores();
		CreacionFacultad facultad = new CreacionFacultad();
		this.facultad = facultad.getMisFacultades();
		CreacionSalon salon = new CreacionSalon();
		this.salon = salon.getMisSalones();
		CreacionCursos curso = new CreacionCursos();
		this.cursos = curso.getMisCursos();
		CreacionPrograma programa = new CreacionPrograma();
		this.programas = programa.getMisProgramas();
		llenarPersonas(this.estudiantes, this.profesor);
		universidad = new Universidad("UniQuindio", "0123", "la castellana", "036 784 512", Tipo.PUBLICA, this.facultad,
				personas);
		llenarListas();
		llenarEstudianteCursos();
		llenarCursos();
		llenarFacultades();
		llenarProfesores();
		llenarProgramas();
		lanzarMenu();
	}

	private String requisitoUnoC(int codigo) {
		String cadena = "";
		for (int i = 0; i < this.programas.size(); i++) {
			if (this.programas.get(i).getCreditos() == codigo) {
				for (int j = 0; j < this.programas.get(i).getMisCursos().size(); j++) {
					ArrayList<Estudiante> estudiantesL = this.programas.get(i).getMisCursos().get(j)
							.getMisEstudiantes();

					for (int k = 0; k < this.profesor.size(); k++) {
						for (int k2 = 0; k2 < this.profesor.get(k).getMisCursos().size(); k2++) {

							cadena += this.programas.get(i).getCreditos() + "   " + this.programas.get(i).getNombre()
									+ "   " + this.programas.get(i).getMisCursos().get(j).getNombre() + "   "
									+ estudiantesL.size() + "   " + this.profesor.get(k).getMisCursos().size() + "   "
									+ (this.profesor.get(k).getMisCursos().get(k2).getMisEstudiantes().size()
											/ estudiantesL.size())
									+ "\n";

						}

					}
				}
			}
		}
		return cadena;
	}

	private void llenarProgramas() {
		for (int i = 0; i < this.programas.size(); i++) {
			if (i == 0) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(0));
				cursos1.add(this.cursos.get(1));
				cursos1.add(this.cursos.get(2));
				this.programas.get(i).setMisCursos(cursos1);
			}
			if (i == 1) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(3));
				cursos1.add(this.cursos.get(4));
				this.programas.get(i).setMisCursos(cursos1);
			}
			if (i == 2) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(1));
				cursos1.add(this.cursos.get(4));
				this.programas.get(i).setMisCursos(cursos1);
			}
			if (i == 3) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(2));
				cursos1.add(this.cursos.get(3));
				cursos1.add(this.cursos.get(4));
				this.programas.get(i).setMisCursos(cursos1);
			}
			if (i == 4) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(0));
				cursos1.add(this.cursos.get(4));
				this.programas.get(i).setMisCursos(cursos1);
			}
		}

	}

	private void lanzarMenu() {
		// Mientras la opción elegida sea 0, preguntamos al usuario
		while (select != 0) {
			// Try catch para evitar que el programa termine si hay un error
			try {
				System.out.println("Elige opción:\n1.- Funcionalidad 1" + "\n2.- Funcionalidad 2\n"
						+ "3.- Funcionalidad 3\n" + "4.- Funcionalidad 4\n" + "0.- Salir");
				// Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine());

				switch (select) {

				case 1:
					String text1 = requisitoUnoA();
					System.out.println(text1);
					break;
				case 2:
					String text2 = requisitoUnoB();
					System.out.println(text2);
					break;
				case 3:
					int id = 3;
					String cadena = requisitoUnoC(id);
					System.out.println(cadena);
					break;
				case 4:
					int codigo = Integer.parseInt(scanner.nextLine());
					String text4 = requisitoUnoD(codigo);
					System.out.println(text4);
					break;
				case 0:
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Número no reconocido");
					break;
				}

				System.out.println("\n"); // Mostrar un salto de línea en Java

			} catch (Exception e) {
				System.out.println("Uoop! Error!");
			}
		}

	}

	private String requisitoUnoD(int codigo) {
		String text = "";
		for (int i = 0; i < this.salon.size(); i++) {
			if (this.salon.get(i).getNumero() == codigo) {
				for (int j = 0; j < this.salon.get(i).getMisCursos().size(); j++) {
					ArrayList<Estudiante> estudiantesL = this.salon.get(i).getMisCursos().get(j).getMisEstudiantes();
					for (int j2 = 0; j2 < estudiantesL.size(); j2++) {
						if (estudiantesL.get(j2).equals("masculino")) {
							text += this.salon.get(i).getNombre() + "   "
									+ this.salon.get(i).getMisCursos().get(j).getNombre() + "  masculino   "
									+ estudiantesL.size() + "\n";
						} else {
							text += this.salon.get(i).getNombre() + "   "
									+ this.salon.get(i).getMisCursos().get(j).getNombre() + "  femenino   "
									+ estudiantesL.size() + "\n";
						}
					}
				}
			}
		}
		return text;
	}

	private void llenarFacultades() {
		for (int i = 0; i < this.facultad.size(); i++) {
			if (i == 0) {
				ArrayList<Programa> programas1 = new ArrayList<>();
				programas1.add(this.programas.get(0));
				programas1.add(this.programas.get(4));
				this.facultad.get(i).setMisProgramas(programas1);
			}
			if (i == 1) {
				ArrayList<Programa> programas1 = new ArrayList<>();
				programas1.add(this.programas.get(1));
				programas1.add(this.programas.get(2));
				programas1.add(this.programas.get(3));
				this.facultad.get(i).setMisProgramas(programas1);
			}
			if (i == 2) {
				ArrayList<Programa> programas1 = new ArrayList<>();
				programas1.add(this.programas.get(0));
				programas1.add(this.programas.get(3));
				this.facultad.get(i).setMisProgramas(programas1);
			}
			if (i == 3) {
				ArrayList<Programa> programas1 = new ArrayList<>();
				programas1.add(this.programas.get(2));
				programas1.add(this.programas.get(3));
				this.facultad.get(i).setMisProgramas(programas1);
			}
			if (i == 4) {
				ArrayList<Programa> programas1 = new ArrayList<>();
				programas1.add(this.programas.get(0));
				this.facultad.get(i).setMisProgramas(programas1);
			}
		}
	}

	private String requisitoUnoB() {
		String cadena = "";
		for (int i = 0; i < this.facultad.size(); i++) {
			for (int j = 0; j < this.facultad.get(i).getMisProgramas().size(); j++) {
				for (int j2 = 0; j2 < this.facultad.get(i).getMisProgramas().get(j).getMisCursos().size(); j2++) {
					ArrayList<Estudiante> estudiantesL = this.facultad.get(i).getMisProgramas().get(j).getMisCursos()
							.get(j2).getMisEstudiantes();
					for (int k = 0; k < estudiantesL.size(); k++) {
						double edad = promedio2(estudiantesL);
						if (estudiantesL.get(k).getGenero().equals("masculino")) {
							cadena += this.facultad.get(i).getNombre() + "   "
									+ this.facultad.get(i).getMisProgramas().get(j).getNombre() + "   masculino   "
									+ estudiantesL.size() + "   " + edad + "\n";
						} else {
							cadena += this.facultad.get(i).getNombre() + "   "
									+ this.facultad.get(i).getMisProgramas().get(j).getNombre() + "   femenino   "
									+ estudiantesL.size() + "   " + edad + "\n";
						}
					}
				}

			}
		}
		return cadena;
	}

	public double promedio2(ArrayList<Estudiante> estudiantes) {

		int sum = 0, n;
		double prom;
		int edad;
		n = estudiantes.size();
		for (int i = 0; i < estudiantes.size(); i++) {
			edad = generarEdad(estudiantes.get(i).fechaNacimiento);
			sum += edad;
		}
		prom = sum / n;

		return prom;
	}

	private String requisitoUnoA() {
		String nombre = "";
		for (int i = 0; i < this.cursos.size(); i++) {
			if (i == 0) {
				for (int j = 0; j < this.cursos.get(i).getMisEstudiantes().size(); j++) {
					if (this.cursos.get(i).getMisEstudiantes().get(j).getGenero().equals("masculino")) {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Masculino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					} else {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Femenino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					}
				}
			}
			if (i == 1) {
				for (int j = 0; j < this.cursos.get(i).getMisEstudiantes().size(); j++) {
					if (this.cursos.get(i).getMisEstudiantes().get(j).getGenero().equals("masculino")) {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Masculino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					} else {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Femenino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					}
				}
			}
			if (i == 2) {
				for (int j = 0; j < this.cursos.get(i).getMisEstudiantes().size(); j++) {
					if (this.cursos.get(i).getMisEstudiantes().get(j).getGenero().equals("masculino")) {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Masculino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					} else {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Femenino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					}
				}
			}
			if (i == 3) {
				for (int j = 0; j < this.cursos.get(i).getMisEstudiantes().size(); j++) {
					if (this.cursos.get(i).getMisEstudiantes().get(j).getGenero().equals("masculino")) {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Masculino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					} else {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Femenino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					}
				}
			}
			if (i == 4) {
				for (int j = 0; j < this.cursos.get(i).getMisEstudiantes().size(); j++) {
					if (this.cursos.get(i).getMisEstudiantes().get(j).getGenero().equals("masculino")) {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Masculino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					} else {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Femenino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					}
				}
			}
			if (i == 5) {
				for (int j = 0; j < this.cursos.get(i).getMisEstudiantes().size(); j++) {
					if (this.cursos.get(i).getMisEstudiantes().get(j).getGenero().equals("masculino")) {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Masculino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					} else {
						int edad = generarEdad(this.cursos.get(i).getMisEstudiantes().get(j).getFechaNacimiento());
						nombre += this.cursos.get(i).getNombre() + "   Femenino  "
								+ this.cursos.get(i).getMisEstudiantes().size() + "   " + edad + "\n";
					}
				}
			}
		}
		return nombre;
	}

	private void llenarProfesores() {
		for (int i = 0; i < this.profesor.size(); i++) {
			if (i == 0) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(0));
				cursos1.add(this.cursos.get(1));
				this.profesor.get(i).setMisCursos(cursos1);
				;
			}
			if (i == 1) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(0));
				cursos1.add(this.cursos.get(1));
				this.profesor.get(i).setMisCursos(cursos1);
				;
			}
			if (i == 2) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(0));
				cursos1.add(this.cursos.get(1));
				this.profesor.get(i).setMisCursos(cursos1);
				;
			}
			if (i == 3) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(0));
				cursos1.add(this.cursos.get(1));
				this.profesor.get(i).setMisCursos(cursos1);
				;
			}
			if (i == 4) {
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(0));
				cursos1.add(this.cursos.get(1));
				this.profesor.get(i).setMisCursos(cursos1);
				;
			}
		}

	}

	private void llenarCursos() {
		for (int j = 0; j < this.cursos.size(); j++) {
			if (j == 0) {
				ArrayList<Estudiante> estudiantes1 = new ArrayList<>();
				estudiantes1.add(this.estudiantes.get(0));
				estudiantes1.add(this.estudiantes.get(1));
				this.cursos.get(j).setMisEstudiantes(estudiantes1);
			}
			if (j == 1) {
				ArrayList<Estudiante> estudiantes1 = new ArrayList<>();
				estudiantes1.add(this.estudiantes.get(1));
				estudiantes1.add(this.estudiantes.get(4));
				this.cursos.get(j).setMisEstudiantes(estudiantes1);
			}
			if (j == 2) {
				ArrayList<Estudiante> estudiantes1 = new ArrayList<>();
				estudiantes1.add(this.estudiantes.get(1));
				this.cursos.get(j).setMisEstudiantes(estudiantes1);
			}
			if (j == 3) {
				ArrayList<Estudiante> estudiantes1 = new ArrayList<>();
				estudiantes1.add(this.estudiantes.get(0));
				estudiantes1.add(this.estudiantes.get(2));
				this.cursos.get(j).setMisEstudiantes(estudiantes1);
			}
			if (j == 4) {
				ArrayList<Estudiante> estudiantes1 = new ArrayList<>();
				estudiantes1.add(this.estudiantes.get(2));
				estudiantes1.add(this.estudiantes.get(3));
				this.cursos.get(j).setMisEstudiantes(estudiantes1);
			}
			if (j == 5) {
				ArrayList<Estudiante> estudiantes1 = new ArrayList<>();
				estudiantes1.add(this.estudiantes.get(0));
				estudiantes1.add(this.estudiantes.get(2));
				estudiantes1.add(this.estudiantes.get(3));
				estudiantes1.add(this.estudiantes.get(4));
				this.cursos.get(j).setMisEstudiantes(estudiantes1);
			}
		}
	}

	private void llenarEstudianteCursos() {
		for (int j = 0; j < this.estudiantes.size(); j++) {
			if (j == 0) {
				ArrayList<String> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(0).getNombre());
				cursos1.add(this.cursos.get(3).getNombre());
				cursos1.add(this.cursos.get(5).getNombre());
				this.estudiantes.get(j).setMisCursos(cursos1);
			}
			if (j == 1) {
				ArrayList<String> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(0).getNombre());
				cursos1.add(this.cursos.get(1).getNombre());
				cursos1.add(this.cursos.get(2).getNombre());
				this.estudiantes.get(j).setMisCursos(cursos1);
			}
			if (j == 2) {
				ArrayList<String> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(3).getNombre());
				cursos1.add(this.cursos.get(4).getNombre());
				cursos1.add(this.cursos.get(5).getNombre());
				this.estudiantes.get(j).setMisCursos(cursos1);
			}
			if (j == 3) {
				ArrayList<String> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(4).getNombre());
				cursos1.add(this.cursos.get(5).getNombre());
				cursos1.add(this.cursos.get(6).getNombre());
				this.estudiantes.get(j).setMisCursos(cursos1);
			}
			if (j == 4) {
				ArrayList<String> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(1).getNombre());
				cursos1.add(this.cursos.get(5).getNombre());
				cursos1.add(this.cursos.get(6).getNombre());
				this.estudiantes.get(j).setMisCursos(cursos1);
			}
			if (j == 5) {
				ArrayList<String> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(4).getNombre());
				cursos1.add(this.cursos.get(6).getNombre());
				this.estudiantes.get(j).setMisCursos(cursos1);
			}
		}

	}

	private void llenarListas() {
		for (int i = 0; i < this.salon.size(); i++) {
			if (this.salon.get(i).getNombre().equals("Salon01")) {
				ArrayList<Estudiante> estudiantesSalon1 = new ArrayList<>();
				estudiantesSalon1.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(i));
				this.salon.get(i).setMisCursos(cursos1);
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon1);

			}
			if (this.salon.get(i).getNombre().equals("Salon100")) {
				ArrayList<Estudiante> estudiantesSalon2 = new ArrayList<>();
				estudiantesSalon2.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(i));
				this.salon.get(i).setMisCursos(cursos1);
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon2);
			}
			if (this.salon.get(i).getNombre().equals("Salon200")) {
				ArrayList<Estudiante> estudiantesSalon3 = new ArrayList<>();
				estudiantesSalon3.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(i));
				this.salon.get(i).setMisCursos(cursos1);
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon3);
			}
			if (this.salon.get(i).getNombre().equals("Salon300")) {
				ArrayList<Estudiante> estudiantesSalon4 = new ArrayList<>();
				estudiantesSalon4.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(i));
				this.salon.get(i).setMisCursos(cursos1);
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon4);
			}
			if (this.salon.get(i).getNombre().equals("Salon400")) {
				ArrayList<Estudiante> estudiantesSalon5 = new ArrayList<>();
				estudiantesSalon5.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				ArrayList<Curso> cursos1 = new ArrayList<>();
				cursos1.add(this.cursos.get(i));
				this.salon.get(i).setMisCursos(cursos1);
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon5);
			}
		}
	}

	private void llenarPersonas(ArrayList<Estudiante> estudiantes2, ArrayList<Profesor> profesor2) {
		personas = new ArrayList<>();
		for (int i = 0; i < estudiantes2.size(); i++) {
			personas.add(estudiantes2.get(i));
		}
		for (int i = 0; i < profesor2.size(); i++) {
			personas.add(profesor2.get(i));
		}
	}

	private int generarEdad(String fecha) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);
		Period edad = Period.between(fechaNacimiento, LocalDate.now());
		int edadActual = edad.getYears();
		return edadActual;

	}

}

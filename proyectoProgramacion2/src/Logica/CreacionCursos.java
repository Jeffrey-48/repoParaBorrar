package Logica;

import java.util.ArrayList;

import modelo.Curso;

public class CreacionCursos {

	public ArrayList<Curso> misCursos;

	public CreacionCursos() {
		misCursos = new ArrayList<Curso>();
		crearCursos();
	}

	public void crearCursos() {
		Curso c1 = new Curso("Fundamentos de Algoritmia", 3, "001", null);
		Curso c2 = new Curso("Programación I", 3, "002", null);
		Curso c3 = new Curso("Programación 2", 3, "003", null);
		Curso c4 = new Curso("Programación 3", 3, "004", null);
		Curso c5 = new Curso("Calculo I", 3, "005",null);
		Curso c6 = new Curso("Calculo 2", 3, "006", null);
		Curso c7 = new Curso("Calculo 3", 3, "007", null);

		misCursos.add(c1);
		misCursos.add(c2);
		misCursos.add(c3);
		misCursos.add(c4);
		misCursos.add(c5);
		misCursos.add(c6);
		misCursos.add(c7);

	}

	public ArrayList<Curso> getMisCursos() {
		return misCursos;
	}

	public void setMisCursos(ArrayList<Curso> misCursos) {
		this.misCursos = misCursos;
	}

}

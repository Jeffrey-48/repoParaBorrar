package modelo;

public class Edificacion {
	
	public double metrosCuadrados;
	public int numeroPisos;
	public int numeroSalones;
	
	public Edificacion() {
		super();
	}

	public Edificacion(double metrosCuadrados, int numeroPisos, int numeroSalones) {
		super();
		this.metrosCuadrados = metrosCuadrados;
		this.numeroPisos = numeroPisos;
		this.numeroSalones = numeroSalones;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getNumeroPisos() {
		return numeroPisos;
	}

	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}

	public int getNumeroSalones() {
		return numeroSalones;
	}

	public void setNumeroSalones(int numeroSalones) {
		this.numeroSalones = numeroSalones;
	}

	@Override
	public String toString() {
		return "Edificacion [metrosCuadrados=" + metrosCuadrados + ", numeroPisos=" + numeroPisos + ", numeroSalones="
				+ numeroSalones + "]";
	}
	
	

}

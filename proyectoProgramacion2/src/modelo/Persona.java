/**
 * 
 */
package modelo;

public class Persona {
	public String nombre;
	public String apellido;
	public String correo;
	public String direccion;
	public String identificador;
	public String telefono;
	public String tipoSangre;
	public String rh;
	public String fechaNacimiento;
	public String genero;
	public String tipoVinculacion;

	/**
	 * @param nombre
	 * @param apellido
	 * @param correo
	 * @param direccion
	 * @param identificador
	 * @param telefono
	 * @param tipoSangre
	 * @param rh
	 * @param fechaNacimiento
	 * @param genero
	 * @param tipoVinculacion
	 */
	public Persona(String nombre, String apellido, String correo, String direccion, String identificador,
			String telefono, String tipoSangre, String rh, String fechaNacimiento, String genero,
			String tipoVinculacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
		this.identificador = identificador;
		this.telefono = telefono;
		this.tipoSangre = tipoSangre;
		this.rh = rh;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.tipoVinculacion = tipoVinculacion;
	}

	public Persona() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getRh() {
		return rh;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipoVinculacion() {
		return tipoVinculacion;
	}

	public void setTipoVinculacion(String tipoVinculacion) {
		this.tipoVinculacion = tipoVinculacion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", direccion="
				+ direccion + ", identificador=" + identificador + ", telefono=" + telefono + ", tipoSangre="
				+ tipoSangre + ", rh=" + rh + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero
				+ ", tipoVinculacion=" + tipoVinculacion + "]";
	}

}

package ec.unl.sw.tareaPatronDisenio.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

	private String nombre = "";
	private String apellido = "";
	private String identificacion = "";
	private Date fechaNacimiento = new Date();
	
	public Persona(String nombre, String apellido, String identificacion, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public String getFechaNacimientoFormato() {
		SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
		return formateadorFecha.format(fechaNacimiento).toString();
	}
	
	public String fullName() {
		return nombre.concat(" ").concat(apellido);
	}
	
	public String getObjetoPersona() {
		return "Nombre: ".concat(this.fullName()).concat(", C.I: ").concat(identificacion).concat(", Fecha Nacimiento: ").concat(getFechaNacimientoFormato());
	}
	
}

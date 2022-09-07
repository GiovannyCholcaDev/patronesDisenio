package ec.unl.sw.tareaPatronDisenio.domain;

import java.util.Date;

/*
 * clase producto 
 */
public class Docente extends Persona {
	
	private String tituloAcademico;
	
	public Docente(String nombre, String apellido, String identificacion, Date fechaNacimiento, String tituloAcademico) {
		super(nombre, apellido, identificacion, fechaNacimiento);
		this.tituloAcademico = tituloAcademico;
	}

	public String getObjeto() {
		return "Soy un objeto Docente e imparto clases --> ".concat(this.getObjetoPersona()).concat(", Titulo Académico: ").concat(tituloAcademico);
	}

}

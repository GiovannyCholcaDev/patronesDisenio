package ec.unl.sw.tareaPatronDisenio.domain;

import java.util.Date;

//clase producto
public class Estudiante extends Persona {

	private EnumNivelSocioEconomico nivelSocioEconomico;
	
	public Estudiante (EnumNivelSocioEconomico nivelEconomico, String nombre, String apellido, String identificacion, Date fechaNacimiento) {
		super(nombre, apellido, identificacion, fechaNacimiento);
		this.nivelSocioEconomico = nivelEconomico;
	}

	public EnumNivelSocioEconomico getNivelSocioEconomico() {
		return nivelSocioEconomico;
	}
	
	public String getObjeto() {
		return "Soy un objeto Estudiante y recibo clases --> ".concat(this.getObjetoPersona()).concat(", Nivel Socio Economico: ").concat(nivelSocioEconomico.toString());
	}
	
}

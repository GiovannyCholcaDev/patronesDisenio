package ec.unl.sw.tareaPatronDisenio.domain;

import java.util.Date;

public class PersonalAdministrativo extends Persona {

	private String cargoAdministrativo;
	
	public PersonalAdministrativo(String nombre, String apellido, String identificacion, Date fechaNacimiento,  String cargoAdministrativo) {
		super(nombre, apellido, identificacion, fechaNacimiento);
		this.cargoAdministrativo = cargoAdministrativo;
	}
	
	public String getObjeto() {
		return "Soy un objeto Personal Administrativo y realizo trámites para la gestión de la IES --> ".concat(this.getObjetoPersona()).concat(", Cargo Administrativo: ").concat(cargoAdministrativo);
	}
	
}

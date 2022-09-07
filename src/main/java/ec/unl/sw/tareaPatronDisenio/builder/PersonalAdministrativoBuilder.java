package ec.unl.sw.tareaPatronDisenio.builder;

import java.util.Date;

import ec.unl.sw.tareaPatronDisenio.domain.EnumNivelSocioEconomico;
import ec.unl.sw.tareaPatronDisenio.domain.PersonalAdministrativo;

public class PersonalAdministrativoBuilder implements IPersonaBuilder {
	
	private String nombre = "";
	private String apellido = "";
	private String identificacion = "";
	private Date fechaNacimiento = new Date();
	private String cargoAdministrativo;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public PersonalAdministrativo setCrearObjeto() {
		return new PersonalAdministrativo(nombre, apellido, identificacion, fechaNacimiento, cargoAdministrativo);
	}
	
	public void setCargoAdministrativo(String cargoAdministativo) {
		this.cargoAdministrativo = cargoAdministativo;
	}
	
	public void setNivelSocioEconomico(EnumNivelSocioEconomico nivelSocioEconomico) {
		// TODO Auto-generated method stub
	}
	
	public void setTituloAcademico(String tituloAcademico) {
		// TODO Auto-generated method stub
	}
	
}

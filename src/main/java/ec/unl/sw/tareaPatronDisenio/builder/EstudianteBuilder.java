package ec.unl.sw.tareaPatronDisenio.builder;

import java.util.Date;

import ec.unl.sw.tareaPatronDisenio.domain.EnumNivelSocioEconomico;
import ec.unl.sw.tareaPatronDisenio.domain.Estudiante;

public class EstudianteBuilder implements IPersonaBuilder {
	
	private EnumNivelSocioEconomico nivelSocioEconomico;
	private String nombre = "";
	private String apellido = "";
	private String identificacion = "";
	private Date fechaNacimiento = new Date();
	
	public void setNivelSocioEconomico(EnumNivelSocioEconomico nivelSocioEconomico) {
		this.nivelSocioEconomico = nivelSocioEconomico;
	}
	
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
	
	public Estudiante setCrearObjeto() {
		return new Estudiante(nivelSocioEconomico, nombre, apellido, identificacion, fechaNacimiento);
	}

	public void setTituloAcademico(String tituloAcademico) {
		// TODO Auto-generated method stub
	}

	public void setCargoAdministrativo(String cargoAdministativo) {
		// TODO Auto-generated method stub
	}

}

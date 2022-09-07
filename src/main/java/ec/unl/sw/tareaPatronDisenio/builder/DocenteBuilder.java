package ec.unl.sw.tareaPatronDisenio.builder;

import java.util.Date;

import ec.unl.sw.tareaPatronDisenio.domain.Docente;
import ec.unl.sw.tareaPatronDisenio.domain.EnumNivelSocioEconomico;

public class DocenteBuilder implements IPersonaBuilder  {

	private String nombre = "";
	private String apellido = "";
	private String identificacion = "";
	private Date fechaNacimiento = new Date();
	private String tituloAcademico;
	
	
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
	
	public void setTituloAcademico(String tituloAcademico) {
		this.tituloAcademico = tituloAcademico;
	}	
	
	/**
	 * contructor
	 * @return
	 */
	public Docente setCrearObjeto() {
		return new Docente(nombre, apellido, identificacion, fechaNacimiento, tituloAcademico);
	}
	
	
	public void setNivelSocioEconomico(EnumNivelSocioEconomico nivelSocioEconomico) {
		// TODO Auto-generated method stub
	}
	
	public void setCargoAdministrativo(String cargoAdministativo) {
		// TODO Auto-generated method stub
	}
	public void nuevoFuncionalidad(String parametro) {
		// TODO Auto-generated method stub
		
	}
	
}

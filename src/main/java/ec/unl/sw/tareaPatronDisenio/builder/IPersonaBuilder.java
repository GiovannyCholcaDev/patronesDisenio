package ec.unl.sw.tareaPatronDisenio.builder;

import java.util.Date;

import ec.unl.sw.tareaPatronDisenio.domain.EnumNivelSocioEconomico;

public interface IPersonaBuilder {
	
	 public void setNombre(String nombre);
	
	 public void setApellido(String apellido);
	
	 public void setIdentificacion(String identificacion);
	
	 public void setFechaNacimiento(Date fechaNacimiento);
	
	 //estudiante
	 public void setNivelSocioEconomico(EnumNivelSocioEconomico nivelSocioEconomico);
	
	 //docente
	 public void  setTituloAcademico(String tituloAcademico);
	
	 //personal administrativo
	 public void setCargoAdministrativo(String cargoAdministativo);

}

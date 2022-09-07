package ec.unl.sw.tareaPatronDisenio.builder;

import java.util.Date;

import ec.unl.sw.tareaPatronDisenio.domain.EnumNivelSocioEconomico;

public class PersonaDirector {
	
	@SuppressWarnings("deprecation")
	public void constructorEstudiante(IPersonaBuilder builder) {
		builder.setNivelSocioEconomico(EnumNivelSocioEconomico.BAJA);
		builder.setNombre("Giovanny");
		builder.setApellido("Cholca");
		builder.setIdentificacion("1715851406");
		Date fechaN = new Date("25/09/1985");
		builder.setFechaNacimiento(fechaN);
	}
	
	@SuppressWarnings("deprecation")
	public void constuctorDocente(IPersonaBuilder builder) {
		builder.setNombre("Luis Fernando");
		builder.setApellido("Leon");
		builder.setIdentificacion("1716841796");
		builder.setTituloAcademico("Ingeniero informático");
		Date fechaN = new Date("01/01/1985");
		builder.setFechaNacimiento(fechaN);
	}
	
	@SuppressWarnings("deprecation")
	public void constructorPersonalAdministativo(IPersonaBuilder builder) {
		builder.setNombre("Emilio José");
		builder.setApellido("Vera");
		builder.setIdentificacion("1716854106");
		builder.setCargoAdministrativo("Analista de desarrollo");
		Date fechaN = new Date("02/09/1985");
		builder.setFechaNacimiento(fechaN);
	}

}

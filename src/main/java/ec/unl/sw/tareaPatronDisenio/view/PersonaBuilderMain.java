package ec.unl.sw.tareaPatronDisenio.view;

import ec.unl.sw.tareaPatronDisenio.builder.DocenteBuilder;
import ec.unl.sw.tareaPatronDisenio.builder.EstudianteBuilder;
import ec.unl.sw.tareaPatronDisenio.builder.PersonaDirector;
import ec.unl.sw.tareaPatronDisenio.builder.PersonalAdministrativoBuilder;
import ec.unl.sw.tareaPatronDisenio.domain.Docente;
import ec.unl.sw.tareaPatronDisenio.domain.Estudiante;
import ec.unl.sw.tareaPatronDisenio.domain.PersonalAdministrativo;

public class PersonaBuilderMain {

	public static void main(String[] args) {
		
		System.out.println("Patron de diseño Builder");
		
		PersonaDirector director = new PersonaDirector();
		
		EstudianteBuilder estudianteBuilder = new EstudianteBuilder();
		director.constructorEstudiante(estudianteBuilder);
		Estudiante estudiante = estudianteBuilder.setCrearObjeto();
		System.out.println(estudiante.getObjeto());
		
		DocenteBuilder docenteBuilder = new DocenteBuilder();
		director.constuctorDocente(docenteBuilder);
		Docente docente = docenteBuilder.setCrearObjeto();
		System.out.println(docente.getObjeto());
		
		PersonalAdministrativoBuilder adminBuilder = new PersonalAdministrativoBuilder();
		director.constructorPersonalAdministativo(adminBuilder);
		PersonalAdministrativo personAdmin = adminBuilder.setCrearObjeto();
		System.out.println(personAdmin.getObjeto());
	}

}

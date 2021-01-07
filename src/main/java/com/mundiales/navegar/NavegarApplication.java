package com.mundiales.navegar;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NavegarApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(NavegarApplication.class, args);
	/*	System.out.println("Esto es lo nuevo en la web");
		ConfigurableApplicationContext context = SpringApplication.run(Authentication.class);
	UsuarioRepository repository = context.getBean(UsuarioRepository.class);
	repository.save(new UsuarioModel(1,"Juan", "Perez", 25));
	repository.save(new UsuarioModel(2,"Maria", "Lozz", 15));
	repository.save(new UsuarioModel(3,"Lina", "Ruixs", 23));
	repository.save(new UsuarioModel(4,"Dania", "Mars", 20));
	System.out.println("Esto es lo nuevo en la web despues de update");
	// findAll heredado de la interface CrudRepository
	Iterable<UsuarioModel> todos = repository.findAll();
	System.out.println("Listar todos los Usuarios:");
	for (UsuarioModel usr : todos) {
		System.out.println("\t" + usr);
	}
	System.out.println();
	// findByEdadLessThan devuelve todos los usuarios con edades menores a la indicada
	Iterable<UsuarioModel> edades = repository.findByPrioridadLessThan(21);
	System.out.println("Usuarios con edad menor a 21");
	for (UsuarioModel usr : edades) {
		System.out.println("\t" + usr);
	}
	System.out.println();

	context.close();
	System.out.println("Esto es la salida en la web");
	*/
}

}

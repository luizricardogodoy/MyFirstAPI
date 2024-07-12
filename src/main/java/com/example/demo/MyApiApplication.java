package com.example.demo;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Usuario;
import com.example.demo.repositories.UsuarioRepository;

@SpringBootApplication
public class MyApiApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuariorepository;

	public static void main(String[] args) {
		SpringApplication.run(MyApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    Usuario u1 = new Usuario(null, "Valdil Cesar", "valdir", "123");
    Usuario u2 = new Usuario(null, "Albert Einstein", "albert", "123");
    Usuario u3 = new Usuario(null, "Homem-de-ferro", "tstark", "123");
	Usuario u4 = new Usuario(null, "Mulher-Maravilha", "pdiana","123"); 
	
	usuariorepository.saveAll(Arrays.asList(u1, u2, u3, u4));
	}

}

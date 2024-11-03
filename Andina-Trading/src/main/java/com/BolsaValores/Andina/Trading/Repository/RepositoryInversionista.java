package com.BolsaValores.Andina.Trading.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BolsaValores.Andina.Trading.model.Inversionista;

public interface RepositoryInversionista extends JpaRepository<Inversionista, Integer> {

	Optional<Inversionista> findByUsuarioAndContrasena(String usuario, String contrasena);

	Optional<Inversionista> findByUsuario(String usuario);
	
	 void deleteByUsuario(String usuario);
}

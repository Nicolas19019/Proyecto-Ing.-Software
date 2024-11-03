package com.BolsaValores.Andina.Trading.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BolsaValores.Andina.Trading.model.Comisionista;

public interface RepositoryComisionista extends JpaRepository<Comisionista, Integer>{

	Optional<Comisionista> findByUserAndContra(String user, String contra);
	
	Optional<Comisionista> findByUser(String user);
	
	 void deleteByUser(String user);
}

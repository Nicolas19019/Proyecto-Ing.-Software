package com.BolsaValores.Andina.Trading.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BolsaValores.Andina.Trading.model.Tarjeta;

public interface RepositoryTarjeta extends JpaRepository<Tarjeta, Integer> {

	Optional<Tarjeta> findByidInversionista(int idInversionista);
	
	boolean existsByidInversionista(int idInversionista);
	
	public void deleteByidInversionista(int idInversionista);
}

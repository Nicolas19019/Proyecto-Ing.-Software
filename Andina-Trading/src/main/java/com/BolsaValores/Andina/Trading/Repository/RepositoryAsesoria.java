package com.BolsaValores.Andina.Trading.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BolsaValores.Andina.Trading.model.Asesoria;

public interface RepositoryAsesoria extends JpaRepository<Asesoria, Integer> {
	public Optional<Asesoria> findByidInversionista(int idInversionista);
}

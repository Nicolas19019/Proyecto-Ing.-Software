package com.BolsaValores.Andina.Trading.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BolsaValores.Andina.Trading.model.Empresa;

public interface RepositoryEmpresa extends JpaRepository<Empresa, Integer>{
	
	public Optional<Empresa> findByNombre(String nombre);

	boolean existsByNombre(String nombre);
	
}

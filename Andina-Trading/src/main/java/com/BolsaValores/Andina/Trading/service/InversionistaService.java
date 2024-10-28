package com.BolsaValores.Andina.Trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BolsaValores.Andina.Trading.Repository.RepositoryInversionista;
import com.BolsaValores.Andina.Trading.model.Inversionista;

@Service
public class InversionistaService {

	@Autowired
	private RepositoryInversionista repo;

	public List<Inversionista> getallInversionistas() {
		return repo.findAll();
	}

	public Optional<Inversionista> getinversionistabyid(int id) {
		return repo.findById(id);
	}
	
	public Optional<Inversionista> findByUsuario(String usuario) {
		return repo.findByUsuario(usuario);
	}

	public Inversionista createInversionista(Inversionista inver) {
		return repo.save(inver);
	}

	public Inversionista updateInversionista(Inversionista inver) {
		return repo.save(inver);
	}
	
	public void deleteinversionista(int id) {
		repo.deleteById(id);
	}

	public Optional<Inversionista> findByUsuarioAndContrasena(String usuario, String contrasena) {
        return repo.findByUsuarioAndContrasena(usuario, contrasena);
    }
	
}

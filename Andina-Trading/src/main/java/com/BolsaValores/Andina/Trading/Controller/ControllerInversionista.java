package com.BolsaValores.Andina.Trading.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BolsaValores.Andina.Trading.model.Inversionista;
import com.BolsaValores.Andina.Trading.service.InversionistaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin("*")
@RestController
@RequestMapping("/inversionista")
public class ControllerInversionista {

	@Autowired
	private InversionistaService service;

	@GetMapping
	public List<Inversionista> getallInversionistas() {
		return service.getallInversionistas();
	}

	@GetMapping("/{id}")
	public Optional<Inversionista> getinversionistabyid(@PathVariable int id) {
		return service.getinversionistabyid(id);
	}

	@PostMapping("/agregar/{cedula}/{nombre}/{correo}/{contrasena}/{usuario}/{pais}")
	public Inversionista createInversionista(
	        @PathVariable int cedula,
	        @PathVariable String nombre,
	        @PathVariable String correo,
	        @PathVariable String contrasena,
	        @PathVariable String usuario,
	        @PathVariable String pais) {

	    Inversionista temp = new Inversionista();
	    temp.setCedula(cedula);
	    temp.setContrasena(contrasena);
	    temp.setCorreo(correo);
	    temp.setMonto(10000); // O el valor que consideres
	    temp.setNombre(nombre);
	    temp.setUsuario(usuario);
	    temp.setPais(pais);

	    return service.createInversionista(temp);
	}


	@PutMapping("/{id}")
	public Inversionista updateInversionista(Inversionista inver) {
		return service.createInversionista(inver);
	}

	@DeleteMapping("/{id}")
	public void deleteinversionista(int id) {
		service.deleteinversionista(id);
	}

	@GetMapping("/login")
	public ResponseEntity<String> login(@RequestParam String usuario, @RequestParam String contrasena) {
		Optional<Inversionista> inversionista = service.findByUsuarioAndContrasena(usuario, contrasena);

		if (inversionista.isPresent()) {
			return ResponseEntity.ok("Usuario autenticado correctamente.");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario o contraseña incorrectos.");
		}
	}

}

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

import com.BolsaValores.Andina.Trading.model.Comisionista;
import com.BolsaValores.Andina.Trading.service.ComisionistaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/comisionista")
public class ControllerComisionista {

	@Autowired
	private ComisionistaService service;

	@GetMapping
	public List<Comisionista> getallComisionistas() {
		return service.getallComisionistas();
	}

	@GetMapping("/{id}")
	public Optional<Comisionista> getcomisionistabyid(@PathVariable int id) {
		return service.getcomisionistabyid(id);
	}

	@PostMapping("/agregar")
	public Comisionista createComisionista(
	        @RequestParam int cedula,
	        @RequestParam String correo,
	        @RequestParam String nombre,
	        @RequestParam int comision,
	        @RequestParam String contrasena,
	        @RequestParam String usuario,
	        @RequestParam String pais) {
	    
		Comisionista comi = new Comisionista();
		comi.setCedula(cedula);
		comi.setCorreo(correo);
		comi.setNombre(nombre);
		comi.setComision(comision);
		comi.setContra(contrasena);
		comi.setUser(usuario);
		comi.setPais(pais);
	    return service.createComisionista(comi);
	}

	@PutMapping("/{id}")
	public Comisionista updateComisionista(@RequestBody Comisionista comi) {
		return service.createComisionista(comi);
	}

	@DeleteMapping("/{id}")
	public void deletecomisionista(int id) {
		service.deleteComisionista(id);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestParam String user, @RequestParam String contra) {
		Optional<Comisionista> comisionista = service.findByUserAndContra(user, contra);

		if (comisionista.isPresent()) {
			return ResponseEntity.ok("Usuario autenticado correctamente.");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario o contraseña incorrectos.");
		}
	}

}

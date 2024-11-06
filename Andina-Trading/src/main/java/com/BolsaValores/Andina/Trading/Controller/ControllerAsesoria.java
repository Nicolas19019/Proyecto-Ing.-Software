package com.BolsaValores.Andina.Trading.Controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BolsaValores.Andina.Trading.model.Asesoria;
import com.BolsaValores.Andina.Trading.service.AsesoriaService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/asesoria")
public class ControllerAsesoria {
	
	@Autowired
	private AsesoriaService service;
	
	
	@GetMapping
	public List<Asesoria> getallAsesorias() {
		return service.getallAsesorias();
	}

	@GetMapping("/{id}")
	public Optional<Asesoria> getAsesoriabyid(@PathVariable int id) {
		return service.getAsesoriabyid(id);
	}

	@PostMapping("/agregar")
	public Asesoria createComisionista(
	        @RequestParam int idComisionista,
	        @RequestParam int idInversionista,
	        @RequestParam double montoPagado,
	        @RequestParam Date fecha,
	        @RequestParam String hora) {
	    
		Asesoria asesoria = new Asesoria();
		asesoria.setFecha(fecha);
		asesoria.setIdComisionista(idComisionista);
		asesoria.setIdInversionista(idInversionista);
		asesoria.setMontoPagado(montoPagado);
		asesoria.setHora(hora);
	    return service.createAsesoria(asesoria);
	}
	
	@GetMapping("/informacion/{idInversionista}")
	public ResponseEntity<Asesoria> getAsesoriaByIdInversionista(@PathVariable int idInversionista) {
	    Optional<Asesoria> asesoria = service.findByidInversionista(idInversionista);

	    return asesoria.map(ResponseEntity::ok)
	                   .orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PutMapping("/actualizarAsesoria/{idInversionista}")
	public ResponseEntity<Asesoria> updateAsesoriaByIdInversionista(
	        @PathVariable int idInversionista,
	        @RequestParam int idComisionista,
	        @RequestParam Date fecha,
	        @RequestParam String hora) {

	    Optional<Asesoria> optionalAsesoria = service.findByidInversionista(idInversionista);

	    if (optionalAsesoria.isEmpty()) {
	        return ResponseEntity.notFound().build();
	    }

	    Asesoria asesoria = optionalAsesoria.get();
	    asesoria.setIdComisionista(idComisionista);
	    asesoria.setFecha(fecha);
	    asesoria.setHora(hora);

	    Asesoria updatedAsesoria = service.updateAsesoria(asesoria);
	    return ResponseEntity.ok(updatedAsesoria);
	}

}

package com.BolsaValores.Andina.Trading.Controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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


import com.BolsaValores.Andina.Trading.model.Tarjeta;
import com.BolsaValores.Andina.Trading.service.TarjetaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Tarjeta")
public class ControllerTarjeta {

	@Autowired
	private TarjetaService service;

	@GetMapping
	public List<Tarjeta> getallTarjeta() {
		return service.getallTarjeta();
	}

	@GetMapping("/existe")
	public ResponseEntity<?> verificarTarjetaExistente(@RequestParam int idInversionista) {

		boolean tieneTarjeta = service.tieneTarjeta(idInversionista);

		return ResponseEntity.ok().body(Map.of("tieneTarjeta", tieneTarjeta));
	}

	@GetMapping("/{id}")
	public Optional<Tarjeta> getTarjetabyid(@PathVariable int id) {
		return service.getTarjetabyid(id);
	}
	
	@GetMapping("/info/{idinversionista}")
	public Optional<Tarjeta> getTarjetabyidinversionista(@PathVariable int idinversionista) {
		return service.getTarjetabyidinversionista(idinversionista);
	}

	@PostMapping("/agregar")
	public Tarjeta createTarjeta(@RequestParam int id_inversionista, @RequestParam String numero_tarjeta,
			@RequestParam String nombre_titular, @RequestParam String fecha_vencimiento, @RequestParam int cvv) {

		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setCvv(cvv);
		tarjeta.setFecha_vencimiento(fecha_vencimiento);
		tarjeta.setIdInversionista(id_inversionista);
		tarjeta.setNombre_titular(nombre_titular);
		tarjeta.setNumero_tarjeta(numero_tarjeta);
		tarjeta.setTipo_tarjeta("Visa");
		return service.createTarjeta(tarjeta);
	}

	@DeleteMapping("/{id}")
	public void deleteTarjeta(int id) {
		service.deleteTarjeta(id);
	}

	
	@PutMapping("/{idInversionista}")
	public ResponseEntity<Tarjeta> actualizarPais(@RequestParam int idInversionista , @RequestParam String numero_tarjeta,
			@RequestParam String nombre_titular, @RequestParam String fecha_vencimiento, @RequestParam int cvvs) {
		Optional<Tarjeta> optionalTar = service.getTarjetabyidinversionista(idInversionista);

		if (optionalTar.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		Tarjeta tarjeta = optionalTar.get();
		tarjeta.setCvv(cvvs);
		tarjeta.setFecha_vencimiento(fecha_vencimiento);
		tarjeta.setIdInversionista(idInversionista);
		tarjeta.setNombre_titular(nombre_titular);
		tarjeta.setNumero_tarjeta(numero_tarjeta);
		tarjeta.setTipo_tarjeta("visa");

		Tarjeta tarjetaactualizada = service.updateTarjeta(tarjeta);
		return ResponseEntity.ok(tarjetaactualizada);
	}

}

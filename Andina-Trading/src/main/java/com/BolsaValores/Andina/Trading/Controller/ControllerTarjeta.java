package com.BolsaValores.Andina.Trading.Controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("/{id}")
	public Optional<Tarjeta> getTarjetabyid(@PathVariable int id) {
		return service.getTarjetabyid(id);
	}

	@PostMapping("/agregar")
	public Tarjeta createTarjeta(@RequestParam int id_inversionista, @RequestParam String numero_tarjeta,
			@RequestParam String nombre_titular, @RequestParam Date fecha_vencimiento,
			 @RequestParam int cvv) {

		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setCvv(cvv);
		tarjeta.setFecha_vencimiento(fecha_vencimiento);
		tarjeta.setId_inversionista(id_inversionista);
		tarjeta.setNombre_titular(nombre_titular);
		tarjeta.setNumero_tarjeta(numero_tarjeta);
		tarjeta.setTipo_tarjeta("Visa");
		return service.createTarjeta(tarjeta);
	}

	@DeleteMapping("/{id}")
	public void deleteTarjeta(int id) {
		service.deleteTarjeta(id);
	}

	@PutMapping("/{id}")
	public Tarjeta updateTarjeta(@PathVariable int id, @RequestBody Tarjeta tarjeta) {
		return service.updateTarjeta(tarjeta);
	}

}

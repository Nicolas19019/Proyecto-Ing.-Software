package com.BolsaValores.Andina.Trading.Controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

import com.BolsaValores.Andina.Trading.model.Factura;
import com.BolsaValores.Andina.Trading.service.FacturacionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/facturacion")
public class ControllerFacturacion {
	
	@Autowired
	private FacturacionService service;

	@GetMapping
	public List<Factura> getallFacturas() {
		return service.getallFacturas();
	}

	@GetMapping("/{id}")
	public Optional<Factura> getFacturabyid(@PathVariable int id) {
		return service.getFacturabyid(id);
	}
	
	@GetMapping("/estado/{estado}")
	public List<Factura> getFacturabyid(@PathVariable String estado) {
		return service.getFacturabyestado(estado);
	}
	
	@GetMapping("/lista/{id_inversionsita}")
	public List<Factura> getFacturabyidinversionista(@PathVariable int id_inversionsita) {
		return service.getFacturabyidinversionista(id_inversionsita);
	}

	@PostMapping("/agregar")
	public ResponseEntity<Integer> createFactura(
	        @RequestParam int id_inversionista,
	        @RequestParam Date fecha_factura,
	        @RequestParam double total,
	        @RequestParam String estado) {

	    Factura fact = new Factura();
	    fact.setEstado(estado);
	    fact.setFecha_factura(fecha_factura);
	    fact.setId_inversionista(id_inversionista);
	    fact.setTotal(total);

	    Factura nuevaFactura = service.createFactura(fact); // Asegúrate de que este método devuelva la factura con ID

	    return ResponseEntity.ok(nuevaFactura.getId_factura()); // Devuelve la factura creada con el ID
	}

	@PutMapping("/{id}")
	public Factura updateFactura(@PathVariable int id, @RequestBody Factura factura) {
		return service.updateFactura(factura);
	}
}

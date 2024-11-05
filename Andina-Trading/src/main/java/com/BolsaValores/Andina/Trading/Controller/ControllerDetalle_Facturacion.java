package com.BolsaValores.Andina.Trading.Controller;

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

import com.BolsaValores.Andina.Trading.model.Detalle_Facturacion;
import com.BolsaValores.Andina.Trading.service.Detalle_Facturacion_Service;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/detallefacturacion")
public class ControllerDetalle_Facturacion {

	@Autowired
	private Detalle_Facturacion_Service service;

	@GetMapping
	public List<Detalle_Facturacion> getallDetalle_Facturacion() {
		return service.getallDetalle_Facturacion();
	}

	@GetMapping("/{id}")
	public Optional<Detalle_Facturacion> getDetalle_Facturacionyid(@PathVariable int id) {
		return service.getDetalle_Facturacionyid(id);
	}

	@PostMapping("/agregar")
	public Detalle_Facturacion createDetalle_Facturacion(@RequestParam int id_factura,
			@RequestParam String nombre_accion, @RequestParam int cantidad, @RequestParam double valor) {

		Detalle_Facturacion deta_facturas = new Detalle_Facturacion();
		deta_facturas.setCantidad(cantidad);
		deta_facturas.setId_factura(id_factura);
		deta_facturas.setNombre_accion(nombre_accion);
		deta_facturas.setValor(valor);
		return service.createDetalle_Facturacion(deta_facturas);
	}

	@DeleteMapping("/{id}")
	public void deleteDetalle_Facturacion(int id) {
		service.deleteDetalle_Facturacion(id);
	}

	@PutMapping("/{id}")
	public Detalle_Facturacion updateDetalle_Facturacion(@PathVariable int id, @RequestBody Detalle_Facturacion detalle) {
		return service.updateDetalle_Facturacion(detalle);
	}

}

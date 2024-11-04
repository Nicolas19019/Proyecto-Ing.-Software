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

import com.BolsaValores.Andina.Trading.model.Empresa;
import com.BolsaValores.Andina.Trading.service.EmpresaService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/empresa")
public class ControllerEmpresa {

	@Autowired
	private EmpresaService service;

	@GetMapping
	public List<Empresa> getallEmpresas() {
		return service.getallEmpresas();
	}

	@GetMapping("/{id}")
	public Optional<Empresa> getEmpresabyid(@PathVariable int id) {
		return service.getEmpresabyid(id);
	}

	@PostMapping("/agregar")
	public Empresa createEmpresa(@RequestParam int valorAccion, @RequestParam String nombre) {

		Empresa empresa = new Empresa();
		empresa.setNombre(nombre);
		empresa.setValorAccion(valorAccion);
		return service.createEmpresa(empresa);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmpresa(int id) {
		service.deleteEmpresa(id);
	}
	
	@PutMapping("/{id}")
	public Empresa updateCliente(@PathVariable int id, @RequestBody Empresa empresaDetails) {
		return service.updateEmpresa(empresaDetails);
	}

}

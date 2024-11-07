package com.BolsaValores.Andina.Trading.Controller;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BolsaValores.Andina.Trading.model.Empresa;
import com.BolsaValores.Andina.Trading.model.Tarjeta;
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
	
	@GetMapping("/buscar/{nombre}")
	public Optional<Empresa> getEmpresabynombre(@PathVariable String nombre) {
		return service.getEmpresabynombre(nombre);
	}
	
	@GetMapping("/existe")
	public ResponseEntity<?> verificarEmpresa(@RequestParam String nombre){
		boolean existeEmpresa = service.existeEmpresa(nombre);
		
		return ResponseEntity.ok().body(Map.of("La empresa existe", existeEmpresa));
	}

	@PostMapping("/agregar")
	public Empresa createEmpresa(@RequestParam double valorAccion, @RequestParam String nombre) {

		Empresa empresa = new Empresa();
		empresa.setNombre(nombre);
		empresa.setValorAccion(valorAccion);
		return service.createEmpresa(empresa);
	}
	
	@DeleteMapping("/{idEmpresa}")
	public void deleteEmpresa(int idEmpresa) {
		service.deleteEmpresa(idEmpresa);
	}
	
	
	@PutMapping("/{idEmpresa}")
	public ResponseEntity<Empresa> actualizarEmpresa(@RequestParam int idEmpresa , @RequestParam double valorAccion, @RequestParam String nombre) {
		Optional<Empresa> optionalEmp = service.getEmpresabyid(idEmpresa);

		if (optionalEmp.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		Empresa empresa = optionalEmp.get();
		empresa.setValorAccion(valorAccion);
		empresa.setNombre(nombre);

		Empresa empresaactualizada = service.updateEmpresa(empresa);
		return ResponseEntity.ok(empresaactualizada);
	}

}

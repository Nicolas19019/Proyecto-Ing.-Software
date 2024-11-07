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

import com.BolsaValores.Andina.Trading.model.Inver_Empresa;
import com.BolsaValores.Andina.Trading.service.Inver_EmpresaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/inversiones")
public class ControllerInver_Empresa {

	@Autowired
	private Inver_EmpresaService service;

	@GetMapping
	public List<Inver_Empresa> getallInversion() {
		return service.getallInversion();
	}

	@GetMapping("/{id}")
	public Optional<Inver_Empresa> getInversionbyid(@PathVariable int id) {
		return service.getInversionbyid(id);
	}

	@GetMapping("/existe")
	public ResponseEntity<?> verificarInversion(@RequestParam int idEmpresa) {
		boolean existeEmpresa = service.existeInversion(idEmpresa);

		return ResponseEntity.ok().body(Map.of("La empresa existe", existeEmpresa));
	}

	@PostMapping("/agregar")
	public Inver_Empresa createInversion(@RequestParam int idEmpresa, @RequestParam int idInversionista,
			@RequestParam double porcentaje) {

		Inver_Empresa inversiones = new Inver_Empresa();
		inversiones.setIdEmpresa(idEmpresa);
		inversiones.setIdInversionista(idInversionista);
		inversiones.setPorcentaje(porcentaje);
		return service.createInversion(inversiones);
	}

	@DeleteMapping("/{id}")
	public void deleteInversion(int id) {
		service.deleteInversion(id);
	}

	@PutMapping("/{id}")
	public Inver_Empresa updateInversion(@PathVariable int id, @RequestBody Inver_Empresa empresaDetails) {
		return service.updateInversion(empresaDetails);
	}

}

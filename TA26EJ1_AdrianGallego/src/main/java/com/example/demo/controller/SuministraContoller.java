package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Suministra;
import com.example.demo.service.SuminsitraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraContoller {
	
	@Autowired
	SuminsitraServiceImpl sSer;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministra() {
		return sSer.listarSuministros();
	}
	
	@GetMapping("/suministra/{id}")
	public Suministra listarSuministraById(@PathVariable(name="id") Integer id) {
		return sSer.listarByIdSuministros(id);
	}
	
	@PostMapping("/suministra")
	public Suministra guardarNuevo(@RequestBody Suministra s) {
		return sSer.guardarNuevo(s);
	}
	
	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name="id") Integer id, @RequestBody Suministra s) {
		Suministra s1 = sSer.listarByIdSuministros(id);
		Suministra s2 = new Suministra();
		
		s1.setId(s.getId());
		s1.setPieza(s.getPieza());
		s1.setProveedor(s.getProveedor());
		s1.setPrecio(s.getPrecio());
		
		s2 = sSer.actualizarSuministra(s1);
		
		return s2;
	}
	
	@DeleteMapping("/suministra/{id}")
	public void deleteSuministra(@PathVariable(name="id") Integer id) {
		sSer.deleteSuministra(id);
	}

}

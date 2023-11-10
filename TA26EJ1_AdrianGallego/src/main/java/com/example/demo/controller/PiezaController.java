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

import com.example.demo.dto.Pieza;
import com.example.demo.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl pSer;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return pSer.listarPiezas();
	}
	
	@GetMapping("/piezas/{id}")
	public Pieza listarPiezasById(@PathVariable(name="id") Integer id){
		return pSer.listarPiezaById(id);
	}
	
	@PostMapping("/piezas")
	public Pieza guardarNuevo(@RequestBody Pieza p) {
		return pSer.guardarNuevo(p);	
	}
	
	@PutMapping("/piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name="id") Integer id, @RequestBody Pieza p) {
		Pieza p1 = pSer.listarPiezaById(id);
		Pieza p2 = new Pieza();
		
		p1.setCodigo(p.getCodigo());
		p1.setNombre(p.getNombre());
		
		p2 = pSer.actualizarPieza(p1);
		
		return p2;	
	}
	
	@DeleteMapping("/piezas{id}")
	public void deletePieza(@PathVariable(name="id") Integer id) {
		pSer.deletePieza(id);
	}
}

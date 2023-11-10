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

import com.example.demo.dto.Proveedor;
import com.example.demo.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedorServiceImpl pSer;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores(){
		return pSer.listarProveedores();
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedor listarProveedorById(@PathVariable(name="id") Integer id) {
		return pSer.listarProveedorById(id);
	}
	
	@PostMapping("/proveedores")
	public Proveedor guardarNuevo(@RequestBody Proveedor p) {
		return pSer.guardarNuevo(p);
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id") Integer id, @RequestBody Proveedor p) {
		Proveedor p1 = pSer.listarProveedorById(id);
		Proveedor p2 = new Proveedor();
		
		p1.setId(p.getId());
		p1.setNombre(p.getNombre());
		
		p2 = pSer.actualizarProveedor(p1);
		
		return p2;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void deleteProveedor(@PathVariable(name="id") Integer id) {
		pSer.eliminarProveedor(id);
	}

}

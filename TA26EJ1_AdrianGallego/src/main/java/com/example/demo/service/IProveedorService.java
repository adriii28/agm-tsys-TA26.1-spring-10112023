package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proveedor;

public interface IProveedorService {
	
	public List<Proveedor> listarProveedores();
	
	public Proveedor listarProveedorById(Integer id);
	
	public Proveedor guardarNuevo(Proveedor p);
	
	public Proveedor actualizarProveedor(Proveedor p);
	
	public void eliminarProveedor(Integer id);

}

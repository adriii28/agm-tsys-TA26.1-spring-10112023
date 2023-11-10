package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProveedorDAO;
import com.example.demo.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService{

	@Autowired
	IProveedorDAO dao;

	@Override
	public List<Proveedor> listarProveedores() {
		return dao.findAll();
	}

	@Override
	public Proveedor listarProveedorById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Proveedor guardarNuevo(Proveedor p) {
		return dao.save(p);
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor p) {
		return dao.save(p);
	}

	@Override
	public void eliminarProveedor(Integer id) {
		dao.deleteById(id);
	}

}

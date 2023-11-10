package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPiezaDAO;
import com.example.demo.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService{
	
	@Autowired
	IPiezaDAO dao;

	@Override
	public List<Pieza> listarPiezas() {
		return dao.findAll();
	}

	@Override
	public Pieza listarPiezaById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Pieza guardarNuevo(Pieza p) {
		return dao.save(p);
	}

	@Override
	public Pieza actualizarPieza(Pieza p) {
		return dao.save(p);
	}

	@Override
	public void deletePieza(Integer id) {
		dao.deleteById(id);;
	}
	
	
	

}

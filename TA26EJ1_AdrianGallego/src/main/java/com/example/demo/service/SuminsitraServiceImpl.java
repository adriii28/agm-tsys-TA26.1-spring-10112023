package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISuministraDAO;
import com.example.demo.dto.Suministra;

@Service
public class SuminsitraServiceImpl implements ISuministraService{

	@Autowired
	ISuministraDAO dao;
	
	@Override
	public List<Suministra> listarSuministros() {
		return dao.findAll();
	}

	@Override
	public Suministra listarByIdSuministros(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Suministra guardarNuevo(Suministra suministra) {
		return dao.save(suministra);
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		return dao.save(suministra);
	}

	@Override
	public void deleteSuministra(Integer id) {
		dao.deleteById(id);
	}

}

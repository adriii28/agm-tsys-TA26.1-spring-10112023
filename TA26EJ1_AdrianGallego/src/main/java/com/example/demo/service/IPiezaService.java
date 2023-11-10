package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pieza;

public interface IPiezaService {

	public List<Pieza> listarPiezas();
	
	public Pieza listarPiezaById(Integer id);
	
	public Pieza guardarNuevo(Pieza p);
	
	public Pieza actualizarPieza(Pieza p);
	
	public void deletePieza(Integer id);
	
}

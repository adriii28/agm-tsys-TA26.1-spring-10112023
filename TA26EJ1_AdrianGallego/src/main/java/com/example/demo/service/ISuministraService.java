package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Suministra;

public interface ISuministraService {
	
	public List<Suministra> listarSuministros();
	
	public Suministra listarByIdSuministros(Integer id);
	
	public Suministra guardarNuevo(Suministra suministra);
	
	public Suministra actualizarSuministra(Suministra suministra);
	
	public void deleteSuministra(Integer id);

}

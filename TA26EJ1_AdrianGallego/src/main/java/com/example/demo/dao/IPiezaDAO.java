package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Pieza;

@Repository
public interface IPiezaDAO extends JpaRepository<Pieza, Integer>{

}

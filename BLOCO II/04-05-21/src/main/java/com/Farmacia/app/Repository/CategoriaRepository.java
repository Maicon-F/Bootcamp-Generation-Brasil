package com.Farmacia.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farmacia.app.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
	
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
	
}
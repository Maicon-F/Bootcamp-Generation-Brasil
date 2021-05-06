package com.LojaDeGames.LojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojaDeGames.LojaDeGames.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> { // this interface inherits methods
	
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome); // this is a particular method created with the help of JPA Library but that doesnt exist there
	
}

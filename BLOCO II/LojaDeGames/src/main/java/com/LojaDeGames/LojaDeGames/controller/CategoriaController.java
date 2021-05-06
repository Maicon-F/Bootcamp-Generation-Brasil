package com.LojaDeGames.LojaDeGames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.LojaDeGames.LojaDeGames.Repository.CategoriaRepository;
import com.LojaDeGames.LojaDeGames.model.Categoria;

@RequestMapping("/categoria")
@RestController
@CrossOrigin("*")
public class CategoriaController {

	//1. this allows to use repository methods on execution time
	@Autowired
	public CategoriaRepository repositorioC;

	// ======= GET METHODS =======

	//2. this method returns all elements out of the table Categoria from their id
	@GetMapping
	public List<Categoria> getAll() {
		return repositorioC.findAll();
	}

	//3. this method returns an element out of the table Categoria from its ID
	@GetMapping("/{id}")
	public Optional<Categoria> getById(@PathVariable long id) {
		return repositorioC.findById(id); // if it doesn't find the element, it will generate an exception
	}

	//4. this method searches for a categoria by typing its name
	@GetMapping("/nome/{nome}")
	public List<Categoria> getByNome(String nome) {
		return repositorioC.findAllByNomeContainingIgnoreCase(nome);
	}

	// ======= SAVE =======

	//5. This method creates a new categoria on your database
	@PostMapping
	// @ResponseStatus(HttpStatus.CREATED) not implemented yet
	public Categoria save(@RequestBody Categoria categoria) {
		return repositorioC.save(categoria);
	}

	//6. ======= UPDATE =======
	// This method creates a new categoria on your database
	@PutMapping
	// @ResponseStatus(HttpStatus.ACCEPTED) not implemented yet
	public Categoria update(@RequestBody Categoria categoria) {
		return repositorioC.save(categoria);
	}

	//7. ======= DELETE =======
	// This method creates a new categoria on your database
	@DeleteMapping("/{id}")
	// @ResponseStatus(HttpStatus.CREATED) not implemented yet
	public void delete(@PathVariable long id) {
		repositorioC.deleteById(id);
	}

}

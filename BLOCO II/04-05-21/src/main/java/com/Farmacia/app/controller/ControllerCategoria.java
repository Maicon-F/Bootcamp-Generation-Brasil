package com.Farmacia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Farmacia.app.Repository.CategoriaRepository;
import com.Farmacia.app.model.Categoria;



@RestController
@CrossOrigin("*")
@RequestMapping("/categoria")
public class ControllerCategoria {
	
	@Autowired
	private CategoriaRepository repositorio;
	
	@GetMapping
	public ResponseEntity <List<Categoria>> getAll(){
		return ResponseEntity.ok(repositorio.findAll());
	}
		
	@GetMapping("/{id}")	
	public ResponseEntity <Categoria> getById(@PathVariable long id){
		return repositorio.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());		
	}
	
	
	
	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(categoria));
	}

	
	@PutMapping 
	public ResponseEntity <Categoria> put (@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(repositorio.save(categoria));
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositorio.deleteById(id);
	}

	

}

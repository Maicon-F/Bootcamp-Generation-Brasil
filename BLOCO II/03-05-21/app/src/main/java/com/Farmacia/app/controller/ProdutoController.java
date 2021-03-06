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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Farmacia.app.Repository.ProdutoRepository;
import com.Farmacia.app.model.Produto;




	@RestController
	@RequestMapping("/produtos")
	@CrossOrigin("*")
	public class ProdutoController {

		@Autowired
		private ProdutoRepository repositorio;

		@GetMapping
		public ResponseEntity<List<Produto>> GetAll() {
			return ResponseEntity.ok(repositorio.findAll());				
		}

		@GetMapping({"/{id}"})
		public ResponseEntity<Produto> GetById(@PathVariable long id) {
			return repositorio.findById(id).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
		}

		@GetMapping("/pesquisa") // Acha por descrição
		public ResponseEntity<List<Produto>> Pesquisar(@RequestParam(defaultValue = "") String nome, @RequestParam(defaultValue = "") String descricao ){
			List<Produto> listaProdutos = repositorio.findAllByProdutoContainingIgnoreCaseAndDescricaoContainingIgnoreCase(nome, descricao);
			
			if (listaProdutos.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
				else {
					return ResponseEntity.status(HttpStatus.ACCEPTED).body(listaProdutos);
				}
			}
		
		
		
		@PostMapping
		public ResponseEntity<Produto> post(@RequestBody Produto produto) {
			return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(produto));
		}

		@PutMapping
		public ResponseEntity<Produto> put(@RequestBody Produto produto) {
			return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(produto));
		}

		@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) {
			repositorio.deleteById(id);
		}

	}




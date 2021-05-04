package com.Farmacia.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farmacia.app.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	
	public List<Produto> findAllByProdutoContainingIgnoreCaseAndDescricaoContainingIgnoreCase(String produto, String descricao);
	
						

}

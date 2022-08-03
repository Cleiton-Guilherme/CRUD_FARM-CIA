package br.com.generation.farmacia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.generation.farmacia.model.Produto;


@Repository
public class ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}

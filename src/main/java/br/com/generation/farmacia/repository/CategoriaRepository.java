package br.com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.generation.farmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByContainingIgnoreCase(@Param ("descrição") String descricao;

}

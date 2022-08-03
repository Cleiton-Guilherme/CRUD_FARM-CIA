package br.com.generation.farmacia.model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@GenerateValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 255)
	private String nome;
	
	@Size(min = 3, max =255)
	private String descricao;
	
	@OneToMany(mappedby = "categoria", cascade = cascadeType.REMOVE)
	@JsonIgnoreProperties("Categoria")
	private List<Produto> produtos;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public List<Produto> getProduto() {
		return produtos;
	}


	public void setProduto(List<Produto> produto) {
		this.produtos = produto;
	}
	
	
	

}

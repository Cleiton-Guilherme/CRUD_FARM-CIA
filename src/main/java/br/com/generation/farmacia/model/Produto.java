package br.com.generation.farmacia.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GenerateValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Nome é obrigatório!")
	@Size(min = 3, max = 255)
	private String nome;
	
	@NotBlank(message = "Descrição é obrigatório!")
	@Size(min = 3, max = 255)
	private String descricao;
	
	private Double preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private  Categoria categoria;

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


package com.java.demo.apiv1;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class ProductsDTO {

	// anotação diz que seu json vai vim com o nome do value
	@JsonProperty(value = "id")
	@JsonIgnore
	private Long id;
	@JsonProperty(value = "entity_id")
	private String entityId;
	@JsonProperty(value = "title")
	private String nome;
	@JsonProperty(value = "price")
	private BigDecimal preco;
	@JsonProperty(value = "category")
	private String categoria;
	@JsonProperty(value = "description")
	private String descricao;
	@JsonProperty(value = "image")
	private String imagem;
	
	
	
	
	public ProductsDTO(Long id, String nome, BigDecimal preco, String categoria, String descricao, String imagem) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.descricao = descricao;
		this.imagem = imagem;
	}
	public ProductsDTO() {
		// TODO Auto-generated constructor stub
	}
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
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	
	
	
	
}

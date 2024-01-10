package com.java.demo.infrastructure.business.entities;

//import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
//import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "ProdutoEntity")
@Table(name = "produtos")

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProdutoEntity {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "title", length = 800)
    private String nome;
    @Column(name = "price")
    private BigDecimal preco;
    @Column(name = "category", length = 800)
    private String categoria;
    @Column(name = "description", length = 800)
    private String descricao;
    @Column(name = "image", length = 800)
    private String imagem;
    @Column(name = "data_inclusao")
    private LocalDateTime dataInclusao;
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;
	public String getId() {
		return id;
	}


	public void setId(String id) {
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


	public LocalDateTime getDataInclusao() {
		return dataInclusao;
	}


	public void setDataInclusao(LocalDateTime dataInclusao) {
		this.dataInclusao = dataInclusao;
	}


	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}


	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
    
    
    

	
}
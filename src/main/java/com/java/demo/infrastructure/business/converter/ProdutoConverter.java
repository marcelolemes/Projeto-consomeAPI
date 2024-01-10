package com.java.demo.infrastructure.business.converter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.java.demo.apiv1.ProductsDTO;
import com.java.demo.infrastructure.business.entities.ProdutoEntity;

@Component
public class ProdutoConverter {
	
	

	public ProdutoEntity toEntity(ProductsDTO dto) {
        ProdutoEntity produtoEntity = new ProdutoEntity();
        produtoEntity.setId(String.valueOf(UUID.randomUUID()));
        produtoEntity.setNome(dto.getNome());
        produtoEntity.setCategoria(dto.getCategoria());
        produtoEntity.setDescricao(dto.getDescricao());
        produtoEntity.setPreco(dto.getPreco());
        produtoEntity.setImagem(dto.getImagem());
        produtoEntity.setDataInclusao(LocalDateTime.now());
        return produtoEntity;
    }
	 
	 
	public  ProductsDTO toDTO(ProdutoEntity entity) {
        ProductsDTO productsDTO = new ProductsDTO();
       // productsDTO.setId(entity.getId()); // Altere conforme necessário
        productsDTO.setEntityId(entity.getId());
        productsDTO.setNome(entity.getNome());
        productsDTO.setPreco(entity.getPreco());
        productsDTO.setCategoria(entity.getCategoria());
        productsDTO.setDescricao(entity.getDescricao());
        productsDTO.setImagem(entity.getImagem());
        return productsDTO;
    }	 
	 
	  public List<ProductsDTO> toListDTO(List<ProdutoEntity> entityList) {
	       return entityList.stream().map(this::toDTO).toList();
	    }

}  
package com.java.demo.infrastructure.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.demo.apiv1.ProductsDTO;
import com.java.demo.infrastructure.business.converter.ProdutoConverter;
import com.java.demo.infrastructure.business.entities.ProdutoEntity;
import com.java.demo.infrastructure.business.repositories.ProdutoRepository;

public class ProdutoService {

	@Autowired
    private  ProdutoRepository repository;
	@Autowired
    private  ProdutoConverter converter;
   

    public ProdutoEntity salvaProdutos(ProdutoEntity entity) throws Exception {
        try{
            return repository.save(entity);
        } catch (Exception e) {
            throw new Exception("Erro ao buscar produto por nome %s");
        }
    }

    public ProductsDTO salvaProdutoDTO(ProductsDTO dto) throws Exception {
        
            ProdutoEntity entity = converter.toEntity(dto);
            return converter.toDTO(repository.save(entity));
       
    }
    
    public List<ProductsDTO> buscaTodosProdutos() throws Exception {
        try {
            return converter.toListDTO(repository.findAll());
        }catch (Exception e) {
            throw new Exception("Erro ao buscar produto por nome %s");
        }
    }

	
    
    
}   
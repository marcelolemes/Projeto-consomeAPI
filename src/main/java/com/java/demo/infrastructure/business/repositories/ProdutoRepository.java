package com.java.demo.infrastructure.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.demo.infrastructure.business.entities.ProdutoEntity;

import jakarta.transaction.Transactional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, String> {

    ProdutoEntity findByNome(String nome);

    @Transactional
    void deleteByNome(String nome);
}
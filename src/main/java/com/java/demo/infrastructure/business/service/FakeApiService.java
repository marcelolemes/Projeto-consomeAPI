package com.java.demo.infrastructure.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.demo.apiv1.ProductsDTO;
import com.java.demo.infrastructure.client.FakeApiClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FakeApiService {

	@Autowired
	private  FakeApiClient cliente ;

	public List<ProductsDTO> buscaProdutos() {

		return cliente.buscaListaProdutos();
	}

}

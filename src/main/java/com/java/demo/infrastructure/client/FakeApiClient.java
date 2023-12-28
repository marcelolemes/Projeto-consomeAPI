package com.java.demo.infrastructure.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.demo.apiv1.ProductsDTO;

@FeignClient(value = "fake-api-externa", url = "${fake-api.url:#{null}}")
public interface FakeApiClient {

// get na api funciona como repository
	
	@GetMapping("/products")
    List<ProductsDTO> buscaListaProdutos();
	
}

package com.java.demo.apiv1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.demo.infrastructure.business.service.FakeApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
@Tag(name = "fake-api-externa")
public class FakeApiController {

	@Autowired
	private  FakeApiService service;
	
	 @Operation(summary = "Busca todoso os produtos", method ="GET")
	  @ApiResponses(value = {
	            @ApiResponse(responseCode = "200", description = "Produto salvo com sucesso"),
	            @ApiResponse(responseCode = "500", description = "Erro ao salvar os produtos"),
	    })
	 @GetMapping("/")
	    public ResponseEntity<List<ProductsDTO>> buscaTodosProdutos(){

	        return ResponseEntity.ok(service.buscaProdutos());
	    }
	
	
}

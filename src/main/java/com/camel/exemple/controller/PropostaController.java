package com.camel.exemple.controller;

import org.apache.camel.FluentProducerTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.camel.exemple.dto.DadosSimulacaoDTO;
import com.camel.exemple.dto.PropostaDTO;

import lombok.AllArgsConstructor;

@RestController
public class PropostaController {

	private final FluentProducerTemplate fluentProducerTemplate;
	
	public PropostaController(FluentProducerTemplate fluentProducerTemplate) {
		this.fluentProducerTemplate = fluentProducerTemplate;
		}
	
	@GetMapping("/get-proposta")
	public String getProposta() {
		return fluentProducerTemplate.to("direct:getProposta").request(String.class);
	}
	
	@PostMapping("/post-proposta")
	public ResponseEntity<?> postProposta(@RequestBody DadosSimulacaoDTO dadosSimulacao) {
		return   new ResponseEntity<>(fluentProducerTemplate
											.withBody(dadosSimulacao)
											.withHeader("header", dadosSimulacao)
											.to("direct:gerar-simulacao")
											.request(PropostaDTO.class), 
										HttpStatus.OK) ;
	}
}

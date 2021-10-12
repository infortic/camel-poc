package com.camel.exemple.rest;

import org.apache.camel.FluentProducerTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CamelRest {

	private final FluentProducerTemplate fluentProducerTemplate;

	public CamelRest(FluentProducerTemplate fluentProducerTemplate) {
		this.fluentProducerTemplate = fluentProducerTemplate;
	}
	
	@GetMapping("/teste")
	public String teste() {
		return fluentProducerTemplate.to("direct:teste").request(String.class);
	}
	
	
}

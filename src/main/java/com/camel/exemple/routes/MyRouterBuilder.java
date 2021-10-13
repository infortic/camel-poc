package com.camel.exemple.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.camel.exemple.process.ValidaDadosProcess;

@Component
public class MyRouterBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("direct:getProposta")
				.log("Entrou na rota 'getProposta'")
				.setBody()
				.constant("...")
				.end();
		
		
		from("direct:gerar-simulacao")
		.log("Entrou na rota 'getProposta'")
		.process(new ValidaDadosProcess())
		.end();
		
		
	}

}

package com.camel.exemple.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouterBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("direct:teste")
				.log("deu certo porra!!")
				.setBody()
				.constant("Deu certo agora, bota fé?")
				.end();
		
	}

}

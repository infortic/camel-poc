package com.camel.exemple.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.camel.exemple.dto.DadosSimulacaoDTO;
import com.camel.exemple.dto.PropostaDTO;

public class ValidaDadosProcess implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		
		DadosSimulacaoDTO dadosSimulacao = (DadosSimulacaoDTO) exchange.getIn().getBody();
		
	//	PropostaDTO proposta = 
	}
	
}

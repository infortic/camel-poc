package com.camel.exemple.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropostaDTO {

	private String name;
	private Integer cpf;
	private Integer numberOfPlots;
	private BigDecimal amountToBeFinanced = new BigDecimal(0);
	private BigDecimal taxaJuros = new BigDecimal(0);
	private BigDecimal valorParcela = new BigDecimal(0);
	private BigDecimal valorFinal = new BigDecimal(0);
	
	public PropostaDTO preencherPropostaComDadosSimulacao(DadosSimulacaoDTO dadosSimulacao) {
		return new PropostaDTO.PropostaDTOBuilder()
						.name(dadosSimulacao.getName())
						.cpf(dadosSimulacao.getCpf())
						.numberOfPlots(dadosSimulacao.getNumberOfPlots())
						.amountToBeFinanced(dadosSimulacao.getAmountToBeFinanced())
						.taxaJuros(this.taxaJuros)
						.valorParcela(this.valorParcela)
						.valorFinal(this.valorFinal)
						.build();
	}
}

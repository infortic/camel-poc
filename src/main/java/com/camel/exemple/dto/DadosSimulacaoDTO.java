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
public class DadosSimulacaoDTO {

	private String name;
	private Integer cpf;
	private Integer numberOfPlots;
	private BigDecimal amountToBeFinanced;

	
	
}

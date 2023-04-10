package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		//Chain of Responsibility
		Desconto desconto = new DescontoParaOrcamentoComMaisdeCincoItens(
				new DescontoParaOrcamentoComValorAcimaQueQuinhentos(
						new SemDesconto()
						)
				);
		
		return desconto.calcular(orcamento);
	}
}

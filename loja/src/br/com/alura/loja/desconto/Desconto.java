package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}
	
	//Template Method => na classe m�e � modelo e delega as a��es para as classes filhas
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);		
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	public abstract boolean deveAplicar(Orcamento orcamento);
	
}

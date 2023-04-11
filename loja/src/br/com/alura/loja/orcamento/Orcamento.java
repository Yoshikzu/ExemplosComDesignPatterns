package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidadeItens, SituacaoOrcamento situacao) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = situacao;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void aplicarDescontoExtra() {
		//State
		BigDecimal valorDoDescontoExtra = this.situacao.calcularDescontoExtra(this);
		
		this.valor = this.valor.subtract(valorDoDescontoExtra);		
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}

	public void reprovar() {
		this.situacao.reprovar(this);
	}

	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public boolean isFinalizado() {		
		return situacao instanceof Finalizado;
	}
	
}

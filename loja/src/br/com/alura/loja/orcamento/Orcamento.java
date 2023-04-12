package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

	private BigDecimal valor;
	private List<Orcavel> itens;
	private SituacaoOrcamento situacao;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<>();
		this.situacao = new EmAnalise();
	}

	public BigDecimal getValor() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
		return valor;
	}
	
	public int getQuantidadeItens() {
		return itens.size();
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

	
	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}
}

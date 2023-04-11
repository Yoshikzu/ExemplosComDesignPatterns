package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

//Observer
public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do Pedido");
	}
	
}

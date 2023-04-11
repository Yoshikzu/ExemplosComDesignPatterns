package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

//Observer
public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando dados do Pedido no Banco de Dados");
	}
	
}

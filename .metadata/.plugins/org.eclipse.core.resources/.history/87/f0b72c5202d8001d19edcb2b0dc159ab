package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.situacao.EmAnalise;

public class GeraPedidoHandler {

	//construtor com injeção de dependencias como repository, service
	
	public void executa(GeraPedido dados) {
		
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeItens(),new EmAnalise());
		
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(dados.getCliente(),data,orcamento);
		
		System.out.println("Salvar pedido no banco de dados");
		System.out.println("Enviar email com dados do novo pedido");

	}
	
}

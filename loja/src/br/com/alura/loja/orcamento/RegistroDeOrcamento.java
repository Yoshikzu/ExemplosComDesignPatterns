package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

	//Exemplo do Padr�o Adapter
	private HttpAdapter http;
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		//Chamada HTTP para API Externa
		//Url Connection
		//Http Cliente (Apache)
		//lib Rest
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Or�amento n�o finalizado");
		}
		String url = "http://api.externa/orcamento";
		Map<String,Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens()
				);
		http.post(url,dados);
	}
}

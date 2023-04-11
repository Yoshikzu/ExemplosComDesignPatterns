import java.math.BigDecimal;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;
import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class TestesAdappter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN,1,new EmAnalise());
		orcamento.aprovar();
		orcamento.finalizar();
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);

	}

}

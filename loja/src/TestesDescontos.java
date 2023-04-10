import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.TipoImposto2;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"),6);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println("ICMS: " + calculadora.calcular(orcamento));
		
		
	}

}

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.TipoImposto2;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println("ICMS: " + calculadora.calcular(orcamento,new ICMS()));
		
		
	}

}

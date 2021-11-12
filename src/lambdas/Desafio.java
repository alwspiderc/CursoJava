package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		/*
		 * Nessa parte estava dando um erro no eclipse 
		 * https://blog.cod3r.com.br/o-que-e-locale/
		 * 
		 * O que acontece � que o Java/Eclipse trabalham com um conceito 
		 * de locale, onde, quando eles identificam a localiza��o de onde 
		 * est�o instalados eles setam como padr�o as 'manias' daquele pa�s. 
		 * Seu Eclipse est� configurado para o Brasil, por isso ele est� pedindo 
		 * para separar os doubles com v�rgula, por que o padr�o daqui � esse. 
		 * Para modificar isso � simples. Siga esse passo a passo aqui:

		   Entre no seu Eclipse, no menu superior clica em Window > Preferences 
		   >Java > Installed JREs > Clique na JRE que est� marcada e depois clique 
		   em Edit.

		   Ap�s isso ter� uma op��o chamada 'Default VM arguments', voc� vai copiar 
		   e colar esse texto l�:
		   -Duser.language=en -Duser.country=US

		   Pronto, basta clicar em finish, fechar e abrir novamente seu Eclipse.
		 * */
		

		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");
		
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preço final é " + preco);
	}

}

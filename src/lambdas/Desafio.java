package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		/*
		 * Nessa parte estava dando um erro no eclipse 
		 * https://blog.cod3r.com.br/o-que-e-locale/
		 * 
		 * O que acontece é que o Java/Eclipse trabalham com um conceito 
		 * de locale, onde, quando eles identificam a localização de onde 
		 * estão instalados eles setam como padrão as 'manias' daquele país. 
		 * Seu Eclipse está configurado para o Brasil, por isso ele está pedindo 
		 * para separar os doubles com vírgula, por que o padrão daqui é esse. 
		 * Para modificar isso é simples. Siga esse passo a passo aqui:

		   Entre no seu Eclipse, no menu superior clica em Window > Preferences 
		   >Java > Installed JREs > Clique na JRE que está marcada e depois clique 
		   em Edit.

		   Após isso terá uma opção chamada 'Default VM arguments', você vai copiar 
		   e colar esse texto lá:
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

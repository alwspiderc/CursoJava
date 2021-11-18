package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
//		Produto p1 = new Produto("Lapis", 2.50 , 2, false);
//		Produto p2 = new Produto("Canta", 3.00 , 6, false);
//		Produto p3 = new Produto("Caderno", 30.00 , 9, true);
//		Produto p4 = new Produto("Bolsa", 200.00 , 20, true);
//		Produto p5 = new Produto("Escrivaninha", 3000.00 , 50, true);
//		Produto p6 = new Produto("Cadeira", 4000.00 , 10, true);
//		Produto p7 = new Produto("Carro", 32000.00 , 60, true);
//		
//		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
//	
//		Predicate<Produto> descontoMaiorIgualVinte = produto -> produto.desconto >= 20;
//		Predicate<Produto> freteGratis = produto -> produto.frete == true;
//		Function<Produto, String> precoReal = produto -> {
//			
//			double preco = (produto.preco * produto.desconto) / 100;
//			preco = produto.preco - preco; 
//					
//			return "Preço: " + preco + "\nNome: " + produto.nome +
//					"\n------------------------------------"
//					;
//		};
//		
//		produtos.stream()
//			.filter(descontoMaiorIgualVinte)
//			.filter(freteGratis)
//			.map(precoReal)
//			.forEach(System.out::println);
		
		
		Produto p1 = new Produto("Lapis", 1.99, 0.35, 0);
		Produto p2 = new Produto("Notebook", 4899.89, 0.32, 0);
		Produto p3 = new Produto("Caderno", 30, 0.45, 0);
		Produto p4 = new Produto("Impressora", 1200, 0.40, 0);
		Produto p5 = new Produto("iPad", 3100, 0.29, 0);
		Produto p6 = new Produto("Relogio", 1900, 0.12, 0);
		Produto p7 = new Produto("Monitor", 800, 0.31, 0);
		
		List<Produto> produtos = 
				Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		// Filter, filter, map
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		Function<Produto, String> chamadaPromocional =
				p -> "Aproveite! " + p.nome + " por R$" + p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
			
	} 
}

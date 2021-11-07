package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 2, 0.09);
		Produto p2 = new Produto("borracha", 5, 0.09);
		Produto p3 = new Produto("caderno", 8, 0.09);
		Produto p4 = new Produto("apontador", 1, 0.09);
		Produto p5 = new Produto("lapis", 6, 0.09);
		imprimirNome.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach( p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}
}

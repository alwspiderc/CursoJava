package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		BinaryOperator<Double> media1 = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media1.apply(7.5, 6.8));
		
		BiFunction<Double, Double, String> media2 = 
				(n1, n2) -> (n1 + n2) / 2 >= 7? "Aprovado": "Reprovado";
		System.out.println(media2.apply(7.5, 6.8));
		
		Function<Double, String> conceito = n -> n >= 7? "Aprovado": "Reprovado";
		System.out.println(media1.andThen(conceito).apply(9.7, 4.1));
	}
}

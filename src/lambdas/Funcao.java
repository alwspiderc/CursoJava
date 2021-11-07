package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		// Recebe múmero inteiro e retorna uma String
		Function<Integer, String> parOuImpar  = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		Function<String, String> oResultadoE = valor -> "O resultado é: "+valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!"; 
		
		Function<String, String> duvida = valor -> valor + "???"; 
	
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.apply(11);
		
		String re1 = parOuImpar
				.andThen(oResultadoE
				.andThen(empolgado))
				.apply(10);
		
		String re2 = parOuImpar
				.andThen(oResultadoE
				.andThen(duvida))
				.apply(10);
		
		System.out.println(parOuImpar.apply(11));
		System.out.println(resultadoFinal);
		System.out.println(re1);
		System.out.println(re2);
		
	}
}

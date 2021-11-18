package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
//		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//		UnaryOperator<String> grito = n -> n + "!!!";
		
//		System.out.println("\n");
//		marcas.stream()
//			.map(Utilitarios.maiuscula)
//			.forEach(print);
//		System.out.println("\n");
//		marcas.stream().map(Utilitarios.primeiraLetra).forEach(print);
//		System.out.println("\n\n");
//		marcas.stream().map(Utilitarios.grito()).forEach(print);
		
		System.out.println("\nUsando composi��o");
		marcas.stream()
		.map(Utilitarios.maiuscula)
		.map(Utilitarios.primeiraLetra)
		.map(Utilitarios.grito())
		.forEach(print);
	}
}

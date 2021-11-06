package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
			
		// NÃO: int -> Double
		//Double a = 1.0;
		// double -> Double
		
		// Com Double
		BinaryOperator<Double> calculo = (x, y) -> { return x + y;};
		System.out.println(calculo.apply(2.0,3.0));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(2.0, 3.0));
		
		// Com Integer
		BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y;};
		System.out.println(calculo2.apply(2, 3));
		
		calculo2 = (x, y) -> x * y;
		System.out.println(calculo2.apply(2, 3));
		
		
		// Com String
		BinaryOperator<String> calculo3 = (x, y) -> { return x +"+"+ y;};
		System.out.println(calculo3.apply("2","3"));
		
//		calculo3 = (x, y) -> x * y;
//		System.out.println(calculo3.apply("2", "3"));

	}
}

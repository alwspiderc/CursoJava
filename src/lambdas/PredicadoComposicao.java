package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> (num >= 100) && (num <= 999);
		
		System.out.println(isPar.test(10));
		System.out.println(isTresDigitos.test(545));
		
		// retorna verdadeiro se o número for par e tiver 3 digitos
		System.out.println(isPar.and(isTresDigitos).test(222));
		
		// retorna verdadeiro se o número NÃO for par e NÃO tiver 3 digitos
		System.out.println(isPar.and(isTresDigitos).negate().test(222));
		
		// retorna verdadeiro se for par ou se tiver mais de 3 digitos
		System.out.println(isPar.or(isTresDigitos).test(123));
	}
}

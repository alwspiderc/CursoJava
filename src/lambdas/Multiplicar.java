package lambdas;

public class Multiplicar implements Calculo{

	@Override
	public Double executar(Double a, Double b) {
		return a * b;
	}
	
}

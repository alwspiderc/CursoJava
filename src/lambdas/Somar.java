package lambdas;

public class Somar implements Calculo{

	@Override
	public Double executar(Double a, Double b) {
		return a + b;
	}

}

package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	int delta = 15;
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	@Override
	void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else{
			velocidadeAtual += delta;
		}		
	}
}

package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class Principal {
	
	public static void main(String[] args) {				
		
		Carro fusca = new Fusca();
		
		fusca.acelerar();
		System.out.println(fusca);
	
		fusca.acelerar();
		System.out.println(fusca);
		
		fusca.frear();
		System.out.println(fusca);
		
		
		Ferrari ferrari = new Ferrari(400);
		
		System.out.println(ferrari.velocidadeDoAr());
		
		ferrari.ligarAr();
		//ferrari.ligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari);
	}
}

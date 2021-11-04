package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {

//		private segredo
//		String facoDentroDeCasa
//		protected formaDeFalar
//		public todosSabem
		
		
//		*
//		A classe Pedro consegue acessar da Ana os atributos públicos e protected pq ele
//		não está no mesmo pacote mas tem uma relação de parentesco com a classe Anas.
//		*
		
		//System.out.println(secredo); 

		
		//System.out.println(facoDentroDeCasa);
		
		System.out.println(formaDeFalar);
		
		System.out.println(todosSabem);
	}
}

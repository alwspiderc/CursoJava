package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {

//		private segredo
//		String facoDentroDeCasa
//		protected formaDeFalar
//		public todosSabem
	
//		*
//		A classe Julia só consegue acessar da Ana os atributos públicos pq ela
//		não está no mesmo pacote e não tem um parentesco de herança com a classe Ana.
//		*
		
		//System.out.println(sogra.secredo); 
		
//		System.out.println(sogra.facoDentroDeCasa);
//		
//		System.out.println(sogra.formaDeFalar);
		
		System.out.println(sogra.todosSabem);
	}
}

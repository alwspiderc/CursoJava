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
//		A classe Julia s� consegue acessar da Ana os atributos p�blicos pq ela
//		n�o est� no mesmo pacote e n�o tem um parentesco de heran�a com a classe Ana.
//		*
		
		//System.out.println(sogra.secredo); 
		
//		System.out.println(sogra.facoDentroDeCasa);
//		
//		System.out.println(sogra.formaDeFalar);
		
		System.out.println(sogra.todosSabem);
	}
}

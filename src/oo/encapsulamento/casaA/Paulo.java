package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	void testeAcessos() {

//		private segredo
//		String facoDentroDeCasa
//		protected formaDeFalar
//		public todosSabem
		
		//System.out.println(esposa.secredo); 
		//não consigo acessar pq é um atributo 
		//privado(só a própria classe consegue)
		
		System.out.println(esposa.facoDentroDeCasa);
		
		System.out.println(esposa.formaDeFalar);
		
		System.out.println(esposa.todosSabem);
	}
}

package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	void testeAcessos() {

//		private segredo
//		String facoDentroDeCasa
//		protected formaDeFalar
//		public todosSabem
		
		//System.out.println(esposa.secredo); 
		//n�o consigo acessar pq � um atributo 
		//privado(s� a pr�pria classe consegue)
		
		System.out.println(esposa.facoDentroDeCasa);
		
		System.out.println(esposa.formaDeFalar);
		
		System.out.println(esposa.todosSabem);
	}
}

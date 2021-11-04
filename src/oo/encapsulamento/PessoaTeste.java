package oo.encapsulamento;


public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("ester", "costa", 10);
		
		p1.setIdade(-30); // alterar
		
		System.out.println(p1.getIdade()); // ler
		System.out.println(p1); // toString
		
		System.out.println(p1.getNomeCompleto());
	}
}

package oo.composicao.desafio;

public class Item {
	
	/*
	 * Cria uma variável do tipo produto.
	 * */
	final Produto produto;
	final int quantidade;
	
	/*
	 * adiciona os valores as variaveis que vem dos dois métodos adicionarItem(); 
	 * */
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
}

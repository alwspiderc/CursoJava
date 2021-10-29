package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;


public class Compra {

	// Lista que conterá todos os itens
	final List<Item> itens = new ArrayList<>();
	
	
	/* 
	 * 1.Adiciona o item a lista já criando um novo item passando as
	 * informações necessárias para o contrutor na classe Item. 
	*/
	void adicionarItem(Produto p, int qtde){
		this.itens.add(new Item(p, qtde));
	}
	
	/* 
	 * 2.Adiciona o item a lista já criando um novo item e produto passando as
	 * informações necessárias para o contrutor na classe Item. 
	*/
	void adicionarItem(String nome, double preco, int qtde){
		
		this.itens.add(new Item(new Produto(nome, preco), qtde));
	}
	
	/*
	 * faz o calculo do valor total sobre a quantidade de itens e preço.
	 * */
	double obterValorTotal(){
		double total = 0;
		
		for(Item item: itens){
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}

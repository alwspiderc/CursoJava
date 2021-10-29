package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	/*
	 * Adiciona compra a a lista de compras.
	 * */
	void adicionarCompra(Compra compra){
		this.compras.add(compra);
	}
	
	/*
	 * faz calculo do total do valor das compras pegando do método obterValorTotal()
	 * dentro da classe compra.
	 * */
	double obterValorTotal(){
		double total = 0;
		
		for(Compra compra: compras){
			total += compra.obterValorTotal();
		}
		return total;
	}
}

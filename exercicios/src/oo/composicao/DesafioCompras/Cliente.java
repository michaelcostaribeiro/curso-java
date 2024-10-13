package oo.composicao.DesafioCompras;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Carrinho> compra = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}

	
	double obterValorTotal() {
		double total = 0;
		for(Carrinho compra : compra) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}

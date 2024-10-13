package oo.composicao.DesafioCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	List<Item> itens = new ArrayList<>();
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total+= item.quantidade * item.produto.preco;
		}
		return total;
	}
}


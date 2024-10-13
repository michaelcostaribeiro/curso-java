package oo.composicao.DesafioCompras;

public class Item {

	int quantidade;
	Produtos produto = new Produtos();
	
	Item(String nome, double preco, int quantidade){
		this.produto.nome = nome;
		this.produto.preco = preco;
		this.quantidade = quantidade;
	}

	public String toString() {
		return this.produto + " " +this.quantidade;
	}


}

package oo.composicao.DesafioCompras;

public class CompraTeste {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Jonas Brothers");
		cliente1.compra.add(new Carrinho());
		cliente1.compra.get(0).itens.add(new Item("Joia",500,3));
		cliente1.compra.add(new Carrinho());
		cliente1.compra.get(1).itens.add(new Item("Perola",1800,1));
		System.out.printf("O cliente %s gastou %.2f na loja e comprou %d %ss."
				,cliente1.nome, cliente1.compra.get(0).obterValorTotal(),
				cliente1.compra.get(0).itens.get(0).quantidade,
				cliente1.compra.get(0).itens.get(0).produto.nome);
		
		System.out.printf("\n...depois de um tempo ele voltou para comprar mais %d %s e gastou mais R$%.2f", 
				cliente1.compra.get(1).itens.get(0).quantidade,
				cliente1.compra.get(1).itens.get(0).produto.nome,
				cliente1.compra.get(1).obterValorTotal());
		
		System.out.println("\nAssim no final gastando ao todo: R$"+cliente1.obterValorTotal());
	}

}

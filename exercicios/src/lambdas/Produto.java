package lambdas;

public class Produto {

	final String nome;
	final Double preco;
	final Double desconto;
	
	public Produto(String nome, Double preco, Double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString (){
		Double precoFinal = preco * (1 - desconto);
		return "O " + nome + " custa: " + preco + " porém, com desconto o preço passa a ser: " + precoFinal;
	}
	
	
}

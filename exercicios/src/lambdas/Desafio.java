package lambdas;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		
		Function<Produto, Double> precoFinal =
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete =
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar =
				preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar =
				preco -> ("R$" + preco).replace(".", ",");
				
		Produto p = new Produto("iPad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é " + preco);
		
//		MINHA VERSÃO
//		
//		BinaryOperator<Double> precoReal = (n1, n2) -> n1 * (1 - n2);
//		Predicate<Double> impostoMunicipal = p1 -> p1 >= 2500;
//		Function<Double, Integer> quantoFrete = f -> f >= 3000 ? 100 : 50;
//		Function<Double, String> arredondar = a -> String.format("%.2f", a);
//		Function<String, String> formatar = fo -> String.format("R$"+ fo, fo);
//		
//		Double precoDesconto = precoReal.apply(p.preco, p.desconto);
//		System.out.println("O preço real é: " + precoDesconto);
//		System.out.println("O produto paga imposto municipal? " + impostoMunicipal.test(precoDesconto));
//		System.out.println("O frete a ser pago é de: "+ quantoFrete.apply(precoDesconto));
//		System.out.println(arredondar.apply(precoDesconto));
//		System.out.println(arredondar.andThen(formatar).apply(precoDesconto));
		
		
	}
}

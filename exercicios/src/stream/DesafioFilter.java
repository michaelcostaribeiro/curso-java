package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		// Versão do professor
		Produto p1 = new Produto("Lapis", 1.99, 0.35, 0);
		Produto p2 = new Produto("Notebook", 4899.89, 0.32, 0);
		Produto p3 = new Produto("Caderno", 30, 0.45, 0);
		Produto p4 = new Produto("Impressora", 1200, 0.4, 0);
		Produto p5 = new Produto("iPad", 3100, 0.29, 0);
		Produto p6 = new Produto("Relogio", 1900, 0.12, 0);
		Produto p7 = new Produto("Monitor", 800, 0.31, 0);
		
		List<Produto> produtos =
				Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		// Filter, filter, map
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
		
		Function<Produto, String> chamadaPromocional =
				p -> "Aproveite! " + p.nome + " por R$" + p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(produtoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
		
		
		
		
		// Minha versão
//		Honkai Trailblazer = new Honkai("Trailblazer", "Harmony", "Imaginary");
//		Honkai RuanMei = new Honkai("Ruan Mei", "Harmony", "Ice");
//		Honkai Robin = new Honkai("Robin", "Harmony", "Physical");
//		Honkai IL = new Honkai("Imbibitor Lunae", "Destruction", "Imaginary");
//		Honkai Firefly = new Honkai("Firefly", "Destruction", "Fire");
//		
//		Predicate<Honkai> isImaginary = i -> i.element.equals("Imaginary");
//		Predicate<Honkai> isHarmony = h -> h.path.equals("Harmony");
//		Function<Honkai, String> whoAmI = a -> "Personagem: "+ a.name + a.element + a.path;
//		
//		List<Honkai> ImagiHarmony = Arrays.asList(Trailblazer, RuanMei, Robin, IL, Firefly);
//		
//		ImagiHarmony.stream()
//			.filter(isHarmony)
//			.filter(isImaginary)
//			.map(whoAmI)
//			.forEach(System.out::println);
		
		
		
	}
	
}

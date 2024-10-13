package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		Produto p1 = new Produto ("Armário", 800.0, 0.20);
		Produto p2 = new Produto ("Fone de ouvido", 60.0, 0.05);
		Produto p3 = new Produto ("Cama Sleep Colchões", 2000.0, 0.35);
		Produto p4 = new Produto ("Armário de cozinha", 400.0, 0.10);
		

		imprimirNome.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.desconto));
		produtos.forEach(System.out::println);
		
	}
}

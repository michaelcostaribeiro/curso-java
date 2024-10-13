package lambdas;

import java.util.Arrays;
import java.util.List;


public class Foreach {
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}

	public static void main(String[] args) {
		
		List<String> lss = Arrays
				.asList("Número 1", "Número 2","Número 3");
		
		System.out.println("Forma tradicional...");
		for(String nome: lss) {
			System.out.println("Olá! Meu nome é: " + nome);
		}
		
		System.out.println("\nLambda #01...");
		lss.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference...");
		lss.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		lss.forEach(Foreach::meuImprimir);
		
	}
}

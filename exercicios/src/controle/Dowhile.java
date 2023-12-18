package controle;

import java.util.Scanner;

public class Dowhile {
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		
		do {
			System.out.println("Você precisa falar "
					+ "\nas palavras mágicas...");
			System.out.print("Quer sair? ");
		} while (!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");
		entrada.close();
	}

}

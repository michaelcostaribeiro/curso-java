package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String s = "";
		
		while(!s.equalsIgnoreCase("sair")) {
			System.out.println("O que você tem a dizer?\n");
			s = entrada.next();
			System.out.printf("Você diz: %s\n", s);
		}
		
		System.out.println("Sistema desligado.");
		
		entrada.close();
	}
}

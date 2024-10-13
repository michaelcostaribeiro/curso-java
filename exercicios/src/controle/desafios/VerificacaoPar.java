package controle.desafios;

import java.util.Scanner;

public class VerificacaoPar {

	
	// 1. Criar um programa que receba um número e verifique se ele 
	// está entre 0 e 10 e é par;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String s = "";
		int teste = 0;
		
		while(!s.equalsIgnoreCase("sair")) {
			System.out.println("Digite o número a ser verificado");
			teste = entrada.nextInt();
			
			if(teste>=0 && teste<=10) {
				System.out.println("O número está entre 0 e 10");
			}
			
			if(teste%2==0) {
				System.out.println("O número é par");
			}
			
			System.out.println("Digite 'sair' para finalizar o programa");
			s = entrada.next();
		}
		
		
		entrada.close();
	}
}

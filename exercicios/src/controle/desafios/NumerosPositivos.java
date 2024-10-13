package controle.desafios;

import java.util.Scanner;

public class NumerosPositivos {

	// 7. Criar um programa que enquanto estiver recebendo números 
	// positivos, imprime no console a soma dos números inseridos, caso 
	// receba um número negativo, encerre o programa. Tente utilizar a 
	// estrutura do while.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma = 0;
		double num = 0;
		
		while(num > -1) {
			num = entrada.nextDouble();
			if(num > -1) {
				soma += num; 
			}
		}
		
		System.out.println(soma);
		entrada.close();
	}
}

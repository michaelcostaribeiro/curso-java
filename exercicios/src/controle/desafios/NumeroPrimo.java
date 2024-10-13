package controle.desafios;

import java.util.Scanner;

public class NumeroPrimo {

	// 4.Criar um programa que receba um número e diga se ele é um 
	// número primo.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número para saber se ele é primo: ");
		int NumeroPrimo = entrada.nextInt();
		int contadorprimo = 0;
		
		for(int contador = 1;contador<=NumeroPrimo;contador++) {
			if(NumeroPrimo%contador==0) {
				contadorprimo++;
			}
		}
		
		if(contadorprimo>2) {
			System.out.println("O número NÃO é primo.");
		} else {
			System.out.println("O número é primo.");
		}
		
		entrada.close();
	}
}

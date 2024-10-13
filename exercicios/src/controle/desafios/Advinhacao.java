package controle.desafios;

import java.util.Scanner;

public class Advinhacao {

	// 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero 
	// aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao 
	// final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número 
	// inserido é maior ou menor do que o número armazenado.
	
	public static void main(String[] args) {
		int numsorte = 57;
		Scanner entrada = new Scanner(System.in);
		int palpite = 0;
		System.out.println("Jogo da adivinhação! Você terá 10 tentativas para acertar o número correto!");
		
		 laco: for(int i = 10;i>0;i--) {
			System.out.printf("Você tem %d tentativas restantes, qual é o seu palpite?\n", i);
			palpite = entrada.nextInt();
			if(palpite>numsorte) {
				System.out.println("O seu número de palpite é maior que o correto!");
			} else if(palpite<numsorte) {
				System.out.println("O seu número de palpite é menor do que o correto!");
			} else if(palpite == numsorte) {
				System.out.println("Você acertou, parabéns!");
				break laco;
			}
		}
		
		entrada.close();
	}
	
}

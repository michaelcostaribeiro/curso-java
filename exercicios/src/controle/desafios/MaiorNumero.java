package controle.desafios;

import java.util.Scanner;

public class MaiorNumero {

	// 9. Crie um programa que recebe 10 valores e ao final imprima o 
	// maior número.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num = 0;
		double maior = 0;
		
		for(int x = 0;x<10;x++) {
			num = entrada.nextDouble();
			if(num>maior) {
				maior = num;
			}
		}
		
		System.out.println(maior);
		
		entrada.close();
	}
}

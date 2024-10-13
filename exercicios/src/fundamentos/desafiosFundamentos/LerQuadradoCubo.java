package fundamentos.desafiosFundamentos;

import java.util.Scanner;

public class LerQuadradoCubo {

	// 4. Criar um programa que leia um valor e apresente os resultados 
	// ao quadrado e ao cubo do valor.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um valor para ser multiplicado ao quadrado e cubo: ");
		double num1 = entrada.nextDouble();
		
		System.out.printf("O resultado desse valor ao quadrado é de: %.2f e ao cubo é de: %.2f.",
				Math.pow(num1, 2), Math.pow(num1, 3));
		entrada.close();
	}
}

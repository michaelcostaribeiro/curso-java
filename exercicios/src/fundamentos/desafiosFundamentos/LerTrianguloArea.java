package fundamentos.desafiosFundamentos;

import java.util.Scanner;

public class LerTrianguloArea {

	
	// 5. Criar um programa que leia o valor da base e
	// da altura de um triângulo e calcule a área.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor da base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Digite o valor da altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		System.out.printf("O valor da área do triângulo é de %.2f", (base*altura)/2);
		
		entrada.close();
	}
}

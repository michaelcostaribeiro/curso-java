package controle.desafios;

import java.util.Scanner;

public class NumeroPrimoSwitch {

	// 5. Refatorar o exercício 04, utilizando a estrutura switch.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número para saber se ele é primo: ");
		int NumeroPrimo = entrada.nextInt();
		int contadorprimo = 0;

		for (int contador = 1; contador <= NumeroPrimo; contador++) {
			if (NumeroPrimo % contador == 0) {
				contadorprimo++;
			}
		}

		switch(contadorprimo) {
		case 2:
			System.out.println("O número é primo.");
			break;
		default:
			System.out.println("O número NÃO é primo.");
		}

		entrada.close();
	}
}

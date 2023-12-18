package exercicios2;

import java.util.Scanner;

public class Teste {

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		Teste1 xaa = new Teste1();
		System.out.println("BEM VINDO");
		System.out.println("Digite o número da operação que você deseja realizar:\n");
		System.out.println("[1] Adicao");
		System.out.println("[2] Subtracao");
		System.out.println("[3] Multiplicacao");
		System.out.println("[4] Divisao");
		int escolha = 0;
		String esc = null;
		do {
		    escolha = entrada.nextInt();
		    switch (escolha) {
		case 1:
			System.out.println("Digite os numeros para soma:");
			double soma1 = entrada.nextDouble();
			double soma2 = entrada.nextDouble();
			System.out.println(xaa.Soma(soma1, soma2));
			break;
		case 2:
			System.out.println("Digite os numeros para subtracao");
			double sub1 = entrada.nextDouble();
			double sub2 = entrada.nextDouble();
			System.out.println(xaa.Subtracao(sub1, sub2));
			break;
		case 3:
			System.out.println("Digite os numeros para multiplicacao");
			double mult1 = entrada.nextDouble();
			double mult2 = entrada.nextDouble();
			System.out.println(xaa.Multiplicacao(mult1,  mult2));
			break;
		case 4:
			System.out.println("Digite os numeros para divisão");
			double div1 = entrada.nextDouble();
			double div2 = entrada.nextDouble();
			System.out.println(xaa.Divisao(div1, div2));
			break;
		default:
			System.out.println("Deseja continuar?[S/N]");
			esc = entrada.nextLine();
		} while (!esc.equals("N"));
		}
		
		entrada.close();
	}

}

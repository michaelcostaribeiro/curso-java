package controle;

import java.util.Scanner;

public class Respostasmodulo2 {
	
	public static void main(String[]args) {
		
	Scanner entrada = new Scanner(System.in);

	
// Exercicio 9	
//	int contador = 0;
//	double maior = 0;
//	while(contador != 10) {
//		double valor = entrada.nextDouble();
//		if (valor>maior)
//			maior = valor;
//		contador++;
//	}
//	System.out.println(maior);

// Exercicio 8
//	System.out.println("Digite uma palavra a ser soletrada: ");
//	String s = entrada.next();
//	System.out.println("Soletrando...");
//	for(int cont = 0;cont != s.length();cont++) {
//		System.out.println(s.charAt(cont));
//	}

// Exercicio 7
//double cont = 1;
//double soma = 0;
//while (cont>0) {
//	cont = entrada.nextDouble();
//	if(cont<0)
//		break;
//	soma+=cont;	
//}
	
// Exercício 6
//	System.out.println("==Jogo de adivinhação!==");
//	System.out.println("Digite o número certo.");
//	int charada = 75;
//	int tentativa = 0;
//	for ( int tenta = 10 ;tenta!=0 ; tenta--) {
//		System.out.println("Você tem " +tenta+" tentativas.");
//		System.out.println("Qual número você chuta?");
//		tentativa = entrada.nextInt();
//		if (tentativa<charada) {
//			System.out.println("O número é maior do que "+tentativa);
//		}
//		if (tentativa>charada) {
//			System.out.println("O número é menor do que "+tentativa);
//		}
//		if (tentativa==charada) {
//			System.out.println("Você acertou, parabéns");
//			break;
//		}
//	}
//
//	if (charada != tentativa) {
//		System.out.println("Suas chances acabaram, não foi dessa vez...");
//	}
	
// Exercicio 5
//	int aaa = 11;
//	int contd = 0;
//	
//	for(int cont = 2 ;cont != aaa; cont ++) {
//	
//		if (aaa % cont == 0) {
//			contd++;	
//		}
//	}
//		switch(contd) {
//		case 0:
//			System.out.println("O número é primo");break;
//		default:
//			System.out.println("O número não é primo");
//	
	
// Exercicio 4
//	int aaa = 11;
//	int contd = 0;
//	
//	for(int cont = 2 ;cont != aaa; cont ++) {
//	
//		if (aaa % cont == 0) {
//			contd++;
//			if (contd==1) {
//				System.out.println("O número não é primo.");
//			break;
//			}
//		}
//	}
//	if (contd ==0)
//		System.out.println("O número é primo");

// Exercício 3
//	System.out.println("Digite a primeira nota: ");
//	Double nota1 = entrada.nextDouble();
//	System.out.println("Digite a segunda nota: ");
//	Double nota2 = entrada.nextDouble();
//	Double media = (nota1+nota2)/2;
//	if(media >= 7.0)
//		System.out.println("Aprovado");
//	else if (media<7.0 && media>4.0)
//		System.out.println("Recuperação");
//	else
//		System.out.println("Reprovado");	
//System.out.println(soma);
	
// Exercício 2
//	System.out.print("Informe o ano atual: ");
//	double ano = entrada.nextDouble();
//	if(ano%4 ==0) {
//		System.out.println("O ano é bissexto");
//	}
	
// Exercício 1
//	System.out.println("Digite um número: ");
//	int numerao = entrada.nextInt();
//	
//	if (numerao<=10 && numerao>=0) {
//		System.out.println("O número está entre 0 e 10");
//	}
//	if (numerao%2==0) {
//		System.out.println("O número é par");
//	}
		
	entrada.close();	
	}

}

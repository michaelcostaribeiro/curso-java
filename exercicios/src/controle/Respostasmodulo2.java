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
	
// Exerc�cio 6
//	System.out.println("==Jogo de adivinha��o!==");
//	System.out.println("Digite o n�mero certo.");
//	int charada = 75;
//	int tentativa = 0;
//	for ( int tenta = 10 ;tenta!=0 ; tenta--) {
//		System.out.println("Voc� tem " +tenta+" tentativas.");
//		System.out.println("Qual n�mero voc� chuta?");
//		tentativa = entrada.nextInt();
//		if (tentativa<charada) {
//			System.out.println("O n�mero � maior do que "+tentativa);
//		}
//		if (tentativa>charada) {
//			System.out.println("O n�mero � menor do que "+tentativa);
//		}
//		if (tentativa==charada) {
//			System.out.println("Voc� acertou, parab�ns");
//			break;
//		}
//	}
//
//	if (charada != tentativa) {
//		System.out.println("Suas chances acabaram, n�o foi dessa vez...");
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
//			System.out.println("O n�mero � primo");break;
//		default:
//			System.out.println("O n�mero n�o � primo");
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
//				System.out.println("O n�mero n�o � primo.");
//			break;
//			}
//		}
//	}
//	if (contd ==0)
//		System.out.println("O n�mero � primo");

// Exerc�cio 3
//	System.out.println("Digite a primeira nota: ");
//	Double nota1 = entrada.nextDouble();
//	System.out.println("Digite a segunda nota: ");
//	Double nota2 = entrada.nextDouble();
//	Double media = (nota1+nota2)/2;
//	if(media >= 7.0)
//		System.out.println("Aprovado");
//	else if (media<7.0 && media>4.0)
//		System.out.println("Recupera��o");
//	else
//		System.out.println("Reprovado");	
//System.out.println(soma);
	
// Exerc�cio 2
//	System.out.print("Informe o ano atual: ");
//	double ano = entrada.nextDouble();
//	if(ano%4 ==0) {
//		System.out.println("O ano � bissexto");
//	}
	
// Exerc�cio 1
//	System.out.println("Digite um n�mero: ");
//	int numerao = entrada.nextInt();
//	
//	if (numerao<=10 && numerao>=0) {
//		System.out.println("O n�mero est� entre 0 e 10");
//	}
//	if (numerao%2==0) {
//		System.out.println("O n�mero � par");
//	}
		
	entrada.close();	
	}

}

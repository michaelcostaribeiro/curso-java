package controle.desafios;

import java.util.Scanner;

public class Bissexto {

	// 2.Criar um programa informa se o ano atual é um ano bissexto;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um ano: ");
		int ano = entrada.nextInt();
		boolean bissexto = ano%4==0 && (ano%100 != 0 || ano%400 ==0);
		
		if(bissexto) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano não é bissexto!");
		}
		entrada.close();
	}
}

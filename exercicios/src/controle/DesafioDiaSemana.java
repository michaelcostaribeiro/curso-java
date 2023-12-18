package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[]args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Que dia é hoje?");
	String dia = entrada.next().toLowerCase().trim();
	
	Integer resultado = 0;
	if ("domingo".equals(dia)) {
		resultado = 1;
	}else if ("segunda".equals(dia)) {
		resultado = 2;
	}else if ("terça-feira".equals(dia)) {
		resultado = 3;
	}else if ("quarta-feira".equals(dia)) {
		resultado = 4;
	}else if ("quinta-feira".equals(dia)) {
		resultado = 5;
	}else if ("sexta-feira".equals(dia)) {
		resultado = 6;
	}else if ("sábado".equals(dia)) {
		resultado = 7;
	}


	System.out.print("O número da sorte de hoje é: " + resultado);
	entrada.close();
	}
}

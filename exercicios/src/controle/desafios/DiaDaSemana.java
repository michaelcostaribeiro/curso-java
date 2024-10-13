package controle.desafios;

import java.util.Scanner;

public class DiaDaSemana {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que dia da semana é hoje?");
		String dia = entrada.next();
	
		if(dia.trim(). equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (dia.trim().equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (dia.trim().equalsIgnoreCase("terça") 
				|| dia.trim().equalsIgnoreCase("terca")) {
			System.out.println("3");
		} else if (dia.trim().equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (dia.trim().equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (dia.trim().equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (dia.trim().equalsIgnoreCase("sábado")
				|| dia.trim().equalsIgnoreCase("sabado")) {
			System.out.println("7");
		}
		
		
		
		
		entrada.close();
		
		
	}	
}

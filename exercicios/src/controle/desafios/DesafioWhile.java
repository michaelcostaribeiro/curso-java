package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Olá, qual é o seu nome? ");
		var nome = entrada.nextLine();
		
		
		double nota = 0;
		double media = 0;
		int notaValida = 0;
		do {
			System.out.println("Por gentileza " + nome + " digite suas notas para calcularmos sua média.");
			nota = entrada.nextDouble();
			
			if(nota>0 && nota<=10) {
				media += nota;
				notaValida++;
			}else {
				System.out.println("Nota inválida!");
			}
			
		} while(nota != -1);
		
		media/= notaValida;
		System.out.printf("%d notas válidas foram digitadas\n", notaValida);
		System.out.printf("Sua média é de %.2f", media);
		
		entrada.close();
	}
}

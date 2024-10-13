package arrays.desafios;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos números terão o array?");
		int arrayentrada = entrada.nextInt();
		
		double[] notaAluno = new double[arrayentrada];
//		int contador = 0;
		
//		for(double notas:notaAluno) {
//			notaAluno[contador] = entrada.nextDouble();
//			contador++;
//		}
		
		double soma = 0;
		for(double notas:notaAluno) {
			soma += notas;
		}
		
		System.out.println(soma);
		
		entrada.close();
	}

}

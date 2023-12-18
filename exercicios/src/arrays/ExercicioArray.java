package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioArray {
	
	public static void main(String[]args) {
		double soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o tanto de notas que deseja informar: ");
		int numnotas = entrada.nextInt();
		
		double [] notas = new double[numnotas];
		for(int i = 0; i <notas.length; i++) {
			System.out.println("Digite a nota "+ (i+1) +":");
			notas[i] = entrada.nextDouble();
		}
		
		for(double nota:notas) {
			soma+=nota;
		}
		
		System.out.println(Arrays.toString(notas));
		System.out.println("A média das notas do aluno é de : "+(soma/notas.length));
		
		
		
		
		
		entrada.close();
	}

}

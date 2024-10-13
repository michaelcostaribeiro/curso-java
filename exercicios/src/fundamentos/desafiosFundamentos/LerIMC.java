package fundamentos.desafiosFundamentos;

import java.util.Scanner;

public class LerIMC {

	// 3. Criar um programa que leia o peso e a altura do usuário e
	// imprima no console o IMC.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		String imcresultado = imc>40 ? "Obesidade grave" : "";
		imcresultado = imc>30 && imc<= 39.9 ? "Obesidade" : imcresultado;
		imcresultado = imc>25 && imc<= 29.9 ? "Sobrepeso" : imcresultado;
		imcresultado = imc>18.5 && imc<= 24.9 ? "Normal" : imcresultado;
		imcresultado = imc<18.5 ? "Magreza" : imcresultado;
		
		System.out.println(imcresultado);
		
		
		entrada.close();
	}
}

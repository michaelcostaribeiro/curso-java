package fundamentos;

import java.util.Scanner;

public class modulo1 {
	
	
	 public static void main (String [] args){
		 
		 
		 
	Scanner entrada = new Scanner(System.in);

	

	
	
	
	
	
//	 Área do triângulo
	System.out.println("Digite a base do triângulo:");
	Double base = entrada.nextDouble();
	
	
	System.out.println("Digite a altura do triângulo:");
	Double altura = entrada.nextDouble();
	
	System.out.println("A área do triângulo é igual a : " + (base*altura)/2);
	
	
// Calcular ao quadrado e ao cubo	
//	System.out.println("Digite um valor a ser elevado ao quadrado e cubo:");
//	Double valor = entrada.nextDouble();
//	System.out.println("O resultado ao quadrado: " + Math.pow(valor, 2));
//	System.out.println("O resultado ao cubo: " + Math.pow(valor, 3));
	
// Calculadora de IMC
//	System.out.println("Digite o seu peso: ");
//	Double peso = entrada.nextDouble();
//	
//	System.out.println("Digite a sua altura: ");
//	Double altura = entrada.nextDouble();
//	
//	
//	Double imc = peso/ Math.pow(altura, 2);
//	System.out.println("O seu imc é igual a :" + imc);
//	
//	String resultado = imc > 18.5 ? "Baixo peso" : " ";
//	resultado = imc > 18.5  && imc < 25 ? "Peso ideal" : resultado;
//	resultado = imc >= 25  && imc < 30 ? "Sobrepeso" : resultado;
//	resultado = imc >= 30  && imc < 35 ? "Primeira obesidade" : resultado;
//	resultado = imc >= 35  && imc < 40 ? "Segunda obesidade" : resultado;
//	resultado = imc > 40 ? "Obesidade grave" : resultado;
	
//	Fahrenheit para Celsius
//	
//	
//	System.out.print("Digite a temperatura em graus fahrenheit: ");	 
//	Double fahrenheit = entrada.nextDouble();
//	
//	Double celsius = (fahrenheit - 32) / 1.8 ;
//	System.out.println("Essa temperatura em celsius é igual a: " + celsius);
		 
		 
		 
	entrada.close();
		 
		 
		 
		 
	 }

}

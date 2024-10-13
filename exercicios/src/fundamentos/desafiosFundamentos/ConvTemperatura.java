package fundamentos.desafiosFundamentos;

import java.util.Scanner;

public class ConvTemperatura {

	// 1. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
	// (F − 32) × 5/9 = °C

    // 2. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	// (°C × 9/5) + 32 = °F

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 'F' para converter a temperatura de Fahrenheit para Celsius e 'C' para converter de Celsius para Fahrenheit: ");
		String condicao = entrada.next();
		System.out.print("Digite o valor da temperatura: ");
		double temperatura = entrada.nextDouble();
		
		double resultado = "F".equals(condicao) ? (temperatura - 32) * 5 / 9 : 0;
        resultado = "C".equals(condicao) ? (temperatura * 9 / 5) + 32 : resultado;
		
		System.out.printf("%.2f", resultado);
		
		entrada.close();
	}

}

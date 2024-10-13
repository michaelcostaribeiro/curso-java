package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número para a conta: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o primeiro número para a conta: ");
		double num2 = entrada.nextDouble();
		
		
		System.out.print(" Caso queira somar digite '+'. \n Para subtrair digite '-'"
				+ "\n Para dividir digite '/' \n Para multiplicar digite '*': ");
		String condicao = entrada.next();

		double resultado = "+".equals(condicao) ? num1 * num2 : 0;
		resultado = "-".equals(condicao) ? num1 / num2 : resultado;
		resultado = "/".equals(condicao) ? num1 - num2 : resultado;
		resultado = "*".equals(condicao) ? num1 + num2 : resultado;
		
		System.out.println(resultado);
		
		entrada.close();
	}
}

package fundamentos.desafiosFundamentos;

import java.util.Scanner;

public class Bhaskara {
	
	
	//  6. Criar um programa que resolve equações do segundo grau 
	//  (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use 
	//  como exemplo a = 1, b = 12 e c = -13. Encontre o delta
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o valor de A: ");
		double a = entrada.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		double b = entrada.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		double c = entrada.nextDouble();
		
		double delta = (Math.pow(b, 2))- 4 * a * c; 
		double raiz = (-b +- Math.sqrt(delta)) / 2 * a;
		
		System.out.println("\nO valor do delta é de: "+delta);
		System.out.println("O valor da raiz é de: "+raiz);
		
		entrada.close();
	}
	
	
}

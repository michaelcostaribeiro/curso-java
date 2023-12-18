package classe;

import java.util.Scanner;

public class Jantar {
	
	public static void main(String[]args) {
		
		double pesoantes;
		String simnao;
		double diff;
		
		Pessoa p1 = new Pessoa();
		Comida c1 = new Comida();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome da pessoa: ");
		p1.nome = entrada.next();
		System.out.print("Digite o peso da pessoa: ");
		p1.peso = entrada.nextDouble();
		pesoantes = p1.peso;
		
		do {
		System.out.print("Digite o nome da comida: ");
		c1.nome = entrada.next();
		System.out.print("Digite o peso da comida: ");
		c1.peso = entrada.nextDouble();
		p1.peso = p1.comer(p1.peso, c1.peso);
		
		System.out.println("Deseja comer mais?\n[Digite sim ou não]");
		simnao = entrada.next().toLowerCase().trim();
		}while(!simnao.equals("não"));
		
		
		diff = p1.peso - pesoantes;
		System.out.println(p1.nome+" o seu peso antes era de " + pesoantes+" kilos, você agora pesa " + p1.peso +
				" kilos, você engordou " + diff + " kilos");		
		
		
		
		
		entrada.close();
	}

}

package fundamentos.tiposeconversoes;

import java.util.Scanner;

public class DesafioConversao {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu primeiro salário: ");
		String psalario = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o seu segundo salário: ");
		String ssalario = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o seu terceiro salário: ");
		String tsalario = entrada.nextLine().replace(",", ".");
			
		double salario1 = Double.parseDouble(psalario);
		double salario2 = Double.parseDouble(ssalario);
		double salario3 = Double.parseDouble(tsalario);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		
		System.out.printf("A média dos seus últimos 3 salários é de: %.2f",
				media);
		
		
		entrada.close();
	}
}

package fundamentos;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioConversao {
	
	public static void main(String[] args) {
	
	//String salário1 = JOptionPane.showInputDialog(
			//"Digite o quanto recebeu em seu primeiro salário");
	//String salário2 = JOptionPane.showInputDialog(
			//"Digite o quanto recebeu em seu segundo salário");
	//String salário3 = JOptionPane.showInputDialog(
			//"Digite o quanto recebeu em seu terceiro salário");
	
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o quanto recebeu em seu primeiro salário: ");
	String salário1 = entrada.nextLine().replace(",", ".");
	
	System.out.print("Digite o quanto recebeu em seu segundo salário: ");
	String salário2 = entrada.nextLine().replace(",", ".");
	
	System.out.print("Digite o quanto recebeu em seu terceio salário: ");
	String salário3 = entrada.nextLine().replace(",", ".");
	
	double valor1 = Double.parseDouble(salário1);
	double valor2 = Double.parseDouble(salário2);
	double valor3 = Double.parseDouble(salário3);
	
	double soma = (valor1 + valor2 + valor3);
	
	System.out.println("\n" + soma / 3);
	
	entrada.close();
	
	}
}

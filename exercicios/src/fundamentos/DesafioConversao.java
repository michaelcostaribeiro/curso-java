package fundamentos;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioConversao {
	
	public static void main(String[] args) {
	
	//String sal�rio1 = JOptionPane.showInputDialog(
			//"Digite o quanto recebeu em seu primeiro sal�rio");
	//String sal�rio2 = JOptionPane.showInputDialog(
			//"Digite o quanto recebeu em seu segundo sal�rio");
	//String sal�rio3 = JOptionPane.showInputDialog(
			//"Digite o quanto recebeu em seu terceiro sal�rio");
	
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o quanto recebeu em seu primeiro sal�rio: ");
	String sal�rio1 = entrada.nextLine().replace(",", ".");
	
	System.out.print("Digite o quanto recebeu em seu segundo sal�rio: ");
	String sal�rio2 = entrada.nextLine().replace(",", ".");
	
	System.out.print("Digite o quanto recebeu em seu terceio sal�rio: ");
	String sal�rio3 = entrada.nextLine().replace(",", ".");
	
	double valor1 = Double.parseDouble(sal�rio1);
	double valor2 = Double.parseDouble(sal�rio2);
	double valor3 = Double.parseDouble(sal�rio3);
	
	double soma = (valor1 + valor2 + valor3);
	
	System.out.println("\n" + soma / 3);
	
	entrada.close();
	
	}
}

package controle;

import java.util.Scanner;

public class whileindeterminado {
	
	public static void main(String[]args) {
		
	Scanner entrada = new Scanner(System.in);	
	
	String resposta = "";
	while(!"sair".equals(resposta)) {
		System.out.println("Sua resposta �: ");
		resposta = entrada.next().toLowerCase().trim();
	}	
	//toma filho pai � g�nio			
		
		
	entrada.close();
	}

}

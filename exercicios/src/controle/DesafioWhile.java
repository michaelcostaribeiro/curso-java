package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
	   double nv = 0;
	   double nota = 0;
	   double media1 = 0;
	   do {
		   System.out.println("Digite uma nota de 0 a 10: ");
		   media1 = media1 + nota;
		   nota = entrada.nextDouble();
		   if(nota>=0 && nota<=10)
			   nv++;
		   if(nota<0 || nota>10)
			   System.out.println("Nota inválida.");
	   }while(nota != -1);
	   double media2 = media1/nv;
	   System.out.println("Média da nota dos alunos: " + media2);
	   System.out.println("Notas válidas: " + nv);
	 	
		
		
		
		entrada.close()	;
	}
}

package classesmetodos;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Data d1 = new Data(31, 10, 2024);
		Data d2 = new Data(18, 03 ,1996);
		Data d3 = new Data();
		Data d4 = new Data();
		
		System.out.print("Informe um dia do ano: ");
		d3.Dia = entrada.nextInt();
		System.out.print("Informe um mês do ano: ");
		d3.Mes = entrada.nextInt();
		System.out.print("Informe um ano: ");
		d3.Ano = entrada.nextInt();
		
		
		
		System.out.println("Quatro datas foram inseridas no sistema.");
		System.out.println("Elas sendo: ");
		System.out.print(d1.obterDataFormatada("10", "8", "2023"));
		System.out.print(d1.obterDataFormatada());
		System.out.print(d2.obterDataFormatada());
		System.out.print(d3.obterDataFormatada());
		System.out.print(d4.obterDataFormatada());
		
		entrada.close();
	}
	
}

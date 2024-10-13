package classesmetodos;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referência (Objeto)
		
		d1.Dia = 31;
		d2.Mes = 12;
		
		d1.Ano = 2025;
		
		System.out.print(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.print(d1.obterDataFormatada());
		System.out.print(d2.obterDataFormatada());
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.Dia = 1;
		d.Mes = 1;
		d.Ano = 1970;
	}
	
	static void alterarPrimitivo(int c) {
		c++;
	}
	
	
	

}

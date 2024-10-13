package fundamentos.tiposeconversoes;

public class DesafioVariaveis {

	public static void main (String[] args) {
		double temperatura = 86;
		final int ajuste = 32;
		final double fator = 5/9.0;
		double celsius;
		
		celsius = (temperatura - ajuste)* fator;
		
		System.out.println(celsius);
		
	}
}

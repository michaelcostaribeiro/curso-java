package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (F - 32 ) * 5/9 = C
		final double AJUSTE = 32;
		final double CONVERSAO = 5.0/9;
		double F = 86;
		double C = ( F - AJUSTE ) * CONVERSAO ;
		
		System.out.println("A conversão para F é igual a: " + C);
		
		F = 150;
		C = (F - AJUSTE) * CONVERSAO; 		
		System.out.println("A conversão para F é igual a: " + C);
		
	}

}

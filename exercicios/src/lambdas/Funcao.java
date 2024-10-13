package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "Impar";
		Function<String, String> oResultadoE = 
				valor -> "O resultado é: " + valor;
				
				
		Function<String, String> empolgado = 
				emp -> emp + "!!!";
				
		System.out.println(parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(25));
		
		Function<String, String> confuso = 
				cnf -> cnf + "???";
				
		System.out.println(parOuImpar.andThen(oResultadoE).andThen(confuso).apply(50));
		
		
	}
}

package lambdas;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicadoComposto {

	public static void main(String[] args) {
		//Exemplo do Professor
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos =
				num -> num >= 100 && num <= 999;
				
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		System.out.println(isPar.or(isTresDigitos).test(123));
		
		
		
		
		
		 //Teste
		 Scanner entrada = new Scanner(System.in);
		 Produto arma = new Produto("Armário", 800.0, 0.15);
		 System.out.println("Classifique o Produto que você comprou: " + arma.nome);
		 System.out.println("As notas são A, B, C, D e E, sendo A a melhor e E a pior.");
		 String nota = entrada.nextLine();
		 System.out.println("Você achou o preço acessível?");
		 System.out.println("As notas são A, B, C, D e E, sendo A a melhor e E a pior.");
		 nota = entrada.nextLine();
		 
		 
		 Predicate<String> notaA = notaBoa -> notaBoa.equals("A");
		 Predicate<String> precoAcessivel = precoOK -> precoOK.equals("A");
		 
		 System.out.println(notaA.and(precoAcessivel).test(nota));
		 
		 
		 
		 entrada.close();
	}
}

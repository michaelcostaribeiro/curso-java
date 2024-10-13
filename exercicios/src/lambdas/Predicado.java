package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Produto Notebook = new Produto("Notebook", 3500.00, 0.85);
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		System.out.println(isCaro.test(Notebook));
		
		
		
	}

}

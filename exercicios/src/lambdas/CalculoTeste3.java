package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		// A interface funcional do Java precisa usar apenas tipos inteligentes.
		
		// Ela também não pode converter alguns tipos.
		// NÃO: int -> Double
		// double -> Double
		
		BinaryOperator<Double> calc = (x,y) -> x+y;
		System.out.println(calc.apply(10.0, 5.0));
		
		calc = (x, y) -> x*y;
		System.out.println(calc.apply(10.0, 5.0));
		
		BinaryOperator<Integer> calc2 = (x,y) -> x-y;
		System.out.println(calc2.apply(10, 5));
		
		calc2 = (x,y) -> x/y;
		System.out.println(calc2.apply(10, 5));
	}
}

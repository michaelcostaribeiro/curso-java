package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Consumer<String> println = System.out::println;
		Function<Integer, String> paraBinario = n -> n.toBinaryString(n);
		UnaryOperator<String> inverter = n1 -> {
			Character caractere;
			String resultadoInvertido = "";
			for(int iz = 0; iz < n1.length(); iz++) {
				caractere = n1.charAt(iz);
				resultadoInvertido =  caractere + resultadoInvertido;
			}
			return resultadoInvertido;
		};
		

		Function<String, Integer> paraDecimal = d -> {
			Integer binDec = 0;
			for (int i = 0; i < d.length(); i++) {
				 if (d.charAt(i) == '1') {
					 binDec = (int)  (binDec + Math.pow(2,i));
				}
				
			}
			return binDec;
		};
		
		Function<Integer, String> paraString = Object::toString;
		
		nums.stream()
		.map(paraBinario).map(inverter).map(paraDecimal).map(paraString)
		.forEach(println);
	}
}

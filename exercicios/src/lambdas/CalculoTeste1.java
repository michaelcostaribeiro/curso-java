package lambdas;

public class CalculoTeste1 {

public static void main(String[] args) {
		
		Calculo soma = new Somar();
		System.out.println(soma.executar(54, 2));
		
		Calculo multiplicacao = new Multiplicar();
		System.out.println(multiplicacao.executar(5, 2));
	}

}

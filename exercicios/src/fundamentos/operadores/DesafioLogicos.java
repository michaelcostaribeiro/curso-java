package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		System.out.println("Para TV de 32 polegadas");
		var resultado = trabalho1 ^ trabalho2;
		System.out.println(resultado);
		
		System.out.println("Para TV de 50 polegadas");
		resultado = trabalho1 && trabalho2;
		System.out.println(resultado);
		
		System.out.println("Para sorvete");
		resultado = trabalho1 || trabalho2;
		System.out.println(resultado);
		
		System.out.println("Para saúde");
		resultado = !(trabalho1 || trabalho2);
		System.out.println(resultado);
	}
}

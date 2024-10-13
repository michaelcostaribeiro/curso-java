package controle.desafios;

public class Soletrador {

	// 8. Criar um programa que receba uma palavra e imprime no console
	// letra por letra.
	
	public static void main(String[] args) {
		String p = "soletrador";
		
		for(int a = 0;a<p.length();a++) {
			System.out.println(p.charAt(a));
		}
	}
}

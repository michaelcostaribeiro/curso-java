package classesmetodos.desafios;

public class Jantar {

	public static void main(String[] args) {
		Comida macarrao = new Comida("Macarrao", 8.5);
		Comida alface = new Comida("Alface", 3.11);
		Comida pizza = new Comida("Pizza", 2.8);
		
		Pessoa michael = new Pessoa("Michael", 75);
		michael.comer(macarrao.peso);
		System.out.println(michael.obterPesoInicialFinal());		
		
		michael.comer(alface.peso);
		System.out.println(michael.obterPesoInicialFinal());
		
		michael.comer(pizza.peso);
		System.out.println(michael.obterPesoInicialFinal());
	}
}

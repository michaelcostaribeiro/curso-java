package colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {
	
	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // retorna null
		fila.offer("Bia");  // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Elemento -> obter o próximo elemento
		// da fila (sem remover)
		
		// Diferença é o comportamento ocorre quando a fila está vazia!
		// quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());  // Lança uma exceção
		System.out.println(fila.element());
		
		// fila.size()
		// fila.clear();
		// fila.isEmpty()
		
		// Pool e Remove -> obter o próximo elemento
		// da fila e remove!
		
		// Diferença é o comportamento ocorre quando a fila está vazia!
		// quando a fila está vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
	}

}

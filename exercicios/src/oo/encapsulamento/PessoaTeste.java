package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jonas", "Henrique", 15);
		p1.setIdade(-10); // alterar
		p1.setNome("Carlos");
		
		
		System.out.println(p1.getNome()); // ler
		System.out.println(p1.getIdade()); // ler
		System.out.println(p1.getNomeCompleto());
	}

}

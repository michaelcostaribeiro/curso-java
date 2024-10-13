package classesmetodos.desafios;

public class Pessoa {

	String nome;
	double pesoinicial;
	double pesofinal;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.pesoinicial = peso;
		this.pesofinal = peso;
	}
	
	double comer(double comida) {
		return this.pesofinal+=comida;
	}
	
	String obterPesoInicialFinal() {
		return String.format("O peso inicial era de %.1fkg e depois do jantar passou a ser"
				+" %.1fkg.", pesoinicial, pesofinal);
	}
}

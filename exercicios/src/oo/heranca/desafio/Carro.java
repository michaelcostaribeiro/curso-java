package oo.heranca.desafio;

public class Carro {

	protected final int VELOCIDADE_MAXIMA;
	protected int VelocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(VelocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			VelocidadeAtual = VELOCIDADE_MAXIMA;			
		} else {
			VelocidadeAtual += delta;
		}
	}
	
	public void frear() {
		if (VelocidadeAtual>=5) {			
		VelocidadeAtual -= 5;
		} else {
			VelocidadeAtual = 0;
		}
	}
	
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public String toString() {
		return "Velocidade atual é " + VelocidadeAtual + "Km/h.";
	}
}

package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
	
	}
}

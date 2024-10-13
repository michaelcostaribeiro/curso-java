package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Uno;

public class TesteVelocidade {
	
	public static void main(String[] args) {
		
		Carro u = new Uno(40);
		Carro f = new Ferrari(100);
		
		System.out.println(u);
		System.out.println(f);
		
		u.acelerar();
		u.acelerar();
		System.out.println(u);

		f.acelerar();
		f.acelerar();
		System.out.println(f.getDelta());

		u.frear();
		u.frear();
		System.out.println(u);
		
		f.frear();
		f.frear();
		System.out.println(f);
	}

}

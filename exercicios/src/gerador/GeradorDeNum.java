package gerador;

public class GeradorDeNum {
	
	int gera (int a) {
		int b = (int)Math.random() ;
		int a2 = 0;
		int a3 = 0;
		for(int contador = 0; contador <= a; contador++) {
		      if (contador >0) {
		    	  a2 = (int) Math.random();
		    	  a3 = (int) Math.pow(a2, contador);
		    	  b+=a3;
		}
		}
		return b;
	}

}

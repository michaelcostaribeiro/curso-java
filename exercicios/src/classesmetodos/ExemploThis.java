package classesmetodos;

public class ExemploThis {
	 
	//  Qual é a vantagem de usar um construtor dentro de outro ?

	//  A vantagem é simplificar um pouco o código de um dos construtores. 
	//  Como exemplo, vamos imaginar a seguinte classe:

	//	public class Retângulo {
	//	    private int x, y;
	//	    private int largura, altura;
		 
	//	    public Retângulo(int largura, int altura) {
	//	        this.x = 0;
	//	        this.y = 0;
	//	        this.largura = largura;
	//	        this.altura = altura;
	//	    }
	//	    public Retângulo(int x, int y, int largura, int altura) {
	//	        this.x = x;
	//	        this.y = y;
	//		        this.largura = largura;
	//	        this.altura = altura;
	//	    }
	//	    ...
	//	}
	//	Esta classe possui dois construtores, um com dois parâmetros e um com quatro. 
	//  Neste caso, a gente poderia simplificar o construtor com dois parâmetros da seguinte 
	//	maneira:

	//	public class Retângulo {
	//	    private int x, y;
	//	    private int largura, altura;
	//	 
	//	    public Retângulo(int largura, int altura) {
	//	        this(0, 0, largura, altura);
	//	    }
	//		    public Retângulo(int x, int y, int largura, int altura) {
	//	        this.x = x;
	//	        this.y = y;
	//	        this.largura = largura;
	//	        this.altura = altura;
	//	    }
	//	    ...
	//	}
}

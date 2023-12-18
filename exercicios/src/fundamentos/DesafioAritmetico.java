package fundamentos;

public class DesafioAritmetico {
	
	public static void main(String[] args) {
		
		//int a = 3 * 4 - 10;
		//int b = (int) Math.pow(a, 3);
		//double c = Math.pow(a, 3);
		
		//System.out.println(b);
		//System.out.println(c);
		
		double esquerda1 = (6 * (3 + 2));
		double esquerda2 = Math.pow(esquerda1, 2);
		double esquerda3 = 3*2;
		double esquerda4 = esquerda2 / esquerda3;
		
		System.out.println(esquerda4);
		
		
		double direita1 = (1 - 5) * (2 - 7);
		double direita2 = direita1 / 2;
		double direita3 = Math.pow(direita2, 2);
		
		System.out.println(direita3);
		
		double topo1 = esquerda4-direita3;
		System.out.println(topo1);
		
		double topo2 = Math.pow(topo1, 3);
		double baixo = Math.pow(10, 3);
		double fiinal = topo2/baixo;
		
		System.out.println(fiinal);
		
	}

}

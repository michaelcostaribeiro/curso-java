package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		System.out.println(" (6*(3+2))²\n-----------\n    3*2\n");
		
		double parte1cima = Math.pow((6*(3+2)), 2);
		double parte1baixo = 3*2;
		System.out.println("resultado = " + parte1cima );
		System.out.println("          ---------\n             " + parte1baixo);
		
		
		System.out.println("((1-5) * (2-7))²\n-----------\n     (2) \n");
		double parte2cima = Math.pow((1-5) * (2-7), 2);
		double parte2baixo = Math.pow(2, 2);
		System.out.println("resultado = " + parte2cima);
		System.out.println("          ---------\n             " + parte2baixo);
		
		
		double parte1resu = parte1cima / parte1baixo;
		System.out.println("\nresultado = " + parte1resu);
		double parte2resu = parte2cima / parte2baixo;
		System.out.println("\nresultado = " + parte2resu);
		System.out.println("\n(150 - 100)³\n-----------\n     10³ \n");
		
		double parte3cima = parte1resu - parte2resu;
		System.out.println("resultado = " + parte3cima);
		System.out.println("\n    "+ parte3cima + "³\n-----------\n    10³ \n");
		
		double resultadofinal = Math.pow(parte3cima, 3) / Math.pow(10, 3);
		System.out.println("resultado final = " + resultadofinal);
		
		
	}
}

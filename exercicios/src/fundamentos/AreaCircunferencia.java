package fundamentos;

public class AreaCircunferencia {
	//variaveis e constantes
	
	public static void main(String[] args) {
		System.out.println(2 + 3);
		double raio = 3.4;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("�rea = " + area + " m2.");
	}

}

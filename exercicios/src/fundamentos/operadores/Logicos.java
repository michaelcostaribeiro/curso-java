package fundamentos.operadores;

public class Logicos {

	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao1);
		
		System.out.println("\nTabela verdade E;");
		System.out.println("true && true = " + (true && true) + ";");
		System.out.println("true && false = " + (true && false)+ ";");
		System.out.println("false && true = " + (false && true)+ ";");
		System.out.println("false && false = " + (false && false)+ ";");
		
		System.out.println("\nTabela verdade OU (or);");
		System.out.println("true || true = " + (true || true)+ ";");
		System.out.println("true || false = " + (true || false)+ ";");
		System.out.println("false || true = " + (false || true)+ ";");
		System.out.println("false || false = " + (false || false)+ ";");
		
		System.out.println("\nTabela verdade XOR;");
		System.out.println("true ^ true = " + (true ^ true)+ ";");
		System.out.println("true ^ false = " + (true ^ false)+ ";");
		System.out.println("false ^ true = " + (false ^ true)+ ";");
		System.out.println("false ^ false = " + (false ^ false)+ ";");
		
		System.out.println("\nTabela verdade NEGAÇÃO;");
		System.out.println("!true = " + !true);
		System.out.println("!!true = " + !!true);
	}
}

package controle;

public class DesafioFor {
	
	public static void main(String[]args) {
		
		String valor2 = "#";
		for(String valor = "#"; !"######".equals(valor); valor=valor+valor2) {
			System.out.println(valor);
		}
	}

}

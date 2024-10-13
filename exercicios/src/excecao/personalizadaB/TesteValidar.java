package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidar {

	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 0);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		}catch (StringVaziaException e) {
				System.out.println(e.getMessage());
		}catch (NumeroNegativoException 
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim! :)");
		
		
		}
}


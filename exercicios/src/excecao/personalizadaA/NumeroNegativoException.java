package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{

	private String nomeDoAtributo;
	
	public NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %ss está negativo", nomeDoAtributo);
	}
	
	
}

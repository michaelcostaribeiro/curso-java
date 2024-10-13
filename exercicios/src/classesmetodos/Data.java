package classesmetodos;

public class Data {

	Integer Dia;
	Integer Mes;
	Integer Ano;
	
	Data(){
		this(1,1,1970);
	}
	
	Data(int Dia, int Mes,int Ano){
		this.Dia = Dia;
		this.Mes = Mes;
		this.Ano = Ano;
	}
	
	
	String obterDataFormatada() {
		return Dia +"/"+Mes+"/"+Ano+"\n";
	}
	String obterDataFormatada(String Dia, String Mes, String Ano) {
		return Dia +"/"+Mes+"/"+Ano+"\n";
	}
}

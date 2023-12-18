package classe;


public class DataTeste {

	public static void main(String[]args) {
		
		Data data1 = new Data(19,12,2001);
	
		Data data2 = new Data();
		System.out.println(data2.format());
		data2.dia = 15;
		data2.mes = 03;
		data2.ano = 2022;
		
		System.out.println(data1.format());
		System.out.println(data2.format());
	}
}

package fundamentos.tiposeconversoes;

public class Wrapper {
	
	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		
		Integer i = 10_000;
		Long l = 100_000L;
		
		// Integer.parseInt(entrada.next());
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
		
	}

}

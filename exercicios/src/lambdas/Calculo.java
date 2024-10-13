package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
	
	
	//Uma Interface Funcional é uma interface que possui apenas UM método ABSTRATO.
}

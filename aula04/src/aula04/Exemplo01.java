package aula04;

public class Exemplo01 {

	public static void main(String[] args) {
		String valor = "CDD4.0 - Java";
		System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CdD4.0 - JAVA") == 0 ? true : false);
	}

}

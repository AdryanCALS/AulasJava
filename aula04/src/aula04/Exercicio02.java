package aula04;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String texto_user = input.nextLine();
		
		StringTokenizer cont = new StringTokenizer(texto_user);
		
		System.out.println(cont.countTokens());
		
		input.close();
	}

}

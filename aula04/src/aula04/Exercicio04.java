package aula04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um texto para ficar maiusculo: ");
		String texto_user = sc.nextLine();
		
		System.out.println(texto_user.toUpperCase());
		sc.close();
	}

}

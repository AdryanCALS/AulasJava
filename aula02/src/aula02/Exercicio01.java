package aula02;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		System.out.println("Digite o primeiro numero:");
		Scanner entrada1 = new Scanner(System.in);
		int resp1 = entrada1.nextInt();
		
		System.out.println("Digite o segundo numero:");
		Scanner entrada2 = new Scanner(System.in);
		int resp2 = entrada2.nextInt();
		
		System.out.println("Digite o terceiro numero:");
		Scanner entrada3 = new Scanner(System.in);
		int resp3 = entrada3.nextInt();
		
		/*
		 * if(resp1>resp2 && resp1>resp3) { System.out.println(resp1); }else
		 * if { System.out.println(resp2); }else
		 * if(resp3>resp1 && resp3>resp2) { System.out.println(resp3); }
		 */
		
		/*
		 * System.out.println((resp1>resp2 && resp1>resp3) ? resp1: (resp2>resp1 &&
		 * resp2>resp3) ? resp2:resp3");
		 */
		
		
		int resultado = Math.max(Math.max(resp1,resp2), resp3);
		System.out.printf("O maior numero é: %d", resultado );
		
		entrada1.close();
		entrada2.close();
		entrada3.close();
	}

}

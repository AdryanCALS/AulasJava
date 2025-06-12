package aula03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array_a[] = new int[4];
		int array_b[] = new int[4];
		int array_c[] = new int[4];
		int array_d[] = new int[4];
		
		for(int i=0;i<array_a.length;i++) {
			System.out.printf("Digite o indice %d do array_a: ", i);
			array_a[i] = input.nextInt();
			System.out.printf("Digite o indice %d do array_b: ", i);
			array_b[i] = input.nextInt();
			System.out.printf("Digite o indice %d do array_c: ", i); 
			array_c[i] = input.nextInt();
			System.out.printf("Digite o indice %d do array_d: ", i);
			array_d[i] = input.nextInt();	 
		}
	}
}
